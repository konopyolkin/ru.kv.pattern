package ru.kv.pattern.structural.flyweight;

import java.awt.Color;

public class TreeType {

	private String name;
	private Color color;
	private String texture;
	
	public TreeType(String name, Color color, String texture) {
		this.name = name;
		this.color = color;
		this.texture = texture;
	}
	
	public String getName() {
		return name;
	}

	public Color getColor() {
		return color;
	}

	public String getTexture() {
		return texture;
	}

	public void draw(int x, int y) {
		System.out.println("Draw x=" + x + ",y=" + y + " => " + toString());
	}

	@Override
	public String toString() {
		return "TreeType [name=" + name + ", color=" + color + ", texture=" + texture + "]";
	}

}
