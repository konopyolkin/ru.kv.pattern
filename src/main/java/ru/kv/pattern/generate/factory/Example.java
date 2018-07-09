package ru.kv.pattern.generate.factory;

public class Example {

	/**
	 * Factory method (фабричный метод) - предоставляет подклассам 
	 * интерфейс для создания экземпляров некоторого класса.
	 */
	
	public static void main(String[] args) {
		ProccessorFactory[] factories = new ProccessorFactory[] {
			new IntelFactory(),
			new AmdFactory()
		};
		
		for (ProccessorFactory factory : factories) {
			for (CpuType type : CpuType.values()) {
				Proccessor proccessor = factory.createProccessor(type);
				System.out.println(factory + "(" + type + ") => " + proccessor);
			}
		}
	}
	
}
