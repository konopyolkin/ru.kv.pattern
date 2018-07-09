package ru.kv.pattern.basic.interfce.and.abstractclass;

public class Ryzen7 extends ProccessorX86 {

	private final String name = "AMD Ryzen 7";
	private final int coreCount = 8;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getCoreCount() {
		return coreCount;
	}
}
