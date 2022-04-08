DROP DATABASE IF EXISTS TestingSytemAssignment_1; 
CREATE DATABASE TestingSytemAssignment_1;
USE TestingSytemAssignment_1;

/* TABLE_1 */
CREATE TABLE Department (
Department_ID 	INT PRIMARY KEY AUTO_INCREMENT,
Department_Name VARCHAR(50)
);

/* TABLE_2 */
CREATE TABLE `Position` (
Position_ID 	INT PRIMARY KEY AUTO_INCREMENT,
Position_Name 	VARCHAR(50)
);

/* TABLE_3 */
CREATE TABLE `Account` (
Account_ID 			INT PRIMARY KEY AUTO_INCREMENT,
Email 				VARCHAR(50),
Username 			VARCHAR(50),
Fullname 			VARCHAR(50),
Department_ID 		INT,
Position_ID 		INT,
Create_Date 		DATE
);

/* TABLE_4 */
CREATE TABLE `Group`(
Group_ID 	INT PRIMARY KEY AUTO_INCREMENT,
Group_NAME 	VARCHAR(100),
Creator_ID 	INT,
Create_Date DATE
);

/* TABLE_5 */
CREATE TABLE Group_Account (
Group_ID 		INT,
Account_ID	 	INT,
Join_Date 		DATE
);

/* TABLE_6 */
CREATE TABLE Type_Question (
Type_ID 	INT PRIMARY KEY AUTO_INCREMENT,
Type_Name 	VARCHAR(50)
);

/* TABLE_7 */
CREATE TABLE Category_Question (
Category_ID 	INT PRIMARY KEY AUTO_INCREMENT,
Category_Name 	VARCHAR(50)
);

/* TABLE_8 */
CREATE TABLE Question (
Question_ID 	INT PRIMARY KEY AUTO_INCREMENT,
Content 		VARCHAR(100),
Category_ID 	INT,
Type_ID 		INT,
Creator_ID 		INT,
Creator_Date 	DATE
);

/* TABLE_9 */
CREATE TABLE Answer (
Answer_ID 	INT PRIMARY KEY AUTO_INCREMENT,
Content 	VARCHAR(50),
Question_ID INT,
Is_Correct 	BOOLEAN
);

/* TABLE_10 */
CREATE TABLE Exam (
Exam_ID 	INT PRIMARY KEY AUTO_INCREMENT,
`Code`		VARCHAR(50),
Title 		VARCHAR(100),
Caregory_ID INT,
Duration 	TIME,
CreatorID 	INT,
Create_Date DATE
);

/* TABLE_11 */
CREATE TABLE Exam_Question (
Exam_ID 	INT,
Question_ID INT
);
-- END --