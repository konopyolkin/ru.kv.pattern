package ru.kv.pattern.behavional.visitor.v2;

public class Dot implements Shape {
	
	private long id;
	private int x;
	private int y;
	
	public Dot(int x, int y) {
		this.id = java.util.UUID.randomUUID().getMostSignificantBits();
		this.x = x;
		this.y = y;
	}

	public long getId() {
		return id;
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
		System.out.println("Draw " + this);
	}

	@Override
	public String accept(Visitor visitor) {
		return visitor.visit(this);
	}

	@Override
	public String toString() {
		return "Dot [id=" + id + ", x=" + x + ", y=" + y + "]";
	}

}
