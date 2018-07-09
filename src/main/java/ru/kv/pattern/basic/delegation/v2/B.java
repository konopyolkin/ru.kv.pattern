package ru.kv.pattern.basic.delegation.v2;

public class B implements I {

	@Override
	public void f() {
		System.out.println("Call B->f()");
	}

	@Override
	public void g() {
		System.out.println("Call B->g()");
	}

}
