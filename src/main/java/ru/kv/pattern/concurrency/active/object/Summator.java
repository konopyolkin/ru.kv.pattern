package ru.kv.pattern.concurrency.active.object;

public interface Summator {
	
	public void add(double value) throws InterruptedException;
	
	public void mul(double value) throws InterruptedException;
	
	public void finish() throws InterruptedException;
	
	public void addSummatorListener(SummatorListener l);
	
	public void removeSummatorListener(SummatorListener l);
	
}
