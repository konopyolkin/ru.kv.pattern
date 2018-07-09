package ru.kv.pattern.basic.delegation.v1;

/** Пилот - это персона с правами */
public class Pilot {

	private Person person;
	/** Права */
	private String license;

	public Pilot() {
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

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	@Override
	public String toString() {
		return "Pilot [name=" + person.getName() + ", age=" + person.getAge() + ", license=" + license + "]";
	}

}
