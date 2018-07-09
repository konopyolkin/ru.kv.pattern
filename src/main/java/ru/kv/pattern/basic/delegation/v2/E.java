package ru.kv.pattern.basic.delegation.v2;

public class E implements I {
	
	private I base;

	public E() {
		base = new A();
	}

	@Override
	public void f() {
		base.f();
	}

	@Override
	public void g() {
		base.g();
	}

	public void switchToA() {
		base = new A();
	}
	
	public void switchToB() {
		base = new B();
	}
	
	public static void main(String[] args) {
		E e = new E();
		e.f();
		e.g();
		
		e.switchToB();
		e.f();
		e.g();
		
		e.switchToA();
		e.f();
		e.g();
	}
}
