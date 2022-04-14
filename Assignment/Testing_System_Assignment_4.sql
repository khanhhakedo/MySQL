-- Question 1: Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ--
use testingsytemassignment;
SELECT a.Fullname,d.department_name FROM `Account` a
join Department d on d.DEpartment_id = a.department_id;

-- Question 2: Viết lệnh để lấy ra thông tin các account được tạo sau ngày 20/12/2010


-- lấy ra danh sach nhân viên chưa có phòng ban
select * from `account` a
left join department d on a.Department_ID = d.Department_ID
-- where a.Department_ID is null
union
select * from `account` a
right join department d on a.Department_ID = d.Department_ID;
-- where a.Department_ID is null;


-- Question 3: Viết lệnh để lấy ra thông tin của các nhân viên có chức vụ developer(DEV)
select a.*,b.Position_Name from `account` a
join `position` b
on a.position_id = b.Position_ID
where b.Position_Name = 'dev';

-- Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên
-- nhóm thành 1 nhóm => count => đặt điều kiện (Danh sách vừa đếm > 3)
select *, count(a.Department_ID) from department b
join `account` a
on a.Department_ID = b.Department_ID
group by a.Department_ID
HAVING count(a.Department_ID) > 1;

-- Question 5: Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều
-- nhất 

select b.Question_ID,a.Content, count(b.Question_ID) as Soluong from question a
					join exam_question b
					on a.Question_ID = b.Question_ID
					GROUP BY b.Question_ID   
                    having count(b.Question_ID) = ( select max(Soluong) from ( select b.Question_ID, count(b.Question_ID) as Soluong from question a
					join exam_question b
					on a.Question_ID = b.Question_ID
					GROUP BY b.Question_ID) as abc)
                    



