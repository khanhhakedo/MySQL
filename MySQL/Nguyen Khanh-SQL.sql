DROP DATABASE IF EXISTS ThucTap;
CREATE DATABASE ThucTap;
USE ThucTap;

/* 1. Tạo table với các ràng buộc và kiểu dữ liệu
Thêm ít nhất 3 bản ghi vào table */

DROP TABLE IF EXISTS Country; 
CREATE TABLE Country (
CountryID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
Country_Name NVARCHAR(50) NOT NULL
);

DROP TABLE IF EXISTS Location;
CREATE TABLE Location (
LocationID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
Street NVARCHAR(50) NOT NULL,
Address NVARCHAR(50) NOT NULL,
Postal_Code TINYINT UNSIGNED NOT NULL,
CountryID TINYINT UNSIGNED NOT NULL,
 CONSTRAINT Country_ID FOREIGN KEY (CountryID) REFERENCES Country(CountryID)
);

DROP TABLE IF EXISTS Employee;
CREATE TABLE Employee (
EmployeeID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
Full_Name NVARCHAR(50) NOT NULL,
 Email NVARCHAR(50) NOT NULL UNIQUE KEY,
 LocationID TINYINT UNSIGNED  ,
 CONSTRAINT Location_ID FOREIGN KEY (LocationID) REFERENCES Location(LocationID)
);

INSERT INTO Country(Country_Name) VALUES 
('Viet Nam'),
('Nga'),
('Trung Quoc'),
('Nhat Ban'),
('Ukraina');

INSERT INTO Location(Street,Address,Postal_Code,CountryID) VALUES
('Cao trung','ngo 1','+84','1'),
('Cao trung1','ngo 2','+85','2'),
('Cao trung2','ngo 3','+84','1'),
('Cao trung3','ngo 4','+86','3'),
('Cao trung4','ngo 3','+84','1'),
('Cao trung5','ngo 6','+83','4'),
('Cao trung6','ngo 1','+87','5');

INSERT INTO Employee(Full_Name,Email,LocationID) VALUES
('Nguyen Khanh','nn03@gmail.com','1'),
('Nguyen Khanh 1','Khanh1@gmail.com','3'),
('Nguyen Khanh 2','Khanh2@gmail.com','2'),
('Nguyen Khanh 3','Khanh3@gmail.com','2'),
('Nguyen Khanh 4','Khanh4@gmail.com','6'),
('Nguyen Khanh 5','Khanh5@gmail.com','5'),
('Nguyen Khanh 5','Khanh6@gmail.com','7');


-- 2. Viết lệnh để

-- a) Lấy tất cả các nhân viên thuộc Việt nam
SELECT C.*, E.*
FROM Location L
JOIN Employee E  ON L.LocationID = E.LocationID
JOIN Country C ON C.CountryID = L.CountryID
WHERE C.Country_Name = 'Viet Nam';

-- b) Lấy ra tên quốc gia của employee có email là "nn03@gmail.com"
SELECT C.Country_Name
FROM Location L
JOIN Employee E  ON L.LocationID = E.LocationID
JOIN Country C ON C.CountryID = L.CountryID
WHERE E.Email LIKE 'nn03@gmail.com';

-- c) Thống kê mỗi country, mỗi location có bao nhiêu employee đang làm việc.
SELECT  C.*,L.LocationID, COUNT( E.EmployeeID) AS so_nguoi
FROM Location L
LEFT JOIN Employee E  ON L.LocationID = E.LocationID
RIGHT JOIN Country C ON C.CountryID = L.CountryID
GROUP BY L.LocationID, C.CountryID;

-- 3. Tạo trigger cho table Employee chỉ cho phép insert mỗi quốc gia có tối đa 10 employee
DROP TRIGGER IF EXISTS T_Cau3;
DELIMITER $$
CREATE TRIGGER T_Cau3
BEFORE INSERT ON Employee
FOR EACH ROW
BEGIN 
DECLARE V_CountryID TINYINT;
DECLARE V_Employee TINYINT;

SELECT CountryID  INTO V_CountryID
FROM Location WHERE LocationID = NEW.LocationID ;


SELECT  COUNT( E.EmployeeID) AS so_nguoi INTO V_Employee
FROM Location L
JOIN Employee E  ON L.LocationID = E.LocationID
JOIN Country C ON C.CountryID = L.CountryID
WHERE C.CountryID = V_CountryID 
GROUP BY C.CountryID;
	IF V_Employee >= 10  THEN
		SIGNAL SQLSTATE '12345' 
		SET MESSAGE_TEXT='Qua 10 nguoi';
        
	END IF;

END $$
DELIMITER ;


-- 4. Hãy cấu hình table sao cho khi xóa 1 location nào đó thì tất cả employee ở location đó sẽ có location_id = null

DROP PROCEDURE IF EXISTS P_Cau4 ;
DELIMITER $$
CREATE PROCEDURE P_Cau4 (IN IN_LocationID TINYINT UNSIGNED)
BEGIN
 ALTER TABLE Employee
	DROP FOREIGN KEY Location_ID; 
 
 ALTER TABLE Employee
	ADD CONSTRAINT DELETE_CASCADE FOREIGN KEY (LocationID) REFERENCES Location(LocationID) ON DELETE CASCADE;
 
UPDATE Employee E1 SET E1.LocationID = NULL 
	WHERE E1.LocationID = IN_LocationID;

DELETE FROM Location L 
	WHERE L.LocationID = IN_LocationID;   
END$$
DELIMITER ;

CALL P_Cau4 ('1');