package com.vti.entity;

public abstract class hocsinh extends Person {
	public hocsinh(String fullName, int id) {
		super(fullName);
		this.id = id;
		System.out.println("hoc sinh");
	}
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}

