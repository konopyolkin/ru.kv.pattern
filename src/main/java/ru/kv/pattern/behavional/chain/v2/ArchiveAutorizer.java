package ru.kv.pattern.behavional.chain.v2;

import java.util.Arrays;
import java.util.List;

public class ArchiveAutorizer extends BaseAuthorizer {

	private static final List<Permission> PERMISSIONS = Arrays.asList(
			Permission.vip, 
			Permission.boss, 
			Permission.admin, 
			Permission.root
			); 

	@Override
	public void checkAccess(Permission permission) {
		if (PERMISSIONS.contains(permission)) {
			System.out.println("Access to the archive is allowed");
		}
		super.checkAccess(permission);
	}

}
