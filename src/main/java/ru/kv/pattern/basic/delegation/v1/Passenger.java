package ru.kv.pattern.basic.delegation.v1;

/** Пассажир - это персона с билетом */
public class Passenger {
	
	private Person person;
	/** Билет */
	private String ticket;
	
	public Passenger() {
		person = new Person();
	}

	public String getName() {
		return person.getName();
	}

	public void setName(String name) {
		person.setName(name);
	}

	public int getAge() {
		return person.getAge();
	}

	public void setAge(int age) {
		person.setAge(age);
	}

	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	@Override
	public String toString() {
		return "Passenger [name=" + person.getName() + ", age=" + person.getAge() + ", ticket=" + ticket + "]";
	}
	
}
