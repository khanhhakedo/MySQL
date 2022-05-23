package com.vti.entity;
import java.util.Date;

import javax.management.loading.PrivateClassLoader;

public class Account {
	private int accountId;
	private String email;
	private String userName;
	private String fullName;
	private Department departmentID;
	private Position positionID;
	private Group[] groups;
	private Date createDate;

	
	public Account() {
	
	}
	
	public Account(int accountId,String email,String userName,String fullName) {
	this.setAccountId(accountId);
	this.email = email;
	this.userName = userName;
	this.fullName = fullName;
	}
	
	public Account(int accountId,String email,String userName,String fullName,Position positionID) {
		this.setAccountId(accountId);
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.positionID = positionID;
		this.createDate = new Date();
	}
	
	public Account(int accountId,String email,String userName,String fullName,Position positionID,Date createDate) {
		
		this.setAccountId(accountId);
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.positionID = positionID;
		this.createDate = createDate;
	}
	
	public String getEmail (String matkhau) {
		if (matkhau == "120396") {
			return email;
		}else {
			return null;
		}
		
	}
	
	public void setEmail (String email) {
		this.email = email;
	}
	
	public String getUserName () {
		return userName;
	}
	
	public void setUserName () {
		this.userName = userName;
	}
	
	public String getFullName () {
		return fullName;
	}
	
	public void setFullName () {
		this.fullName = fullName;
	}
	
	public Department getDepartmentID () {
		return departmentID;
	}
	
	public void setDepartmentID () {
		this.departmentID = departmentID;
	}
	
	public Position getPositionID () {
		return positionID;
	}
	
	public void setPositionID () {
		this.positionID = positionID;
	}
	
	public Group[] getGroups () {
		return groups;
	}
	
	public void setGroups () {
		this.groups = groups;
	}
	
	public Date getCreateDate () {
		return createDate ;
	}
	
	public void setCreateDate () {
		this.createDate = createDate;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
}
