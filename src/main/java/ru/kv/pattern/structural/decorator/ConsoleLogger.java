package ru.kv.pattern.structural.decorator;


public class ConsoleLogger implements Logger {

	@Override
	public void error(String msg) {
		System.err.println(msg);
		System.err.flush();
	}

	@Override
	public void debug(String msg) {
		System.out.println(msg);
		System.out.flush();
	}

}
