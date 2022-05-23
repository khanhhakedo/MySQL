package com.vti.entity;

public class HighSchoolStudent extends hocsinh{
	
 private String clazz;
 private String desiredUniversity;
	
	public HighSchoolStudent(String fullName, int id, String clazz, String desiredUniversity ) {
		super(fullName, id);
		this.clazz = clazz;
		this.desiredUniversity = desiredUniversity;
		System.out.println("cap2");
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
		result += "Clazz: " + clazz;
		result += " || ";
		result += "DesiredUniversity: " + desiredUniversity;
		return result ;
	}
	
public static void main(String[] args) {
	HighSchoolStudent highSchoolStudent = new HighSchoolStudent("nam", 1, "Chuyên Văn", "Đại học công nghệ");
	
	
	System.out.println(highSchoolStudent.toString());
}
	
	
	 
}




