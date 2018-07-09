package ru.kv.pattern.generate.prototype.v2;

public class Rectangle extends Shape {
	
	private int width;
	private int height;

	
	public Rectangle() {
	}
	
	
	private Rectangle(Rectangle rectangle) {
		super(rectangle);
		if (rectangle != null) {
			width = rectangle.width;
			height = rectangle.height;
		}
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
	public Rectangle clone() {
		return new Rectangle(this);
	}


	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", " + super.toString() + "]";
	}
	
}
