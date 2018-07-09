package ru.kv.pattern.behavional.mediator;

/**
 * Mediator (Посредник) - позволяет уменьшить связанность
 * множества классов между собой, благодаря перемещению этих
 * связей в один класс-посредник. 
 */
public class ConcreteMediator implements Mediator {

	private ComponentA componentA;
	private ComponentB componentB;
	private ComponentC componentC;
	private ComponentD componentD;
	
	public ConcreteMediator() {
		super();
	}
	
	public ComponentA getComponentA() {
		return componentA;
	}
	public void setComponentA(ComponentA componentA) {
		this.componentA = componentA;
	}

	public ComponentB getComponentB() {
		return componentB;
	}
	public void setComponentB(ComponentB componentB) {
		this.componentB = componentB;
	}

	public ComponentC getComponentC() {
		return componentC;
	}
	public void setComponentC(ComponentC componentC) {
		this.componentC = componentC;
	}

	public ComponentD getComponentD() {
		return componentD;
	}
	public void setComponentD(ComponentD componentD) {
		this.componentD = componentD;
	}

	@Override
	public void notify(Object source, int type) {
		if (source instanceof ComponentA) {
			switch (type) {
			case ComponentA.OPERATION_TYPE_A1:
				reactOnA1();
				return;
			case ComponentA.OPERATION_TYPE_A2:
				reactOnA2();
				return;
			default:
				return;
			}
		}
		
		if (source instanceof ComponentB) {
			switch (type) {
			case ComponentB.OPERATION_TYPE_B1:
				reactOnB1();
				return;
			case ComponentB.OPERATION_TYPE_B2:
				reactOnB2();
				return;
			default:
				return;
			}
		}

		if (source instanceof ComponentC) {
			switch (type) {
			case ComponentC.OPERATION_TYPE_C1:
				reactOnC1();
				return;
			case ComponentC.OPERATION_TYPE_C2:
				reactOnC2();
				return;
			default:
				return;
			}
		}

		if (source instanceof ComponentD) {
			switch (type) {
			case ComponentD.OPERATION_TYPE_D1:
				reactOnD1();
				return;
			case ComponentD.OPERATION_TYPE_D2:
				reactOnD2();
				return;
			default:
				return;
			}
		}

	}

	public void reactOnA1() {
		componentB.doSomething();
		componentC.doSomething();
	}

	public void reactOnA2() {
		componentD.doSomething();
		componentB.doSomething();		
	}

	public void reactOnB1() {
		componentC.doSomething();
	}

	public void reactOnB2() {
		componentB.doSomething();		
	}

	public void reactOnC1() {
		componentB.doSomething();
		componentA.doSomething();
		componentD.doSomething();
	}

	public void reactOnC2() {
		componentD.doSomething();		
		componentA.doSomething();		
		componentB.doSomething();		
	}

	public void reactOnD1() {
		componentA.doSomething();
		componentD.doSomething();
	}

	public void reactOnD2() {
		componentA.doSomething();		
		componentB.doSomething();		
	}

}
