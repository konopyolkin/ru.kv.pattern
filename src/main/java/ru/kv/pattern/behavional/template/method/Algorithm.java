package ru.kv.pattern.behavional.template.method;

/**
 * Template method (Шаблонный метод) - определяет скелет алгоритма,
 * перекладывая ответственность за некоторые его шаги на подклассы.
 * Паттерн  позволяет  подклассам  переопределять  шаги  алгоритма, 
 * не меняя его общей структуры. 
 */
public abstract class Algorithm {

	/** Шаблонный метод */
	public final void execute() {
		step1();
		step2();
		step3();
		step4();
		step5();
	}
	
	/** Шаг-1 с реализацией по умолчанию */
	public void step1() {
		System.out.println("Base step1");
	}

	public abstract void step2();

	public abstract void step3();

	/** Шаг-2 с реализацией по умолчанию */
	public void step4() {
		System.out.println("Base step4");
	}

	public abstract void step5();
	
}
