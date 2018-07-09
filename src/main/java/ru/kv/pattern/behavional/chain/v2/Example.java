package ru.kv.pattern.behavional.chain.v2;

/**
 * Chain of responsibility (Цепочка обязанностей) - позволяет
 * передавать запросы последовательно по цепочке обработчиков.
 * Каждый последующий обработчик решает, может ли он обработать
 * запрос сам и стоит ли передавать запрос по цепи. 
 */
public class Example {

	public static void main(String[] args) {
		Authorizer a1 = new GeneralFunctionAutorizer();
		Authorizer a2 = new ArchiveAutorizer();
		Authorizer a3 = new DatabaseAuthorizer();
		
		a1.setNext(a2);
		a2.setNext(a3);
		
		System.out.println("*** User ***");
		a1.checkAccess(Permission.user);
		System.out.println();

		System.out.println("*** Boss ***");
		a1.checkAccess(Permission.boss);
		System.out.println();
		
		System.out.println("*** Admin ***");
		a1.checkAccess(Permission.admin);
		System.out.println();
}
	
}
