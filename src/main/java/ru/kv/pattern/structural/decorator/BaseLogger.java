package ru.kv.pattern.structural.decorator;

/**
 * Decorator (Декоратор) - позволяет динамически добавлять объектам 
 * новую функциональность, оборачивая их в полезные "обёртки". 
 */
public abstract class BaseLogger implements Logger {
	
	private Logger logger;
	
	public BaseLogger(Logger logger) {
		this.logger = logger;
	}

	@Override
	public void error(String msg) {
		logger.error(msg);
	}

	@Override
	public void debug(String msg) {
		logger.debug(msg);
	}

}
