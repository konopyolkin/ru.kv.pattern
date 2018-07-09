package ru.kv.pattern.behavional.visitor.v2;

/**
 * Visitor (Посетитель) - позволяет добавить в программу новые операции,
 * не изменяя классы объектов, над которыми эти операции могут выполняться. 
 */
public class Example {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[] {
				new Dot(10, 20),
				new Circle(3, 4, 12),
				new Rectangle(1, 2, 640, 480)
		};
		
		CompoundShape compoundShape = new CompoundShape();
		for (Shape shape : shapes) {
			compoundShape.add(shape);
		}

		Dot dot = new Dot(123, 456);
		
		XmlVisitor xmlVisitor = new XmlVisitor();
		String xmlShapes = xmlVisitor.export(dot, compoundShape);
		System.out.println(xmlShapes);
	}

}
