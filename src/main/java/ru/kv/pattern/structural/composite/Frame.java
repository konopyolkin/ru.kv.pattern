package ru.kv.pattern.structural.composite;

public class Frame extends Container {

	private int screenX;
	private int screenY;
	
	public Frame(int screenX, int screenY) {
		this.screenX = screenX;
		this.screenY = screenY;
	}

	public int getScreenX() {
		return screenX;
	}

	public int getScreenY() {
		return screenY;
	}

	@Override
	public void draw() {
		System.out.println("Draw frame (screen: x="+screenX+", y="+screenY+"): ");
		super.draw();
	}

}
