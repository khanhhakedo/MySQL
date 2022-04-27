DROP DATABASE IF EXISTS TestingExam;
CREATE DATABASE TestingExam;
USE TestingExam;
DROP TABLE IF EXISTS Customer;
CREATE TABLE Customer(
CustomerID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
`Name` NVARCHAR(50) NOT NULL,
Phone INT NOT NULL UNIQUE KEY,
Email VARCHAR(50) NOT NULL UNIQUE KEY,
Address VARCHAR(50) NOT NULL,
Note NVARCHAR(50)
);
DROP TABLE IF EXISTS Car;
CREATE TABLE Car (
CarID TINYINT UNSIGNED  PRIMARY KEY,
Maker ENUM ('HONDA', 'TOYOTA','NISSAN') NOT NULL,
Model VARCHAR(50) NOT NULL ,
`Year` DATETIME NOT NULL,
Color VARCHAR(50) NOT NULL,
Note NVARCHAR(50)
);
DROP TABLE IF EXISTS Car_Order;
CREATE TABLE Car_Order(
OrderID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY
KEY,
CustomerID TINYINT UNSIGNED NOT NULL ,
CarID TINYINT UNSIGNED NOT NULL ,
Amount TINYINT UNSIGNED DEFAULT '1' ,
SalePrice INT UNSIGNED NOT NULL ,
OrderDate DATETIME,
DeliveryDate DATETIME,
DeliveryAddress VARCHAR(50),
Staus ENUM ('0','1','2')  DEFAULT '0',
Note NVARCHAR(50),
FOREIGN KEY(CustomerID) REFERENCES Customer(CustomerID) ON DELETE CASCADE,
FOREIGN KEY(CarID) REFERENCES Car(CarID) ON DELETE CASCADE
);

INSERT INTO Customer(`Name`,Phone,Email,Address,Note ) VALUES
('Black necked stork','12345671', 'matack0@ted.com', '7 Merrick Plaza', 'Female'),
('Weaver chestnut', '12345672', 'meaden1@addthis.com', '4 Veith Crossing', 'Female'),
('Guerza','12345673', 'lmccraw2@yolasite.com', '84 Saint Paul Crossing', 'Male'),
('Rhinoceros white', '12345676', 'jheathfield3@nsw.gov.au', '12 Spaight Road', 'Female'),
('Chital','12345679', 'nmacgiollapheadair4@tinypic.com', '95 Spohn Trail', 'Female');


INSERT INTO Car VALUES
('111', 'HONDA', 'Sport', '2006/12/3', 'Violet',NULL ),
('112','TOYOTA', 'Grand Am', '1995/3/12', 'Crimson',NULL ),
('114','NISSAN', 'C-300', '2011/5/6', 'Yellow',NULL),
('115','TOYOTA', 'C-200', '2022/5/6', 'Khaki',NULL),
('203', 'HONDA', 'C-Class', '2005/5/7', 'Khaki',NULL);

INSERT INTO Car_Order(CustomerID,CarID,Amount,SalePrice,OrderDate,DeliveryDate,DeliveryAddress,Staus,Note) VALUES
('1','111','5','100000000',NULL,NULL,NULL,'0',Null),
('2','112','6','100000000','2020/4/3',NULL,NULL,'2',Null),
('3','114','1','100000000','2022/11/7','2019/12/7','84 Saint Paul Crossing','1',Null),
('4','115','2','100000000','2022/4/6','2018/5/6','12 Spaight Road','1',Null),
('5','203','4','100000000','2017/5/3',NULL,NULL,'2',Null),
('1','114','3','100000000','2022/12/4','2017/1/4','84 Saint Paul Crossing','1',Null);


-- 2. Viết lệnh lấy ra thông tin của khách hàng: tên, số lượng oto khách hàng đã mua và sắp sếp tăng dần theo số lượng oto đã mua.

SELECT C.`Name`, SUM(CO.Amount) AS So_oto_da_mua
FROM Customer C
JOIN Car_Order CO ON CO.CustomerID = C.CustomerID
WHERE CO.Staus = '1'
GROUP BY CO.CustomerID
ORDER BY SUM(CO.Amount) ASC;


-- 3. Viết hàm (không có parameter) trả về tên hãng sản xuất đã bán được nhiều oto nhất trong năm nay.
DROP PROCEDURE IF EXISTS P_cau3 ;
DELIMITER $$
CREATE PROCEDURE P_cau3 ()
BEGIN
WITH ID_Xe AS (
SELECT SUM(CO.Amount)
FROM Car C
JOIN Car_Order CO ON C.CarID = CO.CarID
WHERE CO.Staus = '1' AND ( YEAR(CO.OrderDate) = YEAR(NOW()))
GROUP BY C.Maker
ORDER BY SUM(CO.Amount) DESC LIMIT 1)

SELECT C1.Maker
FROM Car C1
JOIN Car_Order CO1 ON C1.CarID = CO1.CarID
WHERE CO1.Staus = '1' AND ( YEAR(CO1.OrderDate) = YEAR(NOW()))
GROUP BY C1.Maker
HAVING SUM(CO1.Amount)  =  (SELECT * FROM ID_Xe);					
END$$
DELIMITER ;

CALL P_cau3 ();

-- 4. Viết 1 thủ tục (không có parameter) để xóa các đơn hàng đã bị hủy của những năm trước. In ra số lượng bản ghi đã bị xóa.

DROP PROCEDURE IF EXISTS P_cau4 ;
DELIMITER $$
CREATE PROCEDURE P_cau4 ()
BEGIN
SELECT COUNT(1) 
FROM Car_Order
WHERE Staus = '2' AND ( YEAR(OrderDate) < YEAR(NOW()));

DELETE FROM Car_Order 
WHERE Staus = '2' AND ( YEAR(OrderDate) < YEAR(NOW()));

					
END$$
DELIMITER ;

CALL P_cau4();

-- 5. Viết 1 thủ tục (có CustomerID parameter) để in ra thông tin của các đơn hàng đã đặt hàng bao gồm: tên của khách hàng, mã đơn hàng, số lượng oto và tên hãng sản xuất.

DROP PROCEDURE IF EXISTS P_Cau5 ;
DELIMITER $$
CREATE PROCEDURE P_Cau5 ( IN IN_CustomerID TINYINT)
BEGIN
SELECT C1.`Name`, CO.OrderID, C.Maker, SUM(CO.Amount)
FROM Car_Order CO
JOIN Car C USING (CarID)
JOIN Customer C1 USING (CustomerID) 
WHERE CO.CustomerID = IN_CustomerID AND CO.Staus = '0'
GROUP BY CO.CustomerID  ;

					
END$$
DELIMITER ;

CALL P_Cau5 ('1');

-- 6. Viết trigger để tránh trường hợp người dụng nhập thông tin không hợp lệ vào database (DeliveryDate < OrderDate + 15).
DROP TRIGGER IF EXISTS T_Cau6;
DELIMITER $$
CREATE TRIGGER T_Cau6
BEFORE INSERT ON Car_Order
FOR EACH ROW
BEGIN 
	IF (NEW.DeliveryDate) < (DATE_ADD(NEW.OrderDate,INTERVAL 15 DAY)) THEN
		SIGNAL SQLSTATE '12345' 
		SET MESSAGE_TEXT='Ngay bi loi';
        
	END IF;

END $$
DELIMITER ;