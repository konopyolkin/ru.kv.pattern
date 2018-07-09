package ru.kv.pattern.behavional.template.method;

/**
 * Template method (Шаблонный метод) - определяет скелет алгоритма,
 * перекладывая ответственность за некоторые его шаги на подклассы.
 * Паттерн  позволяет  подклассам  переопределять  шаги  алгоритма, 
 * не меняя его общей структуры. 
 */
public class Example {

	public static void main(String[] args) {
		Algorithm algorithm = new FastAlgorithm();
		algorithm.execute();
		
		System.out.println();
		
		algorithm = new SafeAlgorithm();
		algorithm.execute();
	}

}
