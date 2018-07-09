package ru.kv.pattern.generate.prototype.v2;

public class Circle extends Shape {
	
	private int radius;

	
	public Circle() {
		super();
	}


	private Circle(Circle circle) {
		super(circle);
		if (circle != null) {
			radius = circle.radius;
		}
	}


	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}


	@Override
	public Circle clone() {
		return new Circle(this);
	}


	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", " + super.toString() + "]";
	}

}
