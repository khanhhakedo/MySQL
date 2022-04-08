-- Exercise 1 --
DROP DATABASE IF EXISTS Fresher;
CREATE DATABASE Fresher;
Use Fresher;

CREATE TABLE Student (
Trainee_ID INT PRIMARY KEY AUTO_INCREMENT,
Full_Name NVARCHAR(50) NOT NULL,
Birth_Date DATE,
Gender ENUM('Male', 'Female', 'Unknow'),
ET_IQ  INT UNSIGNED NOT NULL CHECK (ET_IQ >=0 AND ET_IQ <= 20),
ET_Gmath  INT UNSIGNED NOT NULL CHECK (ET_ET_Gmath >=0 AND ET_ET_Gmath <= 20),
ET_English INT NOT NULL CHECK (ET_English >=0 AND ET_English <= 50),
Training_Class VARCHAR(50) NOT NULL,
Evaluation_Notes VARCHAR (50)
);

ALTER TABLE Student ADD COLUMN VTI_Account VARCHAR(50) UNIQUE NOT NULL;


-- Exercise 2 --
DROP DATABASE IF EXISTS Data_Type_1;
CREATE DATABASE Data_Type_1;
Use Data_Type_1;

CREATE TABLE Type_1 (
ID INT PRIMARY KEY AUTO_INCREMENT,
`Name` VARCHAR(50) NOT NULL,
`Code` 
Modifi_Date Date NOW
);

-- Exercise 3 --
DROP DATABASE IF EXISTS Data_Type_2;
CREATE DATABASE Data_Type_2;
Use Data_Type_2;

CREATE TABLE Type_2 (
ID INT PRIMARY KEY AUTO_INCREMENT,
`Name` VARCHAR(50) NOT NULL,
Birth_Date DATE,
Gender
Is_Delete_Flag
);


