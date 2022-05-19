package com.vti.entity;

public abstract class CanBo {
	private String fullName;
	private  int age;
	private  sex gioiTinh;
	private  String address;
	
	
	public abstract void doing();
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public sex getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(sex gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
