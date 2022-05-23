package com.vti.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;

public class QLCB extends CanBo {

	
	@Override
	public void doing() {
		System.out.println("quan ly can bo");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		return Account;
		String result = "";
		result += "FullName: " + getFullName();
		result += " || ";
		result += "tuoi: " + getAge();
		result += " || ";
		result += "gioitinh: " + getGioiTinh();
		result += " || ";
		result += "dia chi: " + getAddress();
		return result ;
	}
	public QLCB() {
	}
	
	public QLCB(String fullName,int age,String address ) {
		this.setFullName(fullName);
		this.setAge(age);
		this.setAddress(address);;
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
	
		List<QLCB> qlcbs = new ArrayList<QLCB>();
		
		
				 
		System.out.println("Moi ban nhap so tuong ung cac chuc nang");
		System.out.println("1: Them moi can bo");
		System.out.println("2: Tim kiem can bo theo ho ten");
		System.out.println("3: Hien thi thong tin danh sasch can bo");
		System.out.println("4: Xoa can bo trong danh sach");
		System.out.println("5: Thoat chuong trinh");
		System.out.println("-------------------------------------------");
		
		int x = scanner.nextInt();
		System.out.println("-------------------------------------------------");
		
		switch (x) {
		case 1:
			System.out.println("Moi ban them moi can bo :");
			System.out.print("Nhap ho va ten viet lien: ");
			String tencanbo = scanner.next();
			System.out.print("Nhap tuoi: ");
			int tuoi = scanner.nextInt(); 
			System.out.print("Nhap gioi tinh (MALE< FEMALE< UNKNOW): ");
			String gioitinh = scanner.next();
			System.out.println("Nhap dia chi lien he: ");
			String diachi = scanner.next();
			qlcbs.add(new QLCB(tencanbo, tuoi, diachi));
			
			System.out.println("Ban vua them can bo co thong tin nhu sau: ");
			
			System.out.println(qlcbs.get(0).toString());
			
			break;
//		case 2:
//			System.out.println("Tim kiem can bo theo ho ten");
//			System.out.print("Nhap ten can bo can tim kiem: ");
//			String tencanbocantim = scanner.next();
//			
//			break;	
		case 3:
			System.out.println("Hien thi thong tin danh sach can bo");
			for (QLCB qlcb : qlcbs) {
				System.out.println(qlcb.toString());
			}
		
			break;
		case 4:
			System.out.println("Xoa can bo trong danh sach");
			System.out.print("stt can bo muon xoa: ");
			int y = scanner.nextInt();
			qlcbs.remove(y);
			break;
			
			
		case 5:
			System.out.println("Thoat chuong trinh");
			break;

		default:
			System.out.println("Ban nhap sai chuc nang");
			break;
		}
		
		System.out.println("---------------------------------");
		
			 
		}
	

}
