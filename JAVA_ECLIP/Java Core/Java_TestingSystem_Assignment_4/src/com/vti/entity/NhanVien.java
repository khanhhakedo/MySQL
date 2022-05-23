package com.vti.entity;

public class NhanVien extends CanBo {
	private String Work;

public String getWork() {
	return Work;
}

public void setWork(String work) {
	Work = work;
}

@Override
public void doing() {
	System.out.println("met vl");
	
}
  
}
