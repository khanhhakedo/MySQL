package com.vti.backend.Abstraction;

public class Exercise1 {

	/* Question 1: Interface
	Tạo một interface có tên INews bao gồm method void Display(), float Calculate().
	Tạo một class News bao gồm thuộc tính:
	ID (int), Title (String), PublishDate (String), Author (String), Content (String) và AverageRate (float).
	Tạo các setter và getter cho từng thuộc tính, riêng AverageRate thì chỉ có getter.
	Implement các method trong interface INews như sau:
	a) Method Display() sẽ in ra Title, PublishDate, Author, Content và AverageRate của tin tức ra console.
	b) Method có tên Calculate() để thiết đặt thuộc tính
	Khai báo một array có tên Rates kiểu int gồm 3 phần tử
	AverageRate là trung bình cộng của 3 phần tử của array Rates.
	c) Tạo chương trình demo có tên là MyNews và tạo một menu lựa chọn gồm các mục sau:
	 Insert news
	 View list news
	 Average rate
	 Exit
	Nếu người dùng chọn 1 từ bàn phím thì tạo một object của class News và nhập giá trị cho các 
	thuộc tính Title, PublishDate, Author, Content sau đó yêu cầu người dùng nhập vào 3 đánh giá để 
	lưu vào Rates.
	Nếu người dùng chọn 2 từ bàn phím thì thực thi method Display().
	Nếu người dùng chọn 3 từ bàn phím thì thực hiện method Calculate() để tính đánh giá trung bình, 
	sau đó thực thi method Display().
	Trường hợp người dùng chọn 4 thì sẽ thoát khỏi chương trình. */ 
	
	/* Question 2 (Optional):
	2
	Các thí sinh dự thi đại học bao gồm các thí sinh thi khối A, B, và khối C. Các thí sinh cần quản
	lý các thông tin sau: Số báo danh, họ tên, địa chỉ, mức ưu tiên.
	Thí sinh thi khối A thi các môn: Toán, Lý, Hoá.
	Thí sinh thi khối B thi các môn: Toán, Hoá, Sinh.
	Thí sinh thi khối C thi các môn: Văn, Sử, Địa.
	a) Xây dựng các class để quản lý các thi sinh dự thi đại học.
	b) Xây dựng interface ITuyenSinh và class TuyenSinh có các chức năng:
	a. Thêm mới thí sinh.
	b. Hiện thị thông tin của thí sinh và khối thi của thí sinh.
	c. Tìm kiếm theo số báo danh.
	d. Thoát khỏi chương trình. */
	

}
