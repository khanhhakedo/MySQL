package com.vti.backend.Polymorphism;

public class Exercise2 {
	/* Question 1: Interface Management
	Tạo 1 class Student gồm các property id, name, group(int)
	Tạo 1 interface IStudent bao gồm các method : điểmDanh(), họcBài(), đi dọn vệ sinh()
	Class Student sẽ implement interface như sau:
	Method điểm danh() sẽ in ra nội dung như sau:
	"Nguyễn Văn A điểm danh"
	"Nguyễn Văn B điểm danh"
	"Nguyễn Văn C điểm danh"
	….
	Method học Bài () sẽ in ra nội dung như sau:
	"Nguyễn Văn A đang học bài"
	"Nguyễn Văn B đang học bài "
	"Nguyễn Văn C đang học bài "
	…
	Tương tự với các method còn lại
	Hãy viết chương trình thực hiện các lệnh sau:
	a) Tạo 10 học sinh, chia thành 3 nhóm
	b) Kêu gọi cả lớp điểm danh.
	c) Gọi nhóm 1 đi học bài
	d) Gọi nhóm 2 đi dọn vệ sinh */
	
	
	/*Question 2 (Optional): Abstract Management
	Tạo 1 class Person chứa các property sau: tên, giới tính, ngày sinh, địa chỉ với đầy đủ 
	getter setter, constructor không tham số, constructor đầy đủ tham số
	a) Viết phương thức inputInfo(), nhập thông tin Person từ bàn phím
	b) Viết phương thức showInfo(), hiển thị tất cả thông tin Person
	3
	Tạo class Student thừa kế Person, lưu trữ các thông tin một sinh viên: Mã sinh viên, 
	Điểm trung bình, Email
	a) Override phương thức inputInfo(), nhập thông tin Student từ bàn phím
	b) Override phương thức showInfo(), hiển thị tất cả thông tin Student
	c) Viết phương thức xét xem Student có được học bổng không? Điểm trung bình từ 8.0 trở lên
			là được học bổng */ 
	
	
	/* Question 3: This & Super, Overriding
	Tạo 1 class HinhChuNhat có 2 method: tính chu vi và tính diện tích. Hãy implement 2 method này.
	Tiếp theo hãy tạo 1 class HinhVuong extends HinhChuNhat, có 2 method tính chu vi và tính diện tích
	Chú ý:
mà sẽ gọi theo HinhChuNhat.tinhChuVi(), HinhChuNhat.tinhDienTich() )
	Và trong mỗi method print thêm dòng "Tính diện tích/ chu vi theo Hình Vuông/ Hình Chữ Nhật"
	Question 4 (Optional):
	Tạo 1 class MyMath có method sum có 2 parameter (có thể là int, có thể là byte, có thể là float), 
	sau đó trả về tổng của 2 số đó. Hãy viết chương trình demo.
	Question 5 (Optional):
	Điện thoại di động được chia thành 2 loại: điện thoại cổ điển và điện thoại thông minh. Cả 2 loại 
	điện thoại này đều có 4 chức năng cơ bản: nghe và gọi điện thoại, gửi và nhận tin nhắn văn bản. Riêng điện thoại thông minh thì có thêm các chức năng: sử dụng 3G, chụp hình. Điện thoại cổ điển có sẵn chức năng nghe đài radio (điện thoại thông minh không có sẵn chức năng này). Cả điện thoại cổ điển và điện thoại thông minh đều có thể sử dụng làm vũ khí
	(trong tình huống người dùng cần sử dụng để tấn công kẻ xấu).
	Hãy thiết kế các class, interface, method */



}
