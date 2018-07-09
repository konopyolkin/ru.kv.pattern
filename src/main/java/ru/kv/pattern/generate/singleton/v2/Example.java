package ru.kv.pattern.generate.singleton.v2;

import java.time.LocalDateTime;

public class Example {

	public static void main(String[] args) {
		President president = President.INSTANCE;
		
		System.out.println(president);
		
		president.setName("Trump D.J.");
		president.setBirthday(LocalDateTime.parse("1946-06-14T09:30:01"));
		
		System.out.println(president);
	}

}
