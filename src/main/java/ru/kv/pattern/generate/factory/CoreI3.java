package ru.kv.pattern.generate.factory;

public class CoreI3 implements Proccessor {

	private final String name = "Intel Core I3";
	private final int coreCount = 2;
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