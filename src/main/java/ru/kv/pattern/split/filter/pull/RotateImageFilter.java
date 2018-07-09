package ru.kv.pattern.split.filter.pull;

public class RotateImageFilter extends AbstractImageFilter {

	public RotateImageFilter(Source source) {
		super(source);
	}

	@Override
	public Image getImage() {
		Image image = super.getImage();
		int width = image.getWidth();
		int height = image.getHeight();
		image.setWidth(height);
		image.setHeight(width);
		System.out.println("Rotate: " + image);
		return image;
	}

}
