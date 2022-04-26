USE testingsystem;

-- Exercise 1: Tiếp tục với Database Testing System (Sử dụng subquery hoặc CTE)

-- Question 1: Tạo view có chứa danh sách nhân viên thuộc phòng ban sale
-- tao VIEW
CREATE VIEW VIEW_SALE AS
	SELECT A.*
	FROM `Account` A , Department D
	WHERE A.DepartmentID = D.DepartmentID  
	AND  A.AccountID IN (SELECT A1.AccountID
								FROM `Account` A1
								JOIN Department D1
								ON A1.DepartmentID = D1.DepartmentID 
								WHERE D1.DepartmentName ='Sale'); 

-- Tao CTE
WITH CTE_AccountID AS (
	SELECT A1.AccountID
		FROM `Account` A1
		JOIN Department D1
		ON A1.DepartmentID = D1.DepartmentID 
		WHERE D1.DepartmentName ='Sale')
SELECT A.*
FROM `Account` A , Department D
WHERE A.DepartmentID = D.DepartmentID  
AND  A.AccountID IN (SELECT * FROM CTE_AccountID);


-- Question 2: Tạo view có chứa thông tin các account tham gia vào nhiều group nhất
-- tao VIEW
CREATE VIEW VIEW_ThongTinAccount AS
	SELECT A.*, COUNT(A.AccountID) AS SoGroup
	FROM `ACCOUNT` A
	JOIN GroupAccount GA
	ON A.AccountID = GA.AccountID
	GROUP BY GA.GroupID
	HAVING  COUNT(A.AccountID) = (SELECT COUNT(GA.ACCOUNTID)
									FROM GroupAccount GA
									GROUP BY GA.GroupID
									ORDER BY COUNT(GA.ACCOUNTID) DESC LIMIT 1);
                                
-- tao CTE
WITH CTE_COUNT_AccountID AS (
	SELECT COUNT(GA.ACCOUNTID)
			FROM GroupAccount GA
			GROUP BY GA.AccountID
			ORDER BY COUNT(GA.ACCOUNTID) DESC LIMIT 1)
SELECT A.*, COUNT(A.AccountID) AS SoGroup
FROM `ACCOUNT` A
JOIN GroupAccount GA
ON A.AccountID = GA.AccountID
GROUP BY GA.AccountID
HAVING  COUNT(A.AccountID) = (SELECT * FROM CTE_COUNT_AccountID); 



/* Question 3: Tạo view có chứa câu hỏi có những content quá dài (content quá 300 từ
được coi là quá dài) và xóa nó đi */
CREATE VIEW CauQuaDai AS
	SELECT *
	FROM `Question` Q
	WHERE Q.QuestionID IN (SELECT Q2.QuestionID
							FROM `Question`Q2
							WHERE LENGTH(Content) > 300);
                        
DROP VIEW CauQuaDai;                       
-- Question 4: Tạo view có chứa danh sách các phòng ban có nhiều nhân viên nhất
CREATE VIEW PhongBanNhieuNhanVienNhat AS
	SELECT A.DepartmentID  
	FROM `Account` A
	HAVING A.DepartmentID = (SELECT COUNT(A1.AccountID)
							FROM `Account` A1
							GROUP BY A1.DepartmentID
							ORDER BY COUNT(A1.AccountID) DESC LIMIT 1);

-- Question 5:  Tạo view có chứa tất các các câu hỏi do user họ Nguyễn tạo                                                                                                                                                
SELECT *
FROM Question Q
JOIN `Account` A
ON A.AccountID = Q.CreatorID
WHERE substring_index(Fullname,' ',1) = 'Nguyen'
