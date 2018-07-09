package ru.kv.pattern.generate.object.pool;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Example {
	
	private static final AtomicInteger index = new AtomicInteger(0);

	public static void main(String[] args) {
		final Random random = new Random();
		
		final ComputerPool computerPool = ComputerPoolImpl.getInstance();
		
		for (int i = 0; i < 100; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					String name = "Task-" + index.getAndIncrement();
					
					Computer computer = computerPool.acquireComputer();
					computer.execute(new Task(name, random.nextInt(100)));
					computerPool.releaseComputer(computer);
				}
			}).start();
		}
	}
	
}
