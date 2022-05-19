package com.vti.backend;

public class Excercise5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Chú ý: áp dụng cả encapsulation cho các question ở dưới
		/* Question 1: inheritance
		Một đơn vị sản xuất gồm có các cán bộ là công nhân, kỹ sư, nhân viên.
		Mỗi cán bộ cần quản lý các dữ liệu: Họ tên, tuổi, giới tính(name, nữ, khác), địa chỉ.
		Cấp công nhân sẽ có thêm các thuộc tính riêng: Bậc (1 đến 10).
		Cấp kỹ sư có thuộc tính riêng: Nghành đào tạo.
		Các nhân viên có thuộc tính riêng: công việc.
		Hãy xây dựng các lớp CongNhan, KySu, NhanVien kế thừa từ lớp CanBo. */
		
		
		/* Question 2: Tiếp tục Question 1
		Xây dựng lớp QLCB(quản lý cán bộ) cài đặt các phương thức thực hiện các chức năng sau:
		a) Thêm mới cán bộ.
		b) Tìm kiếm theo họ tên.
		c) Hiện thị thông tin về danh sách các cán bộ.
		d) Nhập vào tên của cán bộ và delete cán bộ đó
		e) Thoát khỏi chương trình. */
		
		/* Question 3 (Optional): constructor inheritance
		Tạo class abstract Person gồm các property name và tạo constructor có 1 parameter name
		Tạo class abstract Student kế thừa Person gồm các property id, name và tạo constructor 
		có 2 parameter id, name
		Tạo class HighSchoolStudent kế thừa Student bao gồm các property id, name, clazz 
		(Lớp đang học), desiredUniversity (trường đại học mong muốn vào) và tạo constructor có
		4 parameter id, name, clazz, desiredUniversity.
		Hãy khởi tạo Object HighSchoolStudent với các giá trị: id = 1, name = "Nam", 
		clazz = "Chuyên Văn", desiredUniversity = "Đại học công nghệ" */
		
		
		/* Question 4 (Optional):
		Một thư viện cần quản lý các tài liệu bao gồm Sách, Tạp chí, Báo. Mỗi tài liệu gồm 
		có các thuộc tính sau: Mã tài liệu(Mã tài liệu là duy nhất), Tên nhà xuất bản, số bản phát hành.
		Các loại sách cần quản lý thêm các thuộc tính: tên tác giả, số trang.
		Các tạp chí cần quản lý thêm: Số phát hành, tháng phát hành.
		Các báo cần quản lý thêm: Ngày phát hành.
		Xây dựng chương trình để quản lý tài liệu (QLTV) cho thư viện một cách hiệu quả.
		Xây dựng lớp QuanLySach có các chức năng sau
		a) Thêm mới tài liêu: Sách, tạp chí, báo.
		b) Xoá tài liệu theo mã tài liệu.
		c) Hiện thị thông tin về tài liệu.
		d) Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo.
		e) Thoát khỏi chương trình. */ 
	}
}
