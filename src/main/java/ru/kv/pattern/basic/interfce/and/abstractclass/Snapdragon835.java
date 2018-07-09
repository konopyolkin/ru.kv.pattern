package ru.kv.pattern.basic.interfce.and.abstractclass;

public class Snapdragon835 extends ProccessorARM {

	private final String name = "Qualcomm Snapdragon 835";
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
