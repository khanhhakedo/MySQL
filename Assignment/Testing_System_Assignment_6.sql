USE Testingsystem;
-- Exercise 1: Tiếp tục với Database Testing System
/*  Question 1: Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các
account thuộc phòng ban đó */
DROP PROCEDURE IF EXISTS Account_DepartmentName;
DELIMITER $$
CREATE PROCEDURE Account_DepartmentName (IN Input_DepartmentName NVARCHAR(50))
BEGIN
SELECT A.*
FROM `Account` A
JOIN Department D ON A.DepartmentID = D.DepartmentID
WHERE D.DepartmentName = Input_DepartmentName;
END$$
DELIMITER ;


-- Question 2: Tạo store để in ra số lượng account trong mỗi group

DROP PROCEDURE IF EXISTS Account_Group;
DELIMITER $$
CREATE PROCEDURE Account_Group (IN Input_Group NVARCHAR(50))
BEGIN
WITH COUNT_Group AS (
SELECT G.GroupID, G.Groupname,COUNT(A.AccountID) AS SoLuong
FROM GroupAccount GA
LEFT JOIN `Account` A  ON A.AccountID = GA.AccountID
RIGHT JOIN `Group` G ON G.GroupID = GA.GroupID
GROUP BY G.GroupID)

SELECT *
FROM COUNT_Group
WHERE GroupID = Input_Group

UNION 

SELECT *
FROM COUNT_Group
WHERE GroupName LIKE CONCAT('%',Input_Group,'%');
END$$
DELIMITER ;


/* Question 3: Tạo store để thống kê mỗi type question có bao nhiêu question được tạo
trong tháng hiện tại */



-- Question 4: Tạo store để trả ra id của type question có nhiều câu hỏi nhất

DROP PROCEDURE IF EXISTS ID_Type_Question;
DELIMITER $$
CREATE PROCEDURE ID_Type_Question (OUT Output_TypeID TINYINT UNSIGNED)
BEGIN
WITH Max_Count_TypeID AS (
SELECT Q1.TypeID
					From Question Q1
					GROUP BY Q1.TypeID
					ORDER BY COUNT(Q1.QuestionID) DESC LIMIT 1)
                    
SELECT Q.TypeID INTO Output_TypeID
FROM Question Q
GROUP BY Q.TypeID 
HAVING Q.TypeID = (SELECT * FROM Max_Count_TypeID) ;
END$$
DELIMITER ;
Set @v_TypeID = 0;
CALL ID_Type_Question(@v_TypeID);
SELECT @v_TypeID;


-- Question 5: Sử dụng store ở question 4 để tìm ra tên của type question
SELECT TypeName
FROM Typequestion
WHERE TypeID = @v_TypeID;


/* Question 6: Viết 1 store cho phép người dùng nhập vào 1 chuỗi và trả về group có tên
chứa chuỗi của người dùng nhập vào hoặc trả về user có username chứa chuỗi của người dùng nhập vào */
DROP PROCEDURE IF EXISTS GROUP_USER;
DELIMITER $$
CREATE PROCEDURE GROUP_USER (IN Input_GroupName_AccountID NVARCHAR(50))
BEGIN
WITH Account_Group AS (
SELECT A.*, G.GroupID, G.GroupName
FROM `Group` G
JOIN `Account` A ON A.AccountID = G.CreatorID)

SELECT GroupID, AccountID
FROM Account_Group
WHERE GroupName LIKE CONCAT("%",Input_GroupName_AccountID,"%")

UNION 

SELECT GroupID, AccountID
FROM Account_Group
WHERE UserName LIKE CONCAT("%",Input_GroupName_AccountID,"%");
END$$
DELIMITER ;


/*  Question 7: Viết 1 store cho phép người dùng nhập vào thông tin fullName, email và trong store sẽ tự động gán:
username sẽ giống email nhưng bỏ phần @..mail đi
positionID: sẽ có default là developer
departmentID: sẽ được cho vào 1 phòng chờ
Sau đó in ra kết quả tạo thành công */


-- Question 8: Viết 1 store cho phép người dùng nhập vào Essay hoặc Multiple-Choice để thống kê câu hỏi essay hoặc multiple-choice nào có content dài nhất
-- Question 9: Viết 1 store cho phép người dùng xóa exam dựa vào ID
/* Question 10: Tìm ra các exam được tạo từ 3 năm trước và xóa các exam đó đi (sử dụng store ở câu 9 để xóa)
Sau đó in số lượng record đã remove từ các table liên quan trong khi removing /*
/*  Question 11: Viết store cho phép người dùng xóa phòng ban bằng cách người dùng
nhập vào tên phòng ban và các account thuộc phòng ban đó sẽ được chuyển về phòng ban default là phòng ban chờ việc */
-- Question 12: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong năm nay

/* Question 13: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong 6 tháng gần đây nhất
(Nếu tháng nào không có thì sẽ in ra là "không có câu hỏi nào trong
tháng") */