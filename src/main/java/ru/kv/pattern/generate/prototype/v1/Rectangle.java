package ru.kv.pattern.generate.prototype.v1;

public class Rectangle extends Shape {

	private int width;
	private int height;
	
	public Rectangle() {
		super();
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
		return (Rectangle)super.clone();
	}


	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", " + super.toString() + "]";
	}
	
}
