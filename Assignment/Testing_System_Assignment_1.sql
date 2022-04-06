DROP DATABASE IF EXISTS TestingSytemAssignment1; 
CREATE DATABASE TestingSytemAssignment1;
Use TestingSytemAssignment1;

CREATE TABLE Department (
Department_ID 	VARCHAR(50),
Department_Name VARCHAR(50)
);

CREATE TABLE `Position` (
Position_ID 	VARCHAR(50),
Position_Name 	VARCHAR(50)
);

CREATE TABLE `Account` (
Account_ID 			VARCHAR(50),
Email 				VARCHAR(50),
Username 			VARCHAR(50),
Fullname 			VARCHAR(50),
Department_ID 		VARCHAR(100),
Position_ID 		VARCHAR(50),
Create_Date 		DATE
);

CREATE TABLE `Group`(
Group_ID 	VARCHAR(50),
Group_NAME 	VARCHAR(100),
Creator_ID 	VARCHAR(50),
Create_Date DATE
);

CREATE TABLE Group_Account (
Group_ID 		VARCHAR(50),
Account_ID	 	VARCHAR(50),
Join_Date 		DATE
);

CREATE TABLE Type_Question (
Type_ID 	VARCHAR(50),
Type_Name 	VARCHAR(50)
);

CREATE TABLE Category_Question (
Category_ID 	VARCHAR(50),
Category_Name 	VARCHAR(50)
);

CREATE TABLE Question (
Question_ID 	VARCHAR(50),
Content 		VARCHAR(100),
Category_ID 	VARCHAR(50),
Type_ID 		VARCHAR(100),
Creator_ID 		INT,
Creator_Date 	DATE
);

CREATE TABLE Answer (
Answer_ID 	VARCHAR(50),
Content 	VARCHAR(50),
Question_ID VARCHAR(100),
Is_Correct 	VARCHAR(50)
);

CREATE TABLE Exam (
Exam_ID 	VARCHAR(50),
`Code` 		INT,
Title 		VARCHAR(100),
Caregory_ID INT,
Duration 	DATE,
CreatorID 	INT,
Create_Date DATE
);

CREATE TABLE Exam_Question (
Exam_ID 	INT,
Question_ID VARCHAR(50)
);

