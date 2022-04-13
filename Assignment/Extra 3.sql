USE extra;

-- Question 1: Thêm ít nhất 10 bản ghi vào table --

INSERT INTO Student
VALUE		('1','Nguyen A', '1996-03-12', 'Male','10', '15', '30', 'A1','NULL','VTI1'),
			('2','Tran B', '1997-10-23', 'Male', '20', '15', '30', 'A0', 'Good','VTI2'),
            ('3', 'Bui C', '1999-03-03', 'Female', '5', '5', '40', 'B1','NULL','VTI3'),
            ('4','Nguyen Dc','1999-05-18','Unknow','20','20','35','C0','Very Good','VTI4'),
            ('5','Tran Dan','2000-05-02','Female','10','10','30','B1','Null','VTI5'),
            ('6','Bui Van D','2001-03-09','Unknow','15', '15', '35','A1','Very Good','VTI6'),
            ('7','Nguyen Van AB','1999-04-05','Male','8','10','30','A1','NULL','VTI7'),
            ('8','Tran Bich E','1996-05-09','Male','15','15','15','A0','NULL','VTI8'),
            ('9','Bui B', '1998-07-19','Female','16', '17','22','C0','NULL','VTI9'),
            ('10','Nguyen ABC','1995-03-05','Female','15','19','45','D1','NULL','VTI10');
            
-- Question 2: Viết lệnh để lấy ra tất cả các thực tập sinh đã vượt qua bài test đầu vào, nhóm chúng thành các tháng sinh khác nhau --
select * from student;
SELECT *
FROM Student
ORDER BY MONTH(Birth_Date ) ASC;

-- Question 3: Viết lệnh để lấy ra thực tập sinh có tên dài nhất, lấy ra các thông tin sau: tên, tuổi, các thông tin cơ bản (như đã được định nghĩa trong table) --

SELECT *, (year(now()) - year(birth_date)) as age
FROM Student
WHERE length(Full_name) = (SELECT max(length(Full_name)) From Student);

-- Question 4: Viết lệnh để lấy ra tất cả các thực tập sinh là ET, 1 ET thực tập sinh là những người đã vượt qua bài test đầu vào và thỏa mãn số điểm như sau: --
/* ET_IQ + ET_Gmath>=20
ET_IQ>=8
ET_Gmath>=8
ET_English>=18  */


SELECT *
FROM Student
WHERE (ET_IQ + ET_Gmath) >= 20 
AND (ET_IQ >= 8) 
AND (ET_Gmath >= 8) 
AND (ET_English >= 18);


-- Question 5: xóa thực tập sinh có TraineeID = 3 --
DELETE FROM Student 
WHERE Trainee_ID = 3;


-- Question 6: Thực tập sinh có TraineeID = 5 được chuyển sang lớp "2". Hãy cập nhật thông tin vào database --
UPDATE Student
SET Training_Class = '2'
WHERE Trainee_ID = '5' ;