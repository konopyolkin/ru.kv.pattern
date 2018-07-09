package ru.kv.pattern.behavional.iterator;

public interface Collection<T> {

	public Iterator<T> createIterator();
	
	public void add(T t);
	
	public void remove(T t);
	
	public T get(int index);
	
	public void set(int index, T t);
	
}
