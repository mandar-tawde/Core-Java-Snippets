package com.techlabs.singleton.eager_initialization;

public class Person {

	private String name;
	private String address;

	private static final Person person = new Person();

	private Person() {
	}

	public static Person getInstance() {
		return person;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return name + " " + address;
	}
}
