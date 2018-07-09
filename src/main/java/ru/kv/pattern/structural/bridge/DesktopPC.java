package ru.kv.pattern.structural.bridge;

public class DesktopPC extends BaseComputer {

	public DesktopPC(Proccessor proccessor) {
		super(proccessor);
	}

	public int diff(int a, int b) {
		return proccessor.sum(a, -b);
	}

	@Override
	public String toString() {
		return "DesktopPC " + super.toString();
	}
	
}
