package com.vti.entity;

public class Group {
	private int id;
	private String name;

	public Group(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Id: " + id + " / Name: " + name;
	}

}
