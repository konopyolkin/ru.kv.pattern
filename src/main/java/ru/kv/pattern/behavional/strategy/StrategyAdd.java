package ru.kv.pattern.behavional.strategy;

public class StrategyAdd implements Strategy {

	@Override
	public double execute(double a, double b) {
		return a + b;
	}

	@Override
	public String toString() {
		return "StrategyAdd";
	}
	
}
