package ru.kv.pattern.structural.facade;

/**
 * Facade (Фасад) - предоставляет простой интерфейс 
 * к сложной системе классов, библиотеке или фреймворку. 
 */
public interface VideoPlayer {

	public void openFile(String path);
	
	public void play();
	
	public void pause();
	
	public void stop();
	
	public void convert(String path, String format);
	
	public void merge(String dest, String... path);
	
	public void applyFilter(String filterType);

}
