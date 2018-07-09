package ru.kv.pattern.basic.marker;

public class Example {

	public static void main(String[] ard) {
		Object[] list = new Object[] {
				new CoreI7(), 
				new Snapdragon835() 
		};
		
		for (Object object : list) {
			if (object instanceof ARM) {
				System.out.println("arm: " + object);
			} else if (object instanceof X86) {
				System.out.println("x86: " + object);
			} else {
				System.out.println("unknonw: " + object);
			}
		}
	}
}
