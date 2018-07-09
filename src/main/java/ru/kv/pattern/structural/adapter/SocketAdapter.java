package ru.kv.pattern.structural.adapter;

import java.net.DatagramPacket;

public class SocketAdapter implements HttpSocket {
	
	private UdpSocket udpSocket;
	
	public SocketAdapter(UdpSocket udpSocket) {
		this.udpSocket = udpSocket;
	}

	@Override
	public void open(String ip, int port) {
		udpSocket.open(ip, Integer.toString(port));
	}

	@Override
	public void send(HttpMessage message) {
		byte[] buf = message.getMessage().getBytes();
		
		DatagramPacket packet = new DatagramPacket(buf, buf.length);
		udpSocket.sendDatagram(packet);
	}

	@Override
	public HttpMessage receive() {
		HttpMessage message = new HttpMessage();
		
		DatagramPacket packet = udpSocket.receiveDatagram();
		byte[] data = packet.getData();
		message.setMessage(new String(data));
		
		return message;
	}

	@Override
	public void close() {
		udpSocket.close();
	}

}
