package ru.kv.pattern.generate.factory;

public class AmdFactory implements ProccessorFactory {

	@Override
	public Proccessor createProccessor(CpuType type) {
		if (type == null) {
			throw new IllegalArgumentException("Invalid type: " + type);
		}
		
		switch (type) {
		case basic:
			return new Ryzen3();
		case middle:
			return new Ryzen5();
		case best:
			return new Ryzen7();
		default:
			throw new IllegalArgumentException("Unknown type: " + type);
		}
	}

	@Override
	public String toString() {
		return "AmdFactory";
	}

}
