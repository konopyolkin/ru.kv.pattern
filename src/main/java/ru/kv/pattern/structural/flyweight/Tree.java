package ru.kv.pattern.structural.flyweight;

import java.awt.Color;

public class Tree {
	
	private int x;
	private int y;
	private TreeType type;
	
	public Tree(int x, int y, String name, Color color, String texture) {
		this.x = x;
		this.y = y;
		this.type = TreeFactory.getInstance().getTreeType(name, color, texture);
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
	
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void draw() {
		type.draw(x, y);
	}

	@Override
	public String toString() {
		return "Tree [x=" + x + ", y=" + y + ", type=" + type + "]";
	}
	
}
