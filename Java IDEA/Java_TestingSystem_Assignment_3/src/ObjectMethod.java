import java.util.Arrays;
import java.util.Collections;

public class ObjectMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//		Question 1:
	//			In ra thông tin của phòng ban thứ 1 (sử dụng toString())
			
	//		Question 2:
	//		In ra thông tin của tất cả phòng ban (sử dụng toString())
			
	//		Question 3:
	//		In ra địa chỉ của phòng ban thứ 1
			
	//		Question 4: Kiểm tra xem phòng ban thứ 1 có tên là "Phòng A" không?
			
	//		Question 5: So sánh 2 phòng ban thứ 1 và phòng ban thứ 2 xem có bằng nhau 
	//		không (bằng nhau khi tên của 2 phòng ban đó bằng nhau)
			
	//		Question 6: Khởi tạo 1 array phòng ban gồm 5 phòng ban, sau đó in ra danh 
	//		sách phòng ban theo thứ tự tăng dần theo tên (sắp xếp theo vần ABCD)
	//		VD:
	//		Accounting
	//		Boss of director
	//		Marketing
	//		Sale
	//		Waiting room

		Department department1 = new Department();
		department1.departmentId = 1;
		department1.departmentName = "Accounting";

		Department department2 = new Department();
		department2.departmentId = 2;
		department2.departmentName = "Boss of director";

		Department department3 = new Department();
		department3.departmentId = 3;
		department3.departmentName = "Marketing";

		Department department4 = new Department();
		department4.departmentId = 4;
		department4.departmentName = "Sale";

		Department department5 = new Department();
		department5.departmentId = 5;
		department5.departmentName = "Waiting room";

		Department[] departments = {department1,department2,department3,department4,department5};

		Collections.sort(Arrays.asList(departments));
		for ()

			
	//		Question 7: Khởi tạo 1 array học sinh gồm 5 Phòng ban, sau đó in ra danh 
	//		sách phòng ban được sắp xếp theo tên
	//		VD:
	//		Accounting
	//		Boss of director
	//		Marketing
	//		waiting room
	//		Sale
	}

}
