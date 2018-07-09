package ru.kv.pattern.structural.proxy;

public class MathService implements Service {
	
	private final String version = "1.0.0";

	@Override
	public String getVersion() {
		return version;
	}

	@Override
	public int sum(int a, int b) {
		return a + b;
	}

	@Override
	public int mul(int a, int b) {
		return a * b;
	}

}
