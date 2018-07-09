package ru.kv.pattern.basic.marker;

public class CoreI7 implements X86 {

	private final String name = "Intel Core I7";
	private final int coreCount = 4;
	
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
