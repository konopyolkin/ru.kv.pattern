package ru.kv.pattern.structural.proxy;

/**
 * Proxy (заместитель) - представляет объект, который контролирует 
 * доступ к другому объекту, перехватывая все вызовы
 * (выполняет функцию контейнера) 
 */
public class LogProxyService implements Service {
	
	private Service service;
	
	public LogProxyService() {
		service = new MathService();
	}

	@Override
	public String getVersion() {
		System.out.println("Call getVersion");
		String version = service.getVersion();
		System.out.println("Version: " + version);
		return version;
	}

	@Override
	public int sum(int a, int b) {
		System.out.println("Call sum: a="+a+", b="+b);
		int s = service.sum(a, b);
		System.out.println("sum: " + s);
		return s;
	}

	@Override
	public int mul(int a, int b) {
		System.out.println("Call mul: a="+a+", b="+b);
		int m = service.mul(a, b);
		System.out.println("mul: " + m);
		return m;
	}

}
