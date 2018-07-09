package ru.kv.pattern.generate.prototype.v1;

import java.awt.Color;

public abstract class Shape implements Cloneable {
	
	
	private int x;
	private int y;
	private Color color;
	
	
	public Shape() {
		super();
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


	@Override
	public Shape clone() {
		try {
			return (Shape)super.clone();
		} catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}
	}

	
	@Override
	public String toString() {
		return "Shape [x=" + x + ", y=" + y + ", color=" + color + "]";
	}
	
}
