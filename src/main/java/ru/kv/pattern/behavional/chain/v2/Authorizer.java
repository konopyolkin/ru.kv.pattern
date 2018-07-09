package ru.kv.pattern.behavional.chain.v2;

public interface Authorizer {

	public void setNext(Authorizer authorizer);
	
	public void checkAccess(Permission permission);
}
