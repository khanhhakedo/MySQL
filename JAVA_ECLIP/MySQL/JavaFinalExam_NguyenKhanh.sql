DROP DATABASE IF EXISTS Testing_Exam;
CREATE DATABASE Testing_Exam;
USE Testing_Exam;

DROP TABLE IF EXISTS `User`;
CREATE TABLE `User`(
	Id 			SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	FullName 	VARCHAR(50) NOT NULL,
    Email 		VARCHAR(50) UNIQUE KEY NOT NULL,
    `Password`	VARCHAR(12) DEFAULT '123456',
    ExpInYear	TINYINT UNSIGNED ,
    ProSkill	VARCHAR(50),
    ProjectId	SMALLINT UNSIGNED ,
    `Role`		ENUM('MANAGER', 'EMPLOYEE', 'ADMIN') DEFAULT 'EMPLOYEE'
);



INSERT INTO `User` 	(`FullName`				, `Email`					, `Password`			, `ExpInYear`		, `ProSkill`		, `ProjectId`		, `Role`) 
VALUES 				('Nguyen Khanh 1'		,'nguyenkhanh1@gmail.com'		, '1234567'			, NULL				, NULL				, '1'				, 'ADMIN'),
					('Nguyen Khanh 2'		,'nguyenkhanh2@gmail.com'		, '1234567'			, NULL				, NULL				, '2'				, 'ADMIN'),
					('Nguyen Khanh 3'		,'nguyenkhanh3@gmail.com'		, '1234567'			, '5'				, NULL				, '2'				, 'MANAGER'),
                    ('Nguyen Khanh 4'		,'nguyenkhanh4@gmail.com'		, '1234567'			, '10'				, NULL				, '1'				, 'MANAGER'),
                    ('Nguyen Khanh 5'		,'nguyenkhanh5@gmail.com'		, '1234567'			, '6'				, NULL				, '1'				, 'MANAGER'),
                    ('Nguyen Khanh 6'		,'nguyenkhanh6@gmail.com'		, '1234567'			, NULL				, 'dev'				, '1'				, 'EMPLOYEE'),
                    ('Nguyen Khanh 7'		,'nguyenkhanh7@gmail.com'		, '1234567'			, NULL				, 'test'			, '1'				, 'EMPLOYEE'),
                    ('Nguyen Khanh 8'		,'nguyenkhanh8@gmail.com'		, '1234567'			, NULL				, 'csharp'			, '2'				, 'EMPLOYEE'),
                    ('Nguyen Khanh 9'		,'nguyenkhanh9@gmail.com'		, '1234567'			, NULL				, 'html'			, '2'				, 'EMPLOYEE'),
                    ('Nguyen Khanh 10'		,'nguyenkhanh10@gmail.com'		, '1234567'			, NULL				, 'css'				, '2'				, 'EMPLOYEE');
                   
                    