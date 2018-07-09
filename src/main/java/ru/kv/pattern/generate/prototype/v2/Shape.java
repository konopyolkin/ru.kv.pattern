package ru.kv.pattern.generate.prototype.v2;

import java.awt.Color;


public abstract class Shape {
	
	
	private int x;
	private int y;
	private Color color;

	
	public Shape() {
	}
	
	protected Shape(Shape shape) {
		if (shape != null) {
			x = shape.x;
			y = shape.y;
			color = shape.color;
		}
	}


	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	
	public abstract Shape clone();
	

	@Override
	public String toString() {
		return "Shape [x=" + x + ", y=" + y + ", color=" + color + "]";
	}
}
