
USE TestingSytemAssignment;

-- Exercise 1 --

/* Question 1: Thêm ít nhất 10 record vào mỗi table */

/* TABLE Department */
INSERT INTO Department (Department_Name) VALUES 
('Marketing'),
('Sale'),
('Bao ve'),
('Nhan su'),
('Ky thuat'),
('Ve sinh'),
('Du an'),
('Hien truong'),
('Nha bep'),
('Giam doc');


/* TABLE `Position` */
INSERT INTO `Position` VALUES
('1','Dev'),
('2','Test'),
('3','PM'),
('4','Scrum'),
('5','Master');


/* TABLE `Account` */
INSERT INTO `Account` VALUES
('1','Xanhnguyen','Nguyen Van Xanh','1','1','1996-03-12'),
('2','Tamnguyen','Nguyen Tam','2','2','1996-03-12'),
('3','Anhnguyen','Nguyen Anh','3','3','1996-05-12'),
('4','Trungnguyen','Nguyen Trung','4','4','1996-06-12'),
('5','Khanhnguyen','Nguyen Khanh','5','5','1996-03-12'),
('6','Ducanh','Nguyen Duc Anh','6','1','1996-04-12'),
('7','Quynhnguyen','Nguyen Quynh','7','2','1996-05-12'),
('8','Thiennguyen','Nguyen Thien','8','3','1996-06-12'),
('9','Hangnguyen','Nguyen Hang','9','4','1996-07-12'),
('10','Phucnguyen','Phuc Nguyen','10','5','1996-08-12'),
('11','khanhhakedo123','Nguyen khanh Khanhhakedo','3','3','1996-03-12');

/* TABLE `Group` */
INSERT INTO `Group` VALUES
('1','Phat trien','1','2022-04-09'),
('2','Tu hoc','3','2022-05-09'),
('3','Quyet tam','5','2022-06-09'),
('4','My SQL','7','2022-07-09'),
('5','Java web','8','2022-08-09');


/* TABLE Group_Account */
INSERT INTO Group_Account VALUES
('1','1',NULL),
('2','3','2022-05-09'),
('3','5',NULL),
('4','7','2022-07-09'),
('5','8','2022-08-09');


/* TABLE Type_Question */
INSERT INTO Type_Question VALUES
('1','Essay'),
('2','Multiple-Choice'),
('3','Essay'),
('4','Multiple-Choice'),
('5','Essay'),
('6','Multiple-Choice'),
('7','Multiple-Choice'),
('8','Essay'),
('9','Essay'),
('10','Multiple-Choice');


/* TABLE Category_Question */
INSERT INTO Category_Question VALUES
('1','Java'),
('2','NET'),
('3','SQL'),
('4','Postman'),
('5','Ruby');


/* TABLE Question  */
INSERT INTO Question  VALUES
('1','Tu hoc SQL nhu nao','1','2','1','2022-12-03'),
('2','Danh bao nhieu gio de CODE','2','4','3','2022-12-03'),
('3','Muc tieu hoc xong khoa hoc','3','6','5',NULL),
('4','MUon muc luon bao nhieu','4','8','7',NULL),
('5','Hoc them gi sau khi tot nghiep','5','10','9','2022-12-03');


/* TABLE Answer  */
INSERT INTO Answer VALUES
('1','Hoc them ve Front end va cac ngon ngu lap trinh khac','5','1'),
('2','Luong khoi diem 11 trieu','4','1'),
('3','Lap trinh back end java','3','1'),
('4','42h tren 1 tuan','2','2'),
('5','Xem giao trinh va tu lam truoc bai tap','1','2');


/* TABLE Exam */
INSERT INTO Exam VALUES
('1','A1','Van dap','5','60:00','9','2022-12-03'),
('2','A2','Thuc hanh','4','55:00','7','2022-12-03'),
('3','A3','Thuc hanh','3','120:00','5',NULL),
('4','A4','Ly thuyet','2','60:00','3','2022-12-03'),
('5','A5','Van dap','1','60:00','1',NULL);


/* TABLE Exam */
INSERT INTO Exam_Question VALUES
('1','5'),
('2','3'),
('3','4'),
('4','1'),
('5','2');


/* Question 2:lấy ra tất cả các phòng ban */
SELECT * 
FROM Department;

/* Question 3:lấy ra id của phòng ban "Sale" */
SELECT Department_ID
 FROM Department 
 WHERE Department_Name = 'Sale';

/* Question 4:Lấy ra thông tin account có full name dài nhất  */
select * 
from `account` 
WHERE length(Fullname) = (select max(length(Fullname)) from `Account`);

/* Question 5: Lấy ra thông tin account có full name dài nhất và thuộc phòng ban có id
= 3 */
/* Cach 1 */
select *
from `account`
where department_id = '3'
order by length(fullname) desc limit 1 offset 1; 

/* cach 2 */
select * 
from `account` 
WHERE (length(Fullname) = (select max(length(Fullname)) from `Account`)) AND (Department_id = 3);

/* Question 6:Lấy ra tên group đã tham gia trước ngày 20/12/2022 */

select group_name 
from `group` 
where Create_Date < '2022-12-20';

/* Question 7:Lấy ra ID của question có >= 4 câu trả lời */
SELECT Question_ID, count(Answer_id) 
 FROM Answer  
 group by question_id 
 having count(Answer_id)  >= 4 ;



/* Question 8:Lấy ra các mã đề thi có thời gian thi >= 60 phút và được tạo trước ngày
20/12/2019 */
SELECT `Code` 
FROM Exam 
WHERE Duration >= '60:00' AND Create_Date <= '2019-12-20';

/* Question 9: Lấy ra 5 group được tạo gần đây nhất */
 SELECT * 
 FROM `Group` 
 ORDER BY Create_Date DESC LIMIT 5;
 
 /* Question 10: Đếm số nhân viên thuộc department có id = 2 */
 select count(Department_ID) 
 from department 
 WHERE department_id = 2;

 
  /* Question 11:Lấy ra nhân viên có tên bắt đầu bằng chữ "D" và kết thúc bằng chữ "o" */
SELECT * 
FROM `Account` 
WHERE Fullname LIKE 'D%o';

 /* Question 12:Xóa tất cả các exam được tạo trước ngày 20/12/2022 */
 
delete from `group` where Create_Date <= '2022/12/20';
/* Question 13 Xóa tất cả các question có nội dung bắt đầu bằng từ "câu hỏi" */

/* Question 14: Update thông tin của account có id = 5 thành tên "Nguyễn Bá Lộc" và
email thành loc.nguyenba@vti.com.vn */
UPDATE `account`
SET Fullname = 'Nguyễn Bá Lộc'
WHERE Account_ID = 5;
/* Question 15: Update account có id = 5 sẽ thuộc group có id = 4 */
UPDATE 