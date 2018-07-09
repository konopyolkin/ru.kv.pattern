package ru.kv.pattern.split.filter.push;

public class CropImageFilter extends AbstactImageSink {

	public CropImageFilter(Sink sink) {
		super(sink);
	}

	@Override
	public void putImage(Image image) {
		image.setWidth(image.getWidth() / 2);
		image.setHeight(image.getHeight() / 2);
		System.out.println("Crop: " + image);
		super.putImage(image);
	}

}
