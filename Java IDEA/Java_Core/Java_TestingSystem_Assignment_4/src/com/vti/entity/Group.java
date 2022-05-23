package com.vti.entity;
import java.util.Date;

public class Group {
	public byte groupId;
	public String groupName;
	public Account creatorID;
	public Date createDate;
	public Account[] accounts;
	public String[] userNames;
	
	
	public Group() {
		
	}
	
	public Group(String groupName,Account creatorID,Account[] accounts,Date createDate ) {
		this.groupName = groupName;
		this.creatorID = creatorID;
		this.accounts = accounts;
		this.createDate = createDate;
	}
		
	public Group(String groupName,Account creatorID,String[] userNames,Date createDate ) {
		this.groupName = groupName;
		this.creatorID = creatorID;
		this.userNames = userNames;
		this.createDate = createDate;	
		
	}
}
