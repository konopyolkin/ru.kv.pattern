package ru.kv.pattern.structural.composite;

public class Panel extends Container {

	private String layout;
	
	public Panel(String layout) {
		super();
		this.layout = layout;
	}

	@Override
	public void draw() {
		System.out.println("Draw panel (layout="+layout+"):");
		super.draw();
	}

	
}
