package ru.kv.pattern.split.filter.push;


public class RotateImageFilter extends AbstactImageSink {

	public RotateImageFilter(Sink sink) {
		super(sink);
	}

	@Override
	public void putImage(Image image) {
		int width = image.getWidth();
		int height = image.getHeight();
		image.setWidth(height);
		image.setHeight(width);
		System.out.println("Rotate: " + image);
		super.putImage(image);
	}

	
}
