package ru.kv.pattern.generate.factory;

/**
 * Factory method (фабричный метод) - предоставляет подклассам 
 * интерфейс для создания экземпляров некоторого класса.
 */
public interface ProccessorFactory {

	public Proccessor createProccessor(CpuType type);
	
}
