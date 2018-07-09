package ru.kv.pattern.generate.factory;

public class IntelFactory implements ProccessorFactory {

	@Override
	public Proccessor createProccessor(CpuType type) {
		if (type == null) {
			throw new IllegalArgumentException("Invalid type: " + type);
		}
		
		switch (type) {
		case basic:
			return new CoreI3();
		case middle:
			return new CoreI5();
		case best:
			return new CoreI7();
		default:
			throw new IllegalArgumentException("Unknown type: " + type);
		}
	}

	@Override
	public String toString() {
		return "IntelFactory";
	}

}
