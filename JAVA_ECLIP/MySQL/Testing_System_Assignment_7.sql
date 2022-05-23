USE testingsystem;

-- Exercise 1: Tiếp tục với Database Testing System -- 
/* Question 1: Tạo trigger không cho phép người dùng nhập vào Group có ngày tạo
trước 1 năm trước */

DROP TRIGGER IF EXISTS Trigger_Question_1;
DELIMITER $$
CREATE TRIGGER Trigger_Question_1
BEFORE INSERT ON `Group`
FOR EACH ROW
BEGIN 
DECLARE V_Truochientai1nam DATETIME;
SET V_Truochientai1nam = (DATE_SUB(NOW(),INTERVAL 1 YEAR));
	IF NEW.`CreateDate` < V_Truochientai1nam THEN
		SIGNAL SQLSTATE '12345' 
		SET MESSAGE_TEXT='Ngay tao bi loi';
        
	END IF;

END $$
DELIMITER ;

SHOW TRIGGERS;


/* Question 2: Tạo trigger Không cho phép người dùng thêm bất kỳ user nào vào department "Sale" nữa, khi thêm thì hiện ra thông báo "Department
"Sale" cannot add more user" */
DROP TRIGGER IF EXISTS Trigger_Question_2;
DELIMITER $$
CREATE TRIGGER Trigger_Question_2
BEFORE INSERT ON `Account`
FOR EACH ROW
BEGIN 
	IF NEW.DepartmentID = (SELECT D.DepartmentID FROM Department D WHERE D.DepartmentName = 'sale') THEN
		SIGNAL SQLSTATE '12345' 
		SET MESSAGE_TEXT='Department_Sale cannot add more user';
	END IF;

END $$
DELIMITER ;
SHOW TRIGGERS;


-- Question 3: Cấu hình 1 group có nhiều nhất là 5 user
DROP TRIGGER IF EXISTS Trigger_Question_3;
DELIMITER $$
CREATE TRIGGER Trigger_Question_3
BEFORE INSERT ON `GroupAccount`
FOR EACH ROW
BEGIN 
DECLARE V_COUNT_Group TINYINT;
SELECT COUNT(AccountID) INTO V_COUNT_Group FROM GroupAccount GA WHERE NEW.GroupID = GA.GroupID GROUP BY GA.GroupID ;
	IF (V_COUNT_Group >=5)THEN 
		SIGNAL SQLSTATE '12345' 
		SET MESSAGE_TEXT='So nguoi trong Group >5 ';
	END IF;

END $$
DELIMITER ;


-- Question 4: Cấu hình 1 bài thi có nhiều nhất là 10 Question
DROP TRIGGER IF EXISTS Trigger_Question_4;
DELIMITER $$
CREATE TRIGGER Trigger_Question_4
BEFORE INSERT ON `ExamQuestion`
FOR EACH ROW
BEGIN 
		DECLARE V_COUNT_Exam TINYINT;
		SELECT COUNT(EQ.QuestionID) INTO V_COUNT_Exam FROM ExamQuestion EQ WHERE NEW.ExamID=EQ.ExamID GROUP BY EQ.ExamID;
		IF (V_COUNT_Exam >=10) THEN
			SIGNAL SQLSTATE '12345' 
			SET MESSAGE_TEXT='So question > 10 ';
	END IF;

END $$
DELIMITER ;

/* Question 5: Tạo trigger không cho phép người dùng xóa tài khoản có email là
admin@gmail.com (đây là tài khoản admin, không cho phép user xóa),
còn lại các tài khoản khác thì sẽ cho phép xóa và sẽ xóa tất cả các thông
tin liên quan tới user đó */ 

DROP TRIGGER IF EXISTS Trigger_Question_5;
DELIMITER $$
CREATE TRIGGER Trigger_Question_5
BEFORE DELETE ON `Account`
FOR EACH ROW
BEGIN 

	IF (OLD.Email = 'admin@gmail.com')THEN 
		SIGNAL SQLSTATE '12345' 
		SET MESSAGE_TEXT='Email Admin khong duoc xoa ';
	END IF;

END $$
DELIMITER ;

DELETE FROM `Account` WHERE Email = 'admin@gmail.com';

/* Question 6: Không sử dụng cấu hình default cho field DepartmentID của table
Account, hãy tạo trigger cho phép người dùng khi tạo account không điền
vào departmentID thì sẽ được phân vào phòng ban "waiting Department" */
-- Cach 1 --

DROP TRIGGER IF EXISTS Trigger_Question_6;
DELIMITER $$
CREATE TRIGGER Trigger_Question_6
BEFORE INSERT ON `Account`
FOR EACH ROW
BEGIN 
DECLARE V_DepartmentID NVARCHAR(50);
SELECT D.DepartmentID INTO V_DepartmentID  FROM Department D WHERE D.DepartmentName ='No person'; 
	IF (NEW.DepartmentID IS NULL) THEN 
								SET NEW.DepartmentID = V_DepartmentID ;
	END IF;

END $$
DELIMITER ;
INSERT INTO `Account`(Email , Username
, FullName ,PositionID,

CreateDate)
VALUES ('Emailqwe1@gmail.com' ,
'Usernamwewqewe1' ,'Fullnameweqwe1' ,'2'
,'2020-03-05');

