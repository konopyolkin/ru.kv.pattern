package ru.kv.pattern.basic.abstrct.superclass;

public class CoreI7 extends ProccessorX86 {

	private final String name = "Intel Core I7";
	private final int coreCount = 4;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getCoreCount() {
		return coreCount;
	}
}
