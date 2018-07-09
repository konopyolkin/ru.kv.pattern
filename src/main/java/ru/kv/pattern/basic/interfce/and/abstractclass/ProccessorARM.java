package ru.kv.pattern.basic.interfce.and.abstractclass;

public abstract class ProccessorARM implements Proccessor {

	private final String arc = "arm";
	
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
