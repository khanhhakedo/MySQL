
use testingsystem;

-- Exercise 1: Join

-- Question 1: Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ
 SELECT A.*, D.DepartmentName
 FROM `Account` A
JOIN Department D
ON A.DepartmentID = D.DepartmentID;

-- Question 2: Viết lệnh để lấy ra thông tin các account được tạo sau ngày 20/12/2010
SELECT *
FROM `Account`
WHERE CreateDate > '2010/12/20';


-- Question 3: Viết lệnh để lấy ra tất cả các developer
SELECT A.*, PositionName 
FROM `Account` A
JOIN `Position` P
ON A.PositionID = P.PositionID
WHERE P.PositionName = 'DEV';


-- Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên
SELECT DepartmentName, COUNT(AccountID) AS SoNhanVien
FROM Department D
JOIN `Account` A
ON D.DepartmentID = A.DepartmentID
GROUP BY A.DepartmentID
HAVING COUNT(AccountID) >=3;


/* Question 5: Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều
nhất */
SElECT *,COUNT(q.QuestionID) AS SoCauHoi
FROM ExamQuestion eq
JOIN question q ON eq.QuestionID = q.QuestionID
GROUP BY eq.QuestionID
HAVING COUNT(q.QuestionID) =(SElECT COUNT(eq1.QuestionID) 
							FROM ExamQuestion eq1
                            GROUP BY eq1.QuestionID 
                            ORDER BY COUNT(eq1.QuestionID) DESC 
                            LIMIT 1);
 -- cach 2
SElECT *,COUNT(q.QuestionID) AS SoCauHoi
FROM ExamQuestion eq
JOIN question q ON eq.QuestionID = q.QuestionID
GROUP BY eq.QuestionID
HAVING COUNT(q.QuestionID) =( SELECT MAX(ABC) FROM (SElECT COUNT(QuestionID) AS ABC  FROM ExamQuestion  GROUP BY QuestionID) AS BCD) ;

-- Question 6: Thông kê mỗi category Question được sử dụng trong bao nhiêu Question
SELECT C.*, COUNT(QuestionID)
FROM categoryquestion C
LEFT JOIN Question Q
ON C.CategoryID = Q.CategoryID
GROUP BY Q.CategoryID;


-- Question 7: Thông kê mỗi Question được sử dụng trong bao nhiêu Exam
SELECT Q.QuestionID, COUNT(ExamID) SoLanSuDungTRongDeThi
FROM ExamQuestion EQ
RIGHT JOIN Question Q ON EQ.QuestionID = Q.QuestionID
GROUP BY Q.QuestionID;


-- Question 8: Lấy ra Question có nhiều câu trả lời nhất
-- Cach 1
SELECT QuestionID,COUNT(AnswerID)
FROM Answer
GROUP BY QuestionID
HAVING COUNT(AnswerID) = (SELECT MAX(ABC) FROM (SELECT COUNT(AnswerID) AS ABC FROM Answer GROUP BY QuestionID) AS BCD);

-- Cach 2 
SELECT QuestionID,COUNT(AnswerID)
FROM Answer
GROUP BY QuestionID
HAVING COUNT(AnswerID) = (SELECT COUNT(AnswerID)FROM Answer GROUP BY QuestionID ORDER BY COUNT(AnswerID) DESC LIMIT 1);



-- Question 9: Thống kê số lượng account trong mỗi group
SELECT (G.GroupID) AS IDPhongBan, COUNT(GA.AccountID) AS SoNhanVien
FROM `Group` G
LEFT JOIN GroupAccount GA
ON G.GroupID = GA.GroupID
GROUP BY( G.GroupID);


-- Question 10: Tìm chức vụ có ít người nhất
-- Cach 1
SELECT PositionName, COUNT(AccountID)
FROM `Position` P
JOIN `Account` A
ON P.PositionID = A.PositionID
GROUP BY A.PositionID
HAVING COUNT(AccountID) = (SELECT COUNT(AccountID) FROM `Account` GROUP BY PositionID ORDER BY COUNT(AccountID) ASC LIMIT 1);


