package ru.kv.pattern.behavional.mediator;

public class ComponentA {
	
	public static final int OPERATION_TYPE_A1 = 1;
	public static final int OPERATION_TYPE_A2 = 2;
	
	private Mediator mediator;

	public ComponentA(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public void operationA1() {
		mediator.notify(this, OPERATION_TYPE_A1);
	}
	
	public void operationA2() {
		mediator.notify(this, OPERATION_TYPE_A2);
	}

	public void doSomething() {
		System.out.println("ComponentA do something");
	}
	
}
