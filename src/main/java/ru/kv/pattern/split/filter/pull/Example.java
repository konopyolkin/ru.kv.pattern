package ru.kv.pattern.split.filter.pull;

public class Example {

	public static void main(String[] args) {
		Source source = new ImageSource();
		Source filter = new RotateImageFilter(new CropImageFilter(source));
		
		for (int i = 0; i < 10; i++) {
			System.out.println(filter.getImage());
			System.out.println();
		}
	}
	
}
