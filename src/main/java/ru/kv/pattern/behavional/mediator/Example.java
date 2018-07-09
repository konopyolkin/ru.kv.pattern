package ru.kv.pattern.behavional.mediator;

/**
 * Mediator (Посредник) - позволяет уменьшить связанность
 * множества классов между собой, благодаря перемещению этих
 * связей в один класс-посредник. 
 */
public class Example {

	public static void main(String[] args) {
		ConcreteMediator mediator = new ConcreteMediator();
		
		ComponentA a = new ComponentA(mediator);
		ComponentB b = new ComponentB(mediator);
		ComponentC c = new ComponentC(mediator);
		ComponentD d = new ComponentD(mediator);
		
		mediator.setComponentA(a);
		mediator.setComponentB(b);
		mediator.setComponentC(c);
		mediator.setComponentD(d);
		
		System.out.println("*** ComponentA.opetationA1 ***");
		a.operationA1();
		System.out.println();
		
		System.out.println("*** ComponentB.opetationB2 ***");
		b.operationB2();
		System.out.println();
		
		System.out.println("*** ComponentC.opetationC1 ***");
		c.operationC1();
		System.out.println();
		
		System.out.println("*** ComponentD.opetationD2 ***");
		d.operationD2();
		System.out.println();
	}

}
