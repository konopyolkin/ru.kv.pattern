package ru.kv.pattern.structural.composite;

public class Dot implements Element {
	
	private int x;
	private int y;

	public Dot(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public void move(int x, int y) {
		this.x += x;
		this.y += y;
	}

	@Override
	public void draw() {
		System.out.println("Draw dot("+x+","+y+")");
	}

}
