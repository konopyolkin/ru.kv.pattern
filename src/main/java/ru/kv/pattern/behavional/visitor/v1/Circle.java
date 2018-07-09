package ru.kv.pattern.behavional.visitor.v1;

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
		return visitor.visitCircle(this);
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
