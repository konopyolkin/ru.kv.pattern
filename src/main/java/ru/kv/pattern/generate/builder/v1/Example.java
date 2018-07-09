package ru.kv.pattern.generate.builder.v1;

public class Example {

	/**
	 * Builder (Строитель) - предоставляет способ создания составного объекта 
	 */
	public static void main(String[] args) {
		Proccessor proccessor = new Proccessor.Builder("Intel Core-i7")
				.coreCount(4)
				.threadCount(8)
				.cacheCount(3)
				.baseFrequency(4)
				.turboFrequency(5)
				.cache(12)
				.build();
		
		System.out.println(proccessor);
	}
}
