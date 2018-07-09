package ru.kv.pattern.behavional.template.method;

public class SafeAlgorithm extends Algorithm {

	public SafeAlgorithm() {
		super();
	}

	@Override
	public void step2() {
		System.out.println("Safe step2");
	}

	@Override
	public void step3() {
		System.out.println("Safe step3");
	}

	@Override
	public void step5() {
		System.out.println("Safe step4");
	}

}
