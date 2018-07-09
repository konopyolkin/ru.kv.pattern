package ru.kv.pattern.structural.composite;

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
	public void draw() {
		System.out.println("Draw circle(x=" + getX()
			+ ", y=" + getY()
			+ ", radius=" + radius+")");
	}

}
