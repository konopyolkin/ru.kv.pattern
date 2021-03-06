package ru.kv.pattern.generate.singleton.v1;

import java.time.LocalDateTime;

/**
 * Singleton (Одиночка) - гарантирует, что у класса есть только один экземпляр,
 * и предоставляет к нему глобальную точку доступа. 
 */
public class Example {

	public static void main(String[] args) {
		President president = President.getInstance();
		
		System.out.println(president);
		
		president.setName("Trump D.J.");
		president.setBirthday(LocalDateTime.parse("1946-06-14T09:30:01"));
		
		System.out.println(president);
	}

}
