DROP DATABASE IF EXISTS TestingSytemAssignment_3; 
CREATE DATABASE TestingSytemAssignment_3;
USE TestingSytemAssignment_3;

/* TABLE_Department */
CREATE TABLE Department (
Department_ID 	INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
Department_Name VARCHAR(50) UNIQUE NOT NULL
);

/* TABLE_Position */
CREATE TABLE `Position` (
Position_ID 	INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
Position_Name 	ENUM ('Dev', 'Test', 'Scrum', 'Master', 'PM') UNIQUE NOT NULL
);

/* TABLE_Account */
CREATE TABLE `Account` (
Account_ID 			INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
Username 			VARCHAR(50) UNIQUE CHECK (LENGTH(Username) >=6) NOT NULL,
Fullname 			VARCHAR(50) NOT NULL,
Department_ID 		INT UNSIGNED NOT NULL, 
Position_ID 		INT UNSIGNED NOT NULL,
Create_Date 		DATE,
FOREIGN KEY(Department_ID) REFERENCES Department(Department_ID),
FOREIGN KEY(Position_ID) REFERENCES `Position`(Position_ID)
);

/* TABLE_Group */
CREATE TABLE `Group`(
Group_ID 	INT  UNSIGNED PRIMARY KEY AUTO_INCREMENT,
Group_NAME 	VARCHAR(100) UNIQUE KEY NOT NULL,
Creator_ID 	INT UNSIGNED NOT NULL,
Create_Date DATE,
FOREIGN KEY (Creator_ID) REFERENCES `Account`(Account_ID)
);

/* TABLE_Group_Account */
CREATE TABLE Group_Account (
Group_ID 		INT UNSIGNED NOT NULL,
Account_ID	 	INT UNSIGNED NOT NULL,
Join_Date 		DATE,
FOREIGN KEY(Group_ID) REFERENCES `Group`(Group_ID),
FOREIGN KEY(Account_ID) REFERENCES `Account`(Account_ID)
);

/* TABLE_Type_Question */
CREATE TABLE Type_Question (
Type_ID 	INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
Type_Name 	ENUM ('Essay', 'Multiple-Choice') NOT NULL
);

/* TABLE_Category_Question */
CREATE TABLE Category_Question (
Category_ID 	INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
Category_Name 	VARCHAR(50) UNIQUE KEY NOT NULL
);

/* TABLE_Question */
CREATE TABLE Question (
Question_ID 	INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
Content 		VARCHAR(100) CHECK (LENGTH(Content) >=6) NOT NULL,
Category_ID 	INT UNSIGNED NOT NULL,
Type_ID 		INT UNSIGNED NOT NULL,
Creator_ID 		INT UNSIGNED NOT NULL,
Creator_Date 	DATE,
FOREIGN KEY(Category_ID) REFERENCES Category_Question(Category_ID),
FOREIGN KEY(Type_ID) REFERENCES Type_Question(Type_ID),
FOREIGN KEY(Creator_ID) REFERENCES `Account`(Account_ID)
);

/* TABLE_Answer */
CREATE TABLE Answer (
Answer_ID 	INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
Content 	VARCHAR(50) NOT NULL,
Question_ID INT UNSIGNED NOT NULL,
Is_Correct 	BOOLEAN NOT NULL,
FOREIGN KEY(Question_ID) REFERENCES Question(Question_ID)
);

/* TABLE_Exam  */
CREATE TABLE Exam (
Exam_ID 	INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
`Code`		VARCHAR(50) NOT NULL,
Title 		VARCHAR(100) NOT NULL,
Caregory_ID INT UNSIGNED UNIQUE NOT NULL,
Duration 	TIME NOT NULL,
Creator_ID 	INT UNSIGNED UNIQUE NOT NULL,
Create_Date DATE,
FOREIGN KEY(Caregory_ID) REFERENCES Category_Question(Category_ID),
FOREIGN KEY(Creator_ID) REFERENCES `Account`(Account_ID)  
);

/* TABLE_Exam_Question */CREATE TABLE Exam_Question (
Exam_ID 	INT UNSIGNED,
Question_ID INT UNSIGNED,
FOREIGN KEY(Exam_ID) REFERENCES Exam(Exam_ID),
FOREIGN KEY(Question_ID)REFERENCES Question(Question_ID)
);


