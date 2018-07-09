package ru.kv.pattern.split.filter.pull;

public class CropImageFilter extends AbstractImageFilter {

	public CropImageFilter(Source source) {
		super(source);
	}

	@Override
	public Image getImage() {
		Image image = super.getImage();
		image.setWidth(image.getWidth() / 2);
		image.setHeight(image.getHeight() / 2);
		System.out.println("Crop: " + image);
		return image;
	}
	
}
