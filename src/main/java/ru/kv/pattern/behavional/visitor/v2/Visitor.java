package ru.kv.pattern.behavional.visitor.v2;

/**
 * Visitor (Посетитель) - позволяет добавить в программу новые операции,
 * не изменяя классы объектов, над которыми эти операции могут выполняться. 
 */
public interface Visitor {

	public String visit(Dot dot);

	public String visit(Circle circle);

	public String visit(Rectangle rectangle);

	public String visit(CompoundShape compoundShape);
	
}
