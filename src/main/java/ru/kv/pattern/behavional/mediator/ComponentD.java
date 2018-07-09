package ru.kv.pattern.behavional.mediator;

public class ComponentD {

	public static final int OPERATION_TYPE_D1 = 1;
	public static final int OPERATION_TYPE_D2 = 2;
	
	private Mediator mediator;

	public ComponentD(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public void operationD1() {
		mediator.notify(this, OPERATION_TYPE_D1);
	}
	
	public void operationD2() {
		mediator.notify(this, OPERATION_TYPE_D2);
	}

	public void doSomething() {
		System.out.println("ComponentD do something");
	}

}
