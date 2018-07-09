package ru.kv.pattern.behavional.chain.v2;

public class BaseAuthorizer implements Authorizer {

	private Authorizer next;
	
	@Override
	public void setNext(Authorizer next) {
		this.next = next;
	}

	@Override
	public void checkAccess(Permission permission) {
		if (next != null) {
			next.checkAccess(permission);
		}
	}

}
