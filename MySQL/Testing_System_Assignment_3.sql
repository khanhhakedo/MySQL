
USE testingsystem; 

/* Question 2:lấy ra tất cả các phòng ban */
SELECT * 
FROM Department;

/* Question 3:lấy ra id của phòng ban "Sale" */
SELECT DepartmentID
 FROM Department 
 WHERE DepartmentName = 'Sale';

/* Question 4:Lấy ra thông tin account có full name dài nhất  */
select * 
from `account` 
WHERE length(Fullname) = (select max(length(Fullname)) from `Account`);

/* Question 5: Lấy ra thông tin account có full name dài nhất và thuộc phòng ban có id
= 3 */
/* Cach 1 : fullname dài nhất trong tất cả các nhân viên và nhân viên đó có ID =3 */
select * 
from `Account` 
WHERE (length(FullName) = (select max(length(FullName)) from `Account`)) AND (DepartmentID= 3);

/* cach 2 nhân viên có fullname dài nhất trong các nhân viên có departmentid =3 */
SELECT * FROM `Account`
WHERE (length(fullname) = (select max(length(abc)) as max from (SELECT fullname AS abc FROM `Account` WHERE DepartmentID =3) as bcd) ) AND DepartmentID =3;
/* (SELECT fullname AS abc FROM `Account` WHERE DepartmentID =3);
(select max(length(abc)) as max from (SELECT fullname AS abc FROM `Account` WHERE DepartmentID =3) as bcd); */


/* Question 6:Lấy ra tên group đã tham gia trước ngày 20/12/2022 */
SELECT GroupName
FROM `GROUP`
WHERE CreateDate < '2020/12/20';


/* Question 7:Lấy ra ID của question có >= 4 câu trả lời */
SELECT QuestionID, COUNT(AnswerID)
FROM Answer
GROUP BY QuestionID
HAVING COUNT(AnswerID) >=4; 


/* Question 8:Lấy ra các mã đề thi có thời gian thi >= 60 phút và được tạo trước ngày
20/12/2019 */
SELECT ExamID
FROM exam
WHERE (Duration >= 60) AND (CreateDate <= '2019/12/20');


/* Question 9: Lấy ra 5 group được tạo gần đây nhất */
SELECT *
FROM `GROUP`
ORDER BY CreateDate LIMIT 5;

 
 /* Question 10: Đếm số nhân viên thuộc department có id = 2 */
SELECT AccountID, COUNT(AccountID)
FROM `Account`
GROUP BY DepartmentID
HAVING DepartmentID = 2;

 
  /* Question 11:Lấy ra nhân viên có tên bắt đầu bằng chữ "D" và kết thúc bằng chữ "o" */
SELECT *
FROM `Account`
WHERE FullName LIKE 'D%O';


 /* Question 12:Xóa tất cả các exam được tạo trước ngày 20/12/2019 */
DELETE FROM examquestion WHERE examid IN (SELECT examid FROM exam WHERE CreateDate < '2019/12/20');
DELETE FROM exam WHERE CreateDate < '2019/12/20';
 


/* Question 13 Xóa tất cả các question có nội dung bắt đầu bằng từ "câu hỏi" */
 DELETE FROM Answer WHERE QuestionID IN 	(SELECT QuestionID FROM `Question`
										WHERE Content LIKE "Cau hoi%");
DELETE FROM Question
WHERE Content LIKE "Cau hoi%";


/* Question 14: Update thông tin của account có id = 5 thành tên "Nguyễn Bá Lộc" và
email thành loc.nguyenba@vti.com.vn */
UPDATE `account`
SET FullName = 'Nguyễn Bá Lộc'
WHERE AccountID = 5;


/* Question 15: Update account có id = 5 sẽ thuộc group có id = 4 */
UPDATE GroupAccount 
SET GroupID = '4'
WHERE AccountID = '5';



