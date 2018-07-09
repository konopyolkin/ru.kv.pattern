package ru.kv.pattern.behavional.visitor.v2;

public class Circle extends Dot {

	private int radius;

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	@Override
	public String accept(Visitor visitor) {
		return visitor.visit(this);
	}

	@Override
	public String toString() {
		return "Circle [id=" + getId() 
			+ ", x=" + getX() 
			+ ", y=" + getY() 
			+ ", radius=" + radius 
			+ "]";
	}

}
