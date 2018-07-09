package ru.kv.pattern.structural.bridge;

public class Notebook extends BaseComputer {

	public Notebook(Proccessor proccessor) {
		super(proccessor);
	}

	@Override
	public String toString() {
		return "Notebook " + super.toString();
	}

}
