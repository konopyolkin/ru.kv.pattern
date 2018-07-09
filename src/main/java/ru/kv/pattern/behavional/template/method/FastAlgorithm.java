package ru.kv.pattern.behavional.template.method;

public class FastAlgorithm extends Algorithm {

	public FastAlgorithm() {
		super();
	}

	@Override
	public void step2() {
		System.out.println("Fast step2");
	}

	@Override
	public void step3() {
		System.out.println("Fast step3");
	}

	@Override
	public void step4() {
		System.out.println("Fast step4");
	}

	public void step5() {
		System.out.println("Fast step5");
	}

}
