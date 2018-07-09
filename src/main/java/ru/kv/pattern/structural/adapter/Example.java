package ru.kv.pattern.structural.adapter;

import java.util.Random;

/**
 * Adapter (Адаптер) - позволяет объектам с несовместимыми 
 * интерфейсами работать вместе.
 */
public class Example {
	
	private static final Random random = new Random();

	public static void main(String[] args) {
		HttpSocket httpSocket = new SocketAdapter(new UdpSocket());
		
		httpSocket.open("192.168.1.1", 8080);
		
		for (int i = 0; i < 5; i++) {
			HttpMessage message = new HttpMessage();
			message.setMessage("Http message: " + random.nextInt(100));
			httpSocket.send(message);
			
			message = httpSocket.receive();
			System.out.println(message);
		}
		
		httpSocket.close();
	}

}
