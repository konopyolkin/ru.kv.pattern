package ru.kv.pattern.generate.prototype.v1;

public class Circle extends Shape {
	
	
	private int radius;
	
	
	public Circle() {
		super();
	}
	
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}


	@Override
	public Circle clone() {
		return (Circle)super.clone();
	}

	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", " + super.toString() + "]";
	}

}
