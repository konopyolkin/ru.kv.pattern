package ru.kv.pattern.structural.adapter;

import java.net.DatagramPacket;
import java.util.Random;

public class UdpSocket {
	
	private Random random = new Random();
	
	public void open(String ip, String port) {
		System.out.println("Open UDP: " + ip + ":" + port);
	}

	public void sendDatagram(DatagramPacket packet) {
		System.out.println("Send " + new String(packet.getData()));
	}
	
	public DatagramPacket receiveDatagram() {
		byte[] buf = ("UDP message (" + random.nextInt(100) + ") UDP").getBytes();
		DatagramPacket packet = new DatagramPacket(buf, buf.length);
		return packet;
	}
	
	public void close() {
		System.out.println("Close UDP");
	}
	
}
