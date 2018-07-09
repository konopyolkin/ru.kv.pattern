package ru.kv.pattern.behavional.mediator;

public class ComponentC {

	public static final int OPERATION_TYPE_C1 = 1;
	public static final int OPERATION_TYPE_C2 = 2;
	
	private Mediator mediator;

	public ComponentC(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public void operationC1() {
		mediator.notify(this, OPERATION_TYPE_C1);
	}
	
	public void operationC2() {
		mediator.notify(this, OPERATION_TYPE_C2);
	}

	public void doSomething() {
		System.out.println("ComponentC do something");
	}

}
