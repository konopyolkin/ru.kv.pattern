package ru.kv.pattern.generate.object.pool;

import java.util.concurrent.TimeUnit;

public class Computer {
	
	public void execute(Task task) {
		System.out.println("Execute: " + task);
		try {
			TimeUnit.MILLISECONDS.sleep(task.getExecutionTimeMs());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Done(" + task.getName() + ")!");
	}
	
}
