package ru.kv.pattern.structural.adapter;

public interface HttpSocket {

	public void open(String ip, int port);
	
	public void send(HttpMessage message);
	
	public HttpMessage receive();
	
	public void close();
	
}
