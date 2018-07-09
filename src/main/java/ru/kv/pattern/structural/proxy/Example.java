package ru.kv.pattern.structural.proxy;

public class Example {

	public static void main(String[] args) {
		Service service = new LogProxyService();
		
		service.getVersion();
		
		service.sum(1, 2);
		
		service.mul(2, 3);
	}
	
}
