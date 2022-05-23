package com.vti.entity;

public class Students {
	private int id;
	private String name;
	private String homeTown;
	private float diemHocLuc;
	
	
	
	
	// cau b - question1- ex 5
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHomeTown() {
		return homeTown;
	}

	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}

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
		this.diemHocLuc += diemHocLuc ;
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



