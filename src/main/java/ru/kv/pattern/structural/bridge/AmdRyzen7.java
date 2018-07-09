package ru.kv.pattern.structural.bridge;

public class AmdRyzen7 implements Proccessor {

	@Override
	public int sum(int a, int b) {
		return a + b;
	}

	@Override
	public float mul(float a, float b) {
		return a * b;
	}

	@Override
	public String toString() {
		return "Proccessor [AMD Ryzen 7]";
	}

}
