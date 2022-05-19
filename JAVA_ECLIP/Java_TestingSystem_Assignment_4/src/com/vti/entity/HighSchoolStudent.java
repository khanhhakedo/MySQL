package com.vti.entity;

public class HighSchoolStudent extends hocsinh{

	public HighSchoolStudent(int id, String fullName,String clazz, String desiredUniversity ) {
		this.setId(id);
		this.setFullName(fullName);
		this.setClazz(clazz);
		this.setDesiredUniversity(desiredUniversity);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		return Account;
		String result = "";
		result += "ID: " + getId();
		result += " || ";
		result += "FullName: " + getFullName();
		result += " || ";
		result += "Clazz: " + getClazz();
		result += " || ";
		result += "DesiredUniversity: " + getDesiredUniversity();
		return result ;
	}
	
public static void main(String[] args) {
	HighSchoolStudent highSchoolStudent = new HighSchoolStudent(1, "Nam", "Chuyen van", "Đại học công nghệ");
	
	
	System.out.println(highSchoolStudent.toString());
}
	
	
	
}




