package ru.kv.pattern.structural.decorator;

import java.util.concurrent.TimeUnit;

/**
 * Decorator (Декоратор) - позволяет динамически добавлять объектам 
 * новую функциональность, оборачивая их в полезные "обёртки". 
 */
public class Example {

	public static void main(String[] args) {
		System.out.println("Limit -> Time -> Console");
		
		Logger logger = new LimitLogger(new TimeLogger(new ConsoleLogger()));
		logger.debug("Logger created");
		logger.error("Logger ERROR !!!");
		
		sleep(100);
		System.out.println();
		sleep(100);
		
		System.out.println("Time -> Limit -> Console");
		
		logger = new TimeLogger(new LimitLogger(new ConsoleLogger()));
		logger.debug("Logger created");
		logger.error("Logger ERROR !!!");

		sleep(100);
		System.out.println();
		sleep(100);

		
		System.out.println("Time -> UpperCase -> Console");

		logger = new TimeLogger(new UpperCaseLogger(new ConsoleLogger()));
		logger.debug("Logger created");
		logger.error("Logger ERROR !!!");

		sleep(100);
		System.out.println();
		sleep(100);

		
		System.out.println("UpperCase -> Time -> Console");
		
		logger = new UpperCaseLogger(new TimeLogger(new ConsoleLogger()));
		logger.debug("Logger created");
		logger.error("Logger ERROR !!!");
	}
	
	private static void sleep(long timeout) {
		try {
			TimeUnit.MILLISECONDS.sleep(timeout);
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}

}
