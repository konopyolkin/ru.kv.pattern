package ru.kv.pattern.behavional.visitor.v1;

public class XmlVisitor implements Visitor {

	public String export(Shape... shapes) {
		StringBuilder sb = new StringBuilder();
		for (Shape shape : shapes) {
			sb.append("<?xm. version=\"1.0\" encoding=\"utf-8\"?>\n");
			sb.append(shape.accept(this) + "\n\n");
		}
		return sb.toString();
	}

	@Override
	public String visitDot(Dot dot) {
		return String.format(
				"<dot>\n  <id>%x</id>\n  <x>%d</x>\n  <y>%d</y>\n</dot>",
				dot.getId(), 
				dot.getX(), 
				dot.getY()
				);
	}

	@Override
	public String visitCircle(Circle circle) {
		return String.format(
				"<circle>\n  <id>%x</id>\n  <x>%d</x>\n  <y>%d</y>\n  <radius>%d</radius>\n</circle>",
				circle.getId(), 
				circle.getX(), 
				circle.getY(), 
				circle.getRadius()
				);
	}

	@Override
	public String visitRectangle(Rectangle rectangle) {
		return String.format(
				"<rectangle>\n  <id>%x</id>\n  <x>%d</x>\n  <y>%d</y>\n"
				+ "  <width>%d</width>\n  <height>%d</height>\n</rectangle>",
				rectangle.getId(), 
				rectangle.getX(), 
				rectangle.getY(), 
				rectangle.getWidth(), 
				rectangle.getHeight()
				);
	}

	@Override
	public String visitCompoundShape(CompoundShape compoundShape) {
		StringBuilder sb = new StringBuilder();
		for (Shape shape: compoundShape.getShapes()) {
			String shapeXml = shape.accept(this);
			sb.append(shapeXml);
			sb.append("\n");
		}
		return sb.toString();
	}

}
