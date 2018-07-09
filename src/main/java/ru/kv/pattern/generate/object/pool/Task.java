package ru.kv.pattern.generate.object.pool;

public class Task {

	private String name;
	private long executionTimeMs;
	
	public Task(String name, long executionTimeMs) {
		this.name = name;
		this.executionTimeMs = executionTimeMs;
	}

	public String getName() {
		return name;
	}

	public long getExecutionTimeMs() {
		return executionTimeMs;
	}

	@Override
	public String toString() {
		return "Task [name=" + name + ", executionTime=" + executionTimeMs + "ms]";
	}
	
}
