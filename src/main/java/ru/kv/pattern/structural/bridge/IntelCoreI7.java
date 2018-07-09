package ru.kv.pattern.structural.bridge;

public class IntelCoreI7 implements Proccessor {

	@Override
	public int sum(int a, int b) {
		return (int)sumOfLong(a, b);
	}
	
	private long sumOfLong(long a, long b) {
		return a + b;
	}

	@Override
	public float mul(float a, float b) {
		return (float)mulOfLong(a, b);
	}

	private double mulOfLong(double a, double b) {
		return a * b;
	}

	@Override
	public String toString() {
		return "Proccessor [Intel Core-i7]";
	}

}