-- Cach 2 --
DROP TRIGGER IF EXISTS Trigger_Question_6_1;
DELIMITER $$
CREATE TRIGGER Trigger_Question_6_1
BEFORE INSERT ON `Account`
FOR EACH ROW
BEGIN 
	IF (NEW.DepartmentID IS NULL) THEN 
								UPDATE `Account`
                                SET DepartmentID = 10 ;
	END IF;

END $$
DELIMITER ;
INSERT INTO `Account`(Email , Username
, FullName,PositionID,

CreateDate)
VALUES ('Emailqmewwqeqweerewrail.com' ,
'Usernaewewqewe1' ,'Fullnaweeqwe1' ,'3'
,'2022-03-05');

-- Question 7: Cấu hình 1 bài thi chỉ cho phép user tạo tối đa 4 answers cho mỗi question, trong đó có tối đa 2 đáp án đúng. 
DROP TRIGGER IF EXISTS Trigger_Question_7;
DELIMITER $$
CREATE TRIGGER Trigger_Question_7
BEFORE INSERT ON `Answer`
FOR EACH ROW
BEGIN 
			DECLARE V_COUNT_Answer TINYINT;
			DECLARE V_COUNT_IsCorrect TINYINT;
			SELECT COUNT(A.Answer) INTO V_COUNT_Answer  FROM Answer A WHERE NEW.QuestionID = A.QuestionID GROUP BY A.QuestionID;
			SELECT COUNT(A1.IsCorrect) INTO V_COUNT_IsCorrect  FROM Answer A1 WHERE NEW.QuestionID = A1.QuestionID GROUP BY A1.QuestionID;
    IF (V_COUNT_Answer>=4 OR V_COUNT_IsCorrect>=2) THEN
    SIGNAL SQLSTATE '12345' 
	SET MESSAGE_TEXT='So Answer lon hon 4 va co nhieu hon 2 cau tra loi dung ';
	END IF;

END $$
DELIMITER ;
-- Question 8: Viết trigger sửa lại dữ liệu cho đúng: Nếu người dùng nhập vào gender của account là nam, nữ, chưa xác định Thì sẽ đổi lại thành M, F, U cho giống với cấu hình ở database

DROP TRIGGER IF EXISTS Trigger_Question_8;
 DELIMITER $$
 CREATE TRIGGER Trigger_Question_8
 BEFORE INSERT ON `Account` 
 FOR EACH ROW
 BEGIN 
	IF NEW.Gender = 'Nam' THEN 
		SET NEW.Gender = 'M'; 

	ELSEIF NEW.Gender = 'Nu' THEN 
		SET NEW.Gender = 'F'; 

	ELSEIF NEW.Gender = 'Chưa xác định' THEN 
		SET NEW.Gender = 'U';
 END IF; 
 END $$
DELIMITER ;
-- Question 9: Viết trigger không cho phép người dùng xóa bài thi mới tạo được 2 ngày
DROP TRIGGER IF EXISTS Trigger_Question_9;
 DELIMITER $$
 CREATE TRIGGER Trigger_Question_9
 BEFORE DELETE ON `Exam` 
 FOR EACH ROW 
 BEGIN 
 DECLARE v_CreateDate DATETIME;
 SET v_CreateDate = DATE_SUB(NOW(),INTERVAL 2 DAY); 
 IF (OLD.CreateDate > v_CreateDate) THEN 
 SIGNAL SQLSTATE '12345' 
 SET MESSAGE_TEXT = 'Cant Delete This Exam!!'; 
 END IF ; 
 END $$ DELIMITER ;


-- Question 10: Viết trigger chỉ cho phép người dùng chỉ được update, delete các question khi question đó chưa nằm trong exam nào

/* Question 12: Lấy ra thông tin exam trong đó: Duration <= 30 thì sẽ đổi thành giá trị "Short time" 30 < Duration <= 60 thì sẽ đổi thành giá trị "Medium time"
Duration > 60 thì sẽ đổi thành giá trị "Long time" */


/* Question 13: Thống kê số account trong mỗi group và in ra thêm 1 column nữa có tên là the_number_user_amount và mang giá trị được quy định như sau:
Nếu số lượng user trong group =< 5 thì sẽ có giá trị là few
Nếu số lượng user trong group <= 20 và > 5 thì sẽ có giá trị là normal
Nếu số lượng user trong group > 20 thì sẽ có giá trị là higher */

SELECT GA.GroupID, COUNT(GA.GroupID), CASE
 WHEN COUNT(GA.GroupID) <= 5 THEN 'few'
 WHEN COUNT(GA.GroupID) <= 20 THEN 'normal' ELSE 'higher' 
 END AS the_number_user_amount
FROM groupaccount GA 
GROUP BY GA.GroupID;


-- Question 14: Thống kê số mỗi phòng ban có bao nhiêu user, nếu phòng ban nào không có user thì sẽ thay đổi giá trị 0 thành "Không có User"
SELECT D.DepartmentName, CASE 
WHEN COUNT(A.DepartmentID) = 0 THEN 'Không có User' 
ELSE COUNT(A.DepartmentID) END AS SL 
FROM department D
LEFT JOIN account A ON D.DepartmentID = A.DepartmentID 
GROUP BY d.DepartmentID;
