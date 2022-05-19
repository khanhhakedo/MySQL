package com.vti.entity;

public class Students {
	private int id;
	private String name;
	private String homeTown;
	private /*static*/ float diemHocLuc;
	
	// cau b - question1- ex 5
	
	public Students() {
	}
	
	public Students(String name, String homeTown) {
		this.name = name;
		this.diemHocLuc = (float) 0 ;
		this.homeTown = homeTown;
	}
	
	// cau c - question1- ex 5
	public float getDiemHocLuc() {
		return diemHocLuc;
	}
	public void setDiemHocLuc(float diemHocLuc) {
		this.diemHocLuc = diemHocLuc;
	}
	
	// cau d - question1- ex 5
	
	public void cauD( float diemHocLuc) {
		this.diemHocLuc = diemHocLuc + 1;
		System.out.println(this.diemHocLuc);
	}
	
	
	// cau e - question1- ex 5
	public void cauE(){
		
		if (this.diemHocLuc < 4) {
			System.out.println("yeu");
		}else if (4 < this.diemHocLuc && this.diemHocLuc < 6) {
			System.out.println("trung binh");
		}else if (6 < this.diemHocLuc && this.diemHocLuc <8 ) {
			System.out.println("kha");
		}else {
			System.out.println("gioi");
		}
	}

}



