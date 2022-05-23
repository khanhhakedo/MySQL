DROP DATABASE IF EXISTS Thuc_Tap;
CREATE DATABASE Thuc_Tap;
USE Thuc_Tap;

DROP TABLE IF EXISTS GiangVien;
CREATE TABLE GiangVien (
Ma_Gv TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
Hoten NVARCHAR(50) NOT NULL,
Luong INT UNSIGNED NOT NULL
);


DROP TABLE IF EXISTS SinhVien;
CREATE TABLE SinhVien (
Ma_Sv TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
Hoten NVARCHAR(50) NOT NULL,
Namsinh DATE NOT NULL,
Quequan NVARCHAR(50) NOT NULL
);


DROP TABLE IF EXISTS DeTai;
CREATE TABLE DeTai (
Ma_Dt TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
Ten_Dt NVARCHAR(50) NOT NULL,
KinhPhi INT UNSIGNED NOT NULL,
NoiThucTap VARCHAR(50) NOT NULL
);


DROP TABLE IF EXISTS HuongDan;
CREATE TABLE HuongDan (
ID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
Ma_Sv TINYINT UNSIGNED NOT NULL UNIQUE,
Ma_Dt TINYINT UNSIGNED NOT NULL,
Ma_Gv TINYINT UNSIGNED NOT NULL,
KetQua ENUM ('Dat','Khong Dat'),

FOREIGN KEY (Ma_Sv) REFERENCES SinhVien(Ma_Sv) ON DELETE CASCADE,
FOREIGN KEY (Ma_Dt) REFERENCES DeTai(Ma_Dt) ON DELETE CASCADE,
FOREIGN KEY (Ma_Gv) REFERENCES GiangVien(Ma_Gv) ON DELETE CASCADE 
);

INSERT INTO GiangVien(Hoten,Luong) VALUES
('Nguyen Khanh','10000000'),
('Nguyen Khanh 1','20000000'),
('Nguyen Khanh 2','30000000');

INSERT INTO SinhVien(Hoten,Namsinh,Quequan) VALUES
('Nguyen Thi Quynh','1996/03/12','Thai Binh'),
('Nguyen Thi Quynh 1','1997/02/12','Nam Dinh'),
('Nguyen Thi Quynh 2','1998/03/10','Thai Binh'),
('Nguyen Thi Quynh 3','1999/04/13','Ha Noi'),
('Nguyen Thi Quynh 4','1996/05/20','Phu Tho');

INSERT INTO DeTai(Ten_Dt,KinhPhi,NoiThucTap) VALUES
('Cong nghe sinh hoc','10000000','Thai Binh'),
('Cong nghe gen','20000000','Thai Nguyen'),
('Cong nghe hoa hoc','20000000','Ha Noi'),
('Cong nghe sinh hoc','40000000','Nam Dinh'),
('Vat ly nguyen tu','30000000','Thai Binh');

INSERT INTO HuongDan(Ma_Sv,Ma_Dt,Ma_Gv,KetQua) VALUES
('1','2','1','Dat'),
('2','1','2','Khong Dat'),
('3','3','3','Dat'),
('4','4','1','Dat');

-- 2. Viết lệnh để
-- a) Lấy tất cả các sinh viên chưa có đề tài hướng dẫn
SELECT SV.*
FROM SinhVien SV
LEFT JOIN HuongDan HD ON SV.Ma_Sv = HD.Ma_Sv
WHERE HD.Ma_Sv IS NULL;

-- b) Lấy ra số sinh viên làm đề tài ‘CONG NGHE SINH HOC’
SELECT  COUNT(HD.Ma_Sv) AS Sosinhvien
FROM DeTai DT
JOIN HuongDan HD ON DT.Ma_Dt = HD.Ma_Dt
WHERE DT.Ten_Dt = 'Cong nghe sinh hoc';

/* 3. Tạo view có tên là "SinhVienInfo" lấy các thông tin về học sinh bao gồm:
mã số, họ tên và tên đề tài 
(Nếu sinh viên chưa có đề tài thì column tên đề tài sẽ in ra "Chưa có") */


DROP VIEW IF EXISTS SV_Lamdetai;
CREATE VIEW SV_Lamdetai AS 
SELECT SV.Ma_Sv, SV.Hoten,DT.Ma_Dt, (CASE 	WHEN DT.Ten_Dt IS NULL  THEN 'Chưa có'
											ELSE DT.Ten_Dt END ) AS tendetai
FROM HuongDan HD 
RIGHT JOIN SinhVien SV ON SV.Ma_Sv = HD.Ma_Sv
LEFT JOIN DeTai DT ON DT.Ma_Dt = HD.Ma_Dt;
 
/* 4. Tạo trigger cho table SinhVien khi insert sinh viên có năm sinh <= 1900 
thì hiện ra thông báo "năm sinh phải > 1900" */
DROP TRIGGER IF EXISTS TR_Cau4;
DELIMITER $$
CREATE TRIGGER TR_Cau4
BEFORE INSERT ON  SinhVien
FOR EACH ROW
BEGIN 
	IF YEAR(NEW.Namsinh) < 1990 THEN
		SIGNAL SQLSTATE '12345' 
		SET MESSAGE_TEXT='năm sinh phải > 1900';
        
	END IF;

END $$
DELIMITER ;

INSERT INTO SinhVien(Hoten,Namsinh,Quequan) VALUE
('Nguyen Thi ','1989/03/12','Thai Binh');

/* 5. Hãy cấu hình table sao cho khi xóa 1 sinh viên nào đó thì sẽ tất cả thông tin 
trong table HuongDan liên quan tới sinh viên đó sẽ bị xóa đi */ 

DROP PROCEDURE IF EXISTS P_Cau5 ;
DELIMITER $$
CREATE PROCEDURE P_Cau5 (IN IN_Ma_Sv TINYINT UNSIGNED)
BEGIN
DELETE FROM SinhVien WHERE Ma_Sv = IN_Ma_Sv;
DELETE FROM HuongDan WHERE Ma_Sv = IN_Ma_Sv;

END$$
DELIMITER ;

call  P_Cau5 ('4');
-- cach 1 -- 
ALTER TABLE HuongDan
DROP FOREIGN KEY Ma_Sv;
ALTER TABLE HuongDan
ADD CONSTRAINT FK_SV FOREIGN KEY (Ma_Sv) REFERENCES SinhVien(Ma_Sv) ON DELETE CASCADE ;
