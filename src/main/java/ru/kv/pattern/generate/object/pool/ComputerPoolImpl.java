package ru.kv.pattern.generate.object.pool;

import java.util.ArrayList;
import java.util.List;

public class ComputerPoolImpl implements ComputerPool {
	
	public static final int DEFAULT_MAX_POOL_SIZE = 5;
	
	private static final ComputerPool instance = new ComputerPoolImpl();
	
	private int maxPoolSize = DEFAULT_MAX_POOL_SIZE;
	private List<BusyComputer> computers;

	
	private ComputerPoolImpl() {
		super();
		computers = new ArrayList<>();
	}
	
	public static ComputerPool getInstance() {
		return instance;
	}

	
	@Override
	public void setMaxPoolSize(int size) {
		maxPoolSize = size;
	}

	@Override
	public int getMaxPoolSize() {
		return maxPoolSize;
	}

	@Override
	public Computer acquireComputer() {
		do {
			synchronized (computers) {

				if (!computers.isEmpty()) {
					for (BusyComputer computer : computers) {
						if (computer != null && !computer.isBusy()) {
							computer.setBusy(true);
							return computer;
						}
					}
				}

				if (computers.size() < maxPoolSize) {
					BusyComputer computer = new BusyComputer(true);
					computers.add(computer);
					return computer;
				}
			
				try {
					computers.wait(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
					Thread.currentThread().interrupt();
					return null;
				}
				
				try {
					computers.wait(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
					Thread.currentThread().interrupt();
					return null;
				}
			}
		} while (true);
	}
	
	@Override
	public void releaseComputer(Computer computer) {
		if (computer == null) {
			return;
		}
		
		synchronized (computers) {
			if (computers.contains(computer)) {
				((BusyComputer)computer).setBusy(false);
				computers.notify();
			}
		}
		
	}

	
	private class BusyComputer extends Computer {
		private boolean busy;

		public BusyComputer(boolean busy) {
			super();
			this.busy = busy;
		}

		public boolean isBusy() {
			return busy;
		}

		public void setBusy(boolean busy) {
			this.busy = busy;
		}
	}
	
}
