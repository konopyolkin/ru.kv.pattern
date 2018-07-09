package ru.kv.pattern.basic.abstrct.superclass;

public class Example {

	public static void main(String[] args) {
		ProccessorX86 proccessor = new CoreI7();
		System.out.println(proccessor);
		
		proccessor = new Ryzen7();
		System.out.println(proccessor);
	}
}
