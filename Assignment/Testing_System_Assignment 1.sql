DROP DATABASE IF EXISTS TestingSystemAssignment1;
CREATE DATABASE TestingSystemAssignment1;

USE TestingSystemAssignment1;

-- TABLE Department --
CREATE TABLE Department (
Department_ID 		INT PRIMARY KEY AUTO_INCREMENT,
 Department_Name 	VARCHAR(50) NOT NULL
 );
 
 /* TABLE Position */
 CREATE TABLE `Position` (
 Position_ID 	INT PRIMARY KEY AUTO_INCREMENT,
 Position_Name 	ENUM('Dev', 'Test', 'Scrum Master', 'PM') NOT NULL
 );
 
 -- TABLE Account --
CREATE Table `Account` (
Account_ID 		INT PRIMARY KEY AUTO_INCREMENT,
Email 			VARCHAR(50) NOT NULL,
User_Name 		VARCHAR(50) NOT NULL,
Full_Name 		VARCHAR(50) NOT NULL,
Department_ID 	INT UNIQUE,
Position_ID 	INT UNIQUE,
Create_Date 	Date,
  FOREIGN KEY (Department_ID) REFERENCES Department(Department_ID),
  FOREIGN KEY (Position_ID) REFERENCES `Position`(Position_ID)
  );
 
 /* Group */ 
CREATE TABLE `Group`(
Group_ID 		INT PRIMARY KEY AUTO_INCREMENT,
Group_Name 		VARCHAR(50) UNIQUE NOT NULL, CHECK (LENGTH(Group_Name) >=10),
Creator_ID 		INT UNIQUE NOT NULL,
Create_Date 	DATE,
FOREIGN KEY(Creator_ID) REFERENCES `Account`(Account_ID) 
);

-- TABLE Group_Account -- 
CREATE TABLE Group_Account (
Group_ID 	INT PRIMARY KEY AUTO_INCREMENT,
Account_ID 	INT NOT NULL  UNIQUE,
Join_Date 	DATE,
FOREIGN KEY (Account_ID) REFERENCES `Account`(Account_ID) 
);

-- TABLE Type_Question -- 
CREATE TABLE Type_Question (
Type_ID 	INT PRIMARY KEY AUTO_INCREMENT,
Type_Name 	ENUM('ESSAY', 'Multiple-Choice') NOT NULL
);
 
 -- TABLE Category_Question --
CREATE TABLE Category_Question (
Category_ID 	INT PRIMARY KEY AUTO_INCREMENT,
Category_Name 	VARCHAR(50) NOT NULL
);

 -- TABLE Question --
CREATE TABLE Question (
Question_ID 	INT PRIMARY KEY AUTO_INCREMENT,
Content 		VARCHAR(200) NOT NULL UNIQUE,
Category_ID		INT UNIQUE NOT NULL,
Type_ID 		INT UNIQUE  NOT NULL,
Creator_ID 		INT UNSIGNED  NOT NULL,
Create_Date 	DATE,
FOREIGN KEY (Category_ID ) REFERENCES Category_Question(Category_ID ),
FOREIGN KEY (Type_ID) REFERENCES Type_Question ( Type_ID)
);

 -- TABLE Answer --
CREATE TABLE Answer (
Answer_ID 		INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
Content 		VARCHAR(200) NOT NULL CHECK (LENGTH(Content) >=50),
Question_ID 	INT UNIQUE NOT NULL ,
Is_Correct 		BOOLEAN NOT NULL,
FOREIGN KEY (Question_ID) REFERENCES Question(Question_ID)
);

 -- TABLE Exam --
CREATE TABLE Exam (
Exam_ID 		INT PRIMARY KEY AUTO_INCREMENT,
`Code` 			INT NOT NULL,
Title 			VARCHAR(50) NOT NULL,
Category_ID 	INT NOT NULL,
Duration 		TIME NOT NULL,
Creator_ID	 	INT NOT NULL,
Create_Date 	DATE
);

-- TABLE Exam_Question --
CREATE TABLE Exam_Question (
Exam_ID 	INT NOT NULL,
Question_ID INT NOT NULL,
FOREIGN KEY (Exam_ID) REFERENCES Exam(Exam_ID),
FOREIGN KEY (Question_ID) REFERENCES Question(Question_ID)
);
-- End --



  
  