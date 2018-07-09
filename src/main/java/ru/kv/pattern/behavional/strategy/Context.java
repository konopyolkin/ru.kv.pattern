package ru.kv.pattern.behavional.strategy;

public class Context {
	
	private Strategy strategy;
	
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public double executeStartegy(double a, double b) {
		return strategy.execute(a, b);
	}

}
