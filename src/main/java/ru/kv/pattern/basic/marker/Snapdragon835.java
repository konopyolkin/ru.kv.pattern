package ru.kv.pattern.basic.marker;

public class Snapdragon835 implements ARM {

	private final String name = "Qualcomm Snapdragon 835";
	private final int coreCount = 8;

	public String getName() {
		return name;
	}

	public int getCoreCount() {
		return coreCount;
	}

	@Override
	public String toString() {
		return "Proccessor [name=" + name + ", coreCount=" + coreCount + "]";
	}
	
}
