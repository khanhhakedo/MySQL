package com.vti.entity;

public class hocsinh extends Person {
	private String clazz;
	private String desiredUniversity;

	
public String getClazz() {
		return clazz;
	}
	public void setClazz(String clazz) {
		this.clazz = clazz;
	}
	public String getDesiredUniversity() {
		return desiredUniversity;
	}
	public void setDesiredUniversity(String desiredUniversity) {
		this.desiredUniversity = desiredUniversity;
	}
public hocsinh() {
	
}
public hocsinh(int id, String fullName) {
	this.setId(id);
	this.setFullName(fullName);
}

}

