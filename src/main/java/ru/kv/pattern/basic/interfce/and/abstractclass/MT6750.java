package ru.kv.pattern.basic.interfce.and.abstractclass;

public class MT6750 extends ProccessorARM {

	private final String name = "Mediatek MT6750";
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
