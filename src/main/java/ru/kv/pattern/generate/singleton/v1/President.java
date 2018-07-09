package ru.kv.pattern.generate.singleton.v1;

import java.time.LocalDateTime;

/**
 * Singleton (Одиночка) - гарантирует, что у класса есть только один экземпляр,
 * и предоставляет к нему глобальную точку доступа. 
 */
public class President {
	
	private static final President INSTANCE = new President();
	
	private String name = "Putin V.V.";
	private LocalDateTime birthday = LocalDateTime.parse("1952-10-07T12:01:07");

	
	public static President getInstance() {
		return INSTANCE;
	}
	
	
	private President() {
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public LocalDateTime getBirthday() {
		return birthday;
	}
	
	public void setBirthday(LocalDateTime birthday) {
		this.birthday = birthday;
	}

	
	@Override
	public String toString() {
		return "President [name=" + name + ", birthday=" + birthday + "]";
	}
	
}
