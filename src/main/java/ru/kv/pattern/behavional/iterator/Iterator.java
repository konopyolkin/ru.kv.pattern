package ru.kv.pattern.behavional.iterator;

/**
 * Iterator (Итератор) - дает возможность последовательно обходить
 * элементы составных объектов, не раскрывая их внутреннего представления. 
 */
public interface Iterator<T> {

	public boolean hasMore();
	
	public T getNext();
	
}
