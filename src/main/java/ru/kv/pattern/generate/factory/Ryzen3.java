package ru.kv.pattern.generate.factory;

public class Ryzen3 implements Proccessor {

	private final String name = "AMD Ryzen 3";
	private final int coreCount = 4;
	private final String arc = "x86 (64bit)";

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getCoreCount() {
		return coreCount;
	}

	@Override
	public String getArchitecture() {
		return arc;
	}

	@Override
	public String toString() {
		return "Proccessor [name=" + name + ", coreCount=" + coreCount + ", arc=" + arc + "]";
	}

}
