package ru.kv.pattern.behavional.visitor.v1;

public class Rectangle extends Dot {

	private int width;
	private int height;
	
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	@Override
	public String accept(Visitor visitor) {
		return visitor.visitRectangle(this);
	}
	
	@Override
	public String toString() {
		return "Rectangle [id=" + getId() 
			+ ", x=" + getX() 
			+ ", y=" + getY() 
			+ ", width=" + width 
			+ ", height=" + height 
			+ "]";
	}

}
