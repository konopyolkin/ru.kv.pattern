package ru.kv.pattern.structural.decorator;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeLogger extends BaseLogger {
	
	private DateTimeFormatter formatter;
	

	public TimeLogger(Logger logger) {
		super(logger);
		formatter = DateTimeFormatter.ofPattern("EE, yyyy-MM-dd HH:mm:ss.SSS");
	}

	@Override
	public void error(String msg) {
		String timeMsg = formatter.format(LocalDateTime.now()) + ": " + msg;  
		super.error(timeMsg);
	}

	@Override
	public void debug(String msg) {
		String timeMsg = formatter.format(LocalDateTime.now()) + ": " + msg;  
		super.debug(timeMsg);
	}
	
}
