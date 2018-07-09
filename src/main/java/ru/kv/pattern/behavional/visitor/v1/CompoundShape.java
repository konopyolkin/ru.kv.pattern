package ru.kv.pattern.behavional.visitor.v1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompoundShape implements Shape {
	
	private long id;
	private List<Shape> shapes;

	public CompoundShape() {
		id = java.util.UUID.randomUUID().getMostSignificantBits();
		shapes = new ArrayList<>();
	}
	
	public void add(Shape shape) {
		shapes.add(shape);
	}
	
	public boolean remove(Shape shape) {
		return shapes.remove(shape);
	}
	
	public boolean isEmpty() {
		return shapes.isEmpty();
	}
	
	public List<Shape> getShapes() {
		return new ArrayList<>(shapes);
	}

	@Override
	public void move(int x, int y) {
		for (Shape shape : shapes) {
			shape.move(x, y);
		}
	}

	@Override
	public void draw() {
		System.out.println("Draw " + this);
	}

	@Override
	public String accept(Visitor visitor) {
		return visitor.visitCompoundShape(this);
	}

	@Override
	public String toString() {
		return "CompoundShape [id=" + id 
				+ ", shapes=" + Arrays.toString(shapes.toArray()) 
				+ "]";
	}

}
