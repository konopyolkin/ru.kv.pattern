package ru.kv.pattern.basic.abstrct.superclass;

public abstract class ProccessorX86 {
	
	private final String arc = "x86";

	public abstract String getName();
	
	public abstract int getCoreCount();

	public final String getArchitecture() {
		return arc;
	}
	
	@Override
	public String toString() {
		return "Proccessor [name=" + getName() 
		+ ", coreCount=" + getCoreCount() 
		+ ", arc=" + getArchitecture() 
		+ "]";
	}
}
