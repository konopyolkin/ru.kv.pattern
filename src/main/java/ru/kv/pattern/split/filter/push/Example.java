package ru.kv.pattern.split.filter.push;

import java.util.Random;

public class Example {

	public static void main(String[] args) {
		Sink sink = new ImageSink();
		
		Sink filter = new CropImageFilter(new RotateImageFilter(sink));
		
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			Image image = new Image(i, random.nextInt(1024), random.nextInt(768));
			System.out.println("Create: " + image);
			filter.putImage(image);
			System.out.println();
		}
	}

}
