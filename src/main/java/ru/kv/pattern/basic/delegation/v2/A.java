package ru.kv.pattern.basic.delegation.v2;

public class A implements I {

	@Override
	public void f() {
		System.out.println("Call A->f()");
	}

	@Override
	public void g() {
		System.out.println("Call A->g()");
	}

}
