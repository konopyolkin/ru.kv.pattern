package ru.kv.pattern.split.filter.pull;

public class Image {
	
	private int id;
	private int width;
	private int height;
	
	public Image() {
		super();
	}

	public Image(int id, int width, int height) {
		super();
		this.id = id;
		this.width = width;
		this.height = height;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Image [id=" + id + ", width=" + width + ", height=" + height + "]";
	}

}
