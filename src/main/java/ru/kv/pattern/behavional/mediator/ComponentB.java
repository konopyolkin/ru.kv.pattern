package ru.kv.pattern.behavional.mediator;

public class ComponentB {

	public static final int OPERATION_TYPE_B1 = 1;
	public static final int OPERATION_TYPE_B2 = 2;
	
	private Mediator mediator;

	public ComponentB(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public void operationB1() {
		mediator.notify(this, OPERATION_TYPE_B1);
	}
	
	public void operationB2() {
		mediator.notify(this, OPERATION_TYPE_B2);
	}

	public void doSomething() {
		System.out.println("ComponentB do something");
	}

}
