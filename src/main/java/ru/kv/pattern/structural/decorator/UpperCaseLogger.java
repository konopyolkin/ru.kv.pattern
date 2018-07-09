package ru.kv.pattern.structural.decorator;

public class UpperCaseLogger extends BaseLogger {

	public UpperCaseLogger(Logger logger) {
		super(logger);
	}

	@Override
	public void error(String msg) {
		String upperCaseMsg = msg.toUpperCase();
		super.error(upperCaseMsg);
	}

	@Override
	public void debug(String msg) {
		String upperCaseMsg = msg.toUpperCase();
		super.debug(upperCaseMsg);
	}

	
}
