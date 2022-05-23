package com.vti.backend;

import java.util.Date;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Position;
import com.vti.entity.positionName;

public class Excercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Question 1:
			Tạo constructor cho department:
			a) không có parameters
			b) Có 1 parameter là nameDepartment và default id của Department = 0
			Khởi tạo 1 Object với mỗi constructor ở trên */
		
		Department department1 = new Department();
		department1.departmentId = 1;
		department1.departmentName = "khanh";
		
		Department department2 = new Department( "khanh2");
			
		/* Question 2:
		Tạo constructor cho Account:
		a) Không có parameters
		b) Có các parameter là id, Email, Username, FirstName, LastName (với FullName = FirstName + LastName)
		c) Có các parameter là id, Email, Username, FirstName, LastName (với FullName = FirstName + LastName) 
		và Position của User, default createDate = now
		d) Có các parameter là id, Email, Username, FirstName, LastName (với FullName = FirstName + LastName) 
		và Position của User, createDate
		Khởi tạo 1 Object với mỗi constructor ở trên */
		
		Account account1 = new Account();
		account1.setAccountId(1);
		account1.setEmail("khanh1@gmail.com"); 
		
		Account account2 = new Account(2, "khanh2@gmail.com", "khanh2","nguyen khanh 2");
		
		System.out.println(account2.getAccountId());
		
		Position position1 = new Position();
		position1.positionId = 1;
		position1.positionName = positionName.DEV;
		
		Account account3 = new Account(3,"khanh3@gmail.com", "khanh3","nguyen khanh 3", position1);
		System.out.println(account3.getEmail("120396"));
		
		Account account4 = new Account(4, "khanh4@gmail.com", "khanh4", "nguyen khanh 3",position1,new Date("2022/12/03"));
		
		
		/* Question 3:
		Tạo constructor cho Group:
		a) không có parameters
		b) Có các parameter là GroupName, Creator, array Account[] accounts, CreateDate
		c) Có các parameter là GroupName, Creator, array String[] usernames , CreateDate
		Với mỗi username thì sẽ khởi tạo 1 Account (chỉ có thông tin username, các thông tin còn lại = null).
		Khởi tạo 1 Object với mỗi constructor ở trên */
		
		Group group1 = new Group();
		group1.groupId = 1;
		group1.creatorID = account1;
		
		Account[] accounts ={account1,account2,account3};
		Group group2 = new Group("khanh", account2, accounts, new Date("2022/12/03"));
		
		
				
	}
}
