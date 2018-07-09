package ru.kv.pattern.structural.adapter;

public class HttpMessage {
	
	private String message;

	public HttpMessage() {
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HttpMessage [message=" + message + "]";
	}

}
