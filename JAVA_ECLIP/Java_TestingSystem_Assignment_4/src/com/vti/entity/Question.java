package com.vti.entity;
import java.util.Date;

public class Question {
	public int questionId;
	public String content;
	public CategoryQuestion category_ID;
	public TypeQuestion type_ID;
	public Account creator_ID;
	Date createDate;
}
