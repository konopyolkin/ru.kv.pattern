package ru.kv.pattern.split.filter.pull;

import java.util.Random;

public class ImageSource implements Source {
	
	private int index;
	private Random random;
	
	public ImageSource() {
		random = new Random();
	}

	@Override
	public Image getImage() {
		synchronized (this) {
			index++;
			int width = random.nextInt(1024);
			int height = random.nextInt(768);
			Image image = new Image(index, width, height);
			System.out.println("Source create: " + image);
			return image;
		}
	}

}
