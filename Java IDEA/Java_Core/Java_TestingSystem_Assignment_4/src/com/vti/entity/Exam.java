package com.vti.entity;

import java.time.LocalTime;
import java.util.Date;

public class Exam {
	public byte examId;
	public byte code;
	public String title;
	public CategoryQuestion category_ID;
	public LocalTime duration;
	public Account creator_Id;
	public Date createDate;
}