-- Cach 2
SELECT PositionName, COUNT(AccountID)
FROM `Position` P
JOIN `Account` A
ON P.PositionID = A.PositionID
GROUP BY A.PositionID
HAVING COUNT(AccountID) = (SELECT MIN(ABC) FROM (SELECT COUNT(AccountID) AS ABC FROM `ACCOUNT` GROUP BY PositionID) AS BDF);


-- Question 11: Thống kê mỗi phòng ban có bao nhiêu dev, test, scrum master, PM
 
SELECT D.DepartmentID,D.DepartmentName, P.PositionName, P.PositionID, count(P.PositionName) AS SoLuong 
FROM `account` A
RIGHT JOIN department D ON A.DepartmentID = D.DepartmentID
LEFT JOIN position P ON A.PositionID = P.PositionID
GROUP BY D.DepartmentID, P.PositionID;


-- Question 12: Lấy thông tin chi tiết của câu hỏi bao gồm: thông tin cơ bản question, loại câu hỏi, ai là người tạo ra câu hỏi, câu trả lời là gì, …
SELECT * 
FROM Question Q
JOIN `Account` A ON A.AccountID = Q.CreatorID
JOIN Typequestion T ON Q.TypeID = T.TypeID
JOIN Answer B ON Q.QuestionID = B.QuestionID;


-- Question 13: Lấy ra số lượng câu hỏi của mỗi loại tự luận hay trắc nghiệm
SELECT T.TypeName, COUNT(Q.QuestionID) AS SoCauHoi
FROM TypeQuestion T
JOIN Question Q
ON T.TypeID = Q.TypeID
GROUP BY Q.TypeID;


-- Question 14:Lấy ra group không có account nào 
SELECT GroupID
FROM `Group` G
LEFT JOIN `Account` A
ON G.CreatorID = A.AccountID
WHERE A.AccountID IS NULL;


-- Question 15: Lấy ra group không có account nào
SELECT GroupID
FROM `Group` G
LEFT JOIN `Account` A
ON G.CreatorID = A.AccountID
WHERE A.AccountID IS NULL;


-- Question 16: Lấy ra question không có answer nào
SELECT Q.QuestionID
FROM `Question` Q
LEFT JOIN `Answer` A
ON Q.QuestionID = A.QuestionID
WHERE A.QuestionID IS NULL;

-- Exercise 2: Union

-- Question 17:
-- a) Lấy các account thuộc nhóm thứ 1
SELECT *
FROM `Account`
WHERE DepartmentID = 1;

-- b) Lấy các account thuộc nhóm thứ 2
SELECT *
FROM `Account`
WHERE DepartmentID = 2;
-- c) Ghép 2 kết quả từ câu a) và câu b) sao cho không có record nào trùng nhau
SELECT A.*, GA.GroupID
FROM `Account` A
JOIN `GroupAccount` GA On A.AccountID = GA.AccountID
WHERE GA.GroupID =1

UNION

SELECT A.*, GA.GroupID
FROM `Account` A
JOIN `GroupAccount` GA On A.AccountID = GA.AccountID
WHERE GA.GroupID =2;


-- Question 18:
-- a) Lấy các group có lớn hơn 5 thành viên

SELECT GroupID, COUNT(AccountID) AS SoNhanVien
FROM GroupAccount
GROUP BY GroupID
HAVING COUNT(AccountID) >5;

-- b) Lấy các group có nhỏ hơn 7 thành viên
SELECT GroupID, COUNT(AccountID) AS SoNhanVien
FROM GroupAccount
GROUP BY GroupID
HAVING COUNT(AccountID) <7;

-- c) Ghép 2 kết quả từ câu a) và câu b)
SELECT GroupID, COUNT(AccountID) AS SoNhanVien
FROM GroupAccount
GROUP BY GroupID
HAVING COUNT(AccountID) >5

UNION 

SELECT GroupID, COUNT(AccountID) AS SoNhanVien
FROM GroupAccount
GROUP BY GroupID
HAVING COUNT(AccountID) <7;

                    



