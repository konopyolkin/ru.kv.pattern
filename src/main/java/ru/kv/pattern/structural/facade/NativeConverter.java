package ru.kv.pattern.structural.facade;

public class NativeConverter {

	public void convert(String path, String format) {
		System.out.println("Convert " + path + " to format " + format);
	}
	
	public void merge(String dest, String... paths) {
		System.out.println("Merge: ");
		for (String path : paths) {
			System.out.println(" >>> " + path);
		}
		System.out.println("Read: " + dest);
	}

}
