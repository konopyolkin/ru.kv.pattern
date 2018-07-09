package ru.kv.pattern.basic.interfce.and.abstractclass;

public class Example {

	public static void main(String[] args) {
		Proccessor proccessor = new CoreI7();
		System.out.println(proccessor);

		proccessor = new Ryzen7();
		System.out.println(proccessor);

		proccessor = new Snapdragon835();
		System.out.println(proccessor);

		proccessor = new MT6750();
		System.out.println(proccessor);
	}
	
}
