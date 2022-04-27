
DROP DATABASE IF EXISTS ThucTap;
CREATE DATABASE ThucTap;
USE ThucTap;

CREATE TABLE Country (
CountryID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
Country_Name NVARCHAR(50) NOT NULL
);

CREATE TABLE Location (
Location_ID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
Street NVARCHAR(50) NOT NULL,
Address NVARCHAR(50) NOT NULL,
Postal_Code TINYINT UNSIGNED NOT NULL,
CountryID TINYINT UNSIGNED NOT NULL,
FOREIGN KEY (CountryID) REFERENCES Country(CountryID) ON DELETE CASCADE
);

CREATE TABLE Employee (
EmployeeID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
Full_Name NVARCHAR(50) NOT NULL,
 Email NVARCHAR(50) NOT NULL UNIQUE,
 Location_ID TINYINT UNSIGNED  ,
 FOREIGN KEY (Location_ID) REFERENCES Location(Location_ID) ON DELETE CASCADE
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
('Cao trung2','ngo 3','+83','4'),
('Cao trung3','ngo 4','+86','3'),
('Cao trung4','ngo 5','+84','5'),
('Cao trung5','ngo 6','+84','1');

INSERT INTO Employee(Full_Name,Email,Location_ID) VALUES
('Nguyen Khanh','nn03@gmail.com','1'),
('Nguyen Khanh 1','Khanh1@gmail.com','2'),
('Nguyen Khanh 2','Khanh2@gmail.com','3'),
('Nguyen Khanh 3','Khanh3@gmail.com','2'),
('Nguyen Khanh 4','Khanh4@gmail.com','5'),
('Nguyen Khanh 5','Khanh5@gmail.com','6');


-- 2. Viết lệnh để
-- a) Lấy tất cả các nhân viên thuộc Việt nam
SELECT C.*, E.Full_Name
FROM Location L
JOIN Employee E  ON L.Location_ID = E.Location_ID
JOIN Country C ON C.CountryID = L.CountryID
WHERE C.Country_Name = 'Viet Nam';

-- b) Lấy ra tên quốc gia của employee có email là "nn03@gmail.com"
SELECT C.Country_Name
FROM Location L
JOIN Employee E  ON L.Location_ID = E.Location_ID
JOIN Country C ON C.CountryID = L.CountryID
WHERE E.Email LIKE 'nn03@gmail.com';

-- c) Thống kê mỗi country, mỗi location có bao nhiêu employee đang làm việc.
SELECT  C.*,L.Location_ID, COUNT( E.EmployeeID) AS so_nguoi
FROM Location L
LEFT JOIN Employee E  ON L.Location_ID = E.Location_ID
RIGHT JOIN Country C ON C.CountryID = L.CountryID
GROUP BY L.Location_ID, C.CountryID;

-- 3. Tạo trigger cho table Employee chỉ cho phép insert mỗi quốc gia có tối đa 10 employee --
DROP TRIGGER IF EXISTS T_Cau3;
DELIMITER $$
CREATE TRIGGER T_Cau3
BEFORE INSERT ON Employee
FOR EACH ROW
BEGIN 
DECLARE V_Songuoi TINYINT;
SELECT  COUNT( E.EmployeeID) AS so_nguoi INTO V_Songuoi
FROM Location L
JOIN Employee E  ON L.Location_ID = E.Location_ID
JOIN Country C ON C.CountryID = L.CountryID
GROUP BY C.CountryID;
	IF V_Songuoi >= 10  THEN
		SIGNAL SQLSTATE '12345' 
		SET MESSAGE_TEXT='Qua 10 nguoi';
        
	END IF;

END $$
DELIMITER ;


-- 4. Hãy cấu hình table sao cho khi xóa 1 location nào đó thì tất cả employee ở location đó sẽ có location_id = null
DROP PROCEDURE IF EXISTS P_Cau4 ;
DELIMITER $$
CREATE PROCEDURE P_Cau4 (IN IN_LocationID TINYINT)
BEGIN
UPDATE Employee E1 SET E1.Location_ID = NULL WHERE E1.Location_ID = IN_LocationID;
DELETE FROM Employee E WHERE E.Location_ID = IN_LocationID;   
END$$
DELIMITER ;

call  P_Cau4 ('1');