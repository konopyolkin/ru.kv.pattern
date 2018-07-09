package ru.kv.pattern.split.filter.push;

public class ImageSink implements Sink {

	@Override
	public void putImage(Image image) {
		System.out.println("ImageSink: " + image);
	}

}
