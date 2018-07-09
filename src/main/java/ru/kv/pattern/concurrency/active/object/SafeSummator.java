package ru.kv.pattern.concurrency.active.object;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class SafeSummator implements Summator {

	private volatile double sum;
	private final BlockingQueue<Runnable> dispatchQueue;
	private final List<SummatorListener> listeners;
	private Thread thread;
	
	public SafeSummator() {
		dispatchQueue = new LinkedBlockingQueue<>();
		listeners = new LinkedList<>();
	}
	
	public void init() {
		thread = new Thread(() -> {
			while (!Thread.currentThread().isInterrupted()) {
				try {
					if (!dispatchQueue.isEmpty()) {
						dispatchQueue.take().run();
					} else {
						synchronized (Thread.currentThread()) {
							Thread.currentThread().wait(100);
						}
					}
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
		});
		thread.start();
	}
	
	@Override
	public void finish() throws InterruptedException {
		if (!dispatchQueue.isEmpty()) {
			synchronized (thread) {
				thread.wait(1000);
			}
		}
		
		fireResult();
		
		sum = 0d;
	}

	public void destroy() {
		if (thread != null) {
			thread.interrupt();
		}
	}

	@Override
	public void add(double value) throws InterruptedException {
		dispatchQueue.put(() -> sum += value);
		synchronized (thread) {
			thread.notify();
		}
	}

	@Override
	public void mul(double value) throws InterruptedException {
		dispatchQueue.put(() -> sum *= value);
		synchronized (thread) {
			thread.notify();
		}
	}

	@Override
	public void addSummatorListener(SummatorListener l) {
		listeners.add(l);
	}

	@Override
	public void removeSummatorListener(SummatorListener l) {
		listeners.remove(l);
	}
	
	private void fireResult() {
		for (SummatorListener listener : listeners) {
			listener.result(sum);
		}
	}

}
