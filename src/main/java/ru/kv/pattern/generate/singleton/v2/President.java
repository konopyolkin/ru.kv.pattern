package ru.kv.pattern.generate.singleton.v2;

import java.time.LocalDateTime;

public enum President {

	INSTANCE;
	
	private String name = "Putin V.V.";
	private LocalDateTime birthday = LocalDateTime.parse("1952-10-07T12:01:07");

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public LocalDateTime getBirthday() {
		return birthday;
	}
	
	public void setBirthday(LocalDateTime birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "President [name=" + name + ", birthday=" + birthday + "]";
	}

}
