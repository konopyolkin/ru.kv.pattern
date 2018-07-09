package ru.kv.pattern.behavional.visitor.v1;

/**
 * Visitor (Посетитель) - позволяет добавить в программу новые операции,
 * не изменяя классы объектов, над которыми эти операции могут выполняться. 
 */
public interface Visitor {

	public String visitDot(Dot dot);
	
	public String visitCircle(Circle circle);
	
	public String visitRectangle(Rectangle rectangle);
	
	public String visitCompoundShape(CompoundShape compoundShape);
	
}
