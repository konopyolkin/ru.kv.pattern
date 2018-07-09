package ru.kv.pattern.generate.object.pool;

public interface ComputerPool {

	public void setMaxPoolSize(int size);
	public int getMaxPoolSize();

	public Computer acquireComputer();
	public void releaseComputer(Computer computer);	
	
}
