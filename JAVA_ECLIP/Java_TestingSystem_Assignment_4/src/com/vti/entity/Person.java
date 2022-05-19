package com.vti.entity;

public class Person {
	private int id;
	private String fullName;
	private String address;
 
public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

public Person() {
	
}

public Person(int id, String fullName) {
	this.id = id;
	this.fullName = fullName;
	this.address = null;
}
}
