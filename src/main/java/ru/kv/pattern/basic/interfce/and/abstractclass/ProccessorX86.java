package ru.kv.pattern.basic.interfce.and.abstractclass;

public abstract class ProccessorX86 implements Proccessor {
	
	private final String arc = "x86";

	@Override
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
