package ru.kv.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Container implements Element {

	private List<Element> childrens;

	public Container() {
		childrens = new ArrayList<>();
	}
	
	public void add(Element children) {
		childrens.add(children);
	}
	
	public void remove(Element children) {
		childrens.remove(children);
	}

	@Override
	public void move(int x, int y) {
		if (childrens.isEmpty()) {
			return;
		}
		
		for (Element children : childrens) {
			if (children != null) {
				children.move(x, y);
			}
		}
	}

	@Override
	public void draw() {
		if (childrens.isEmpty()) {
			return;
		}
		
		System.out.println("Draw container: ");
		System.out.println("=== === ===");
		for (Element children : childrens) {
			if (children != null) {
				children.draw();
			}
		}
		System.out.println("=== === ===");
	}
	
}
