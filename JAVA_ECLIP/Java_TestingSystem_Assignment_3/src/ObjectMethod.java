
import java.util.Arrays;
import java.util.Collections;

public class ObjectMethod {

	public static void main(String[] args) {
		
		Department department1 = new Department();
		department1.departmentId = 1;
		department1.departmentName = "Accounting";

		Department department2 = new Department();
		department2.departmentId = 4;
		department2.departmentName = "Boss of director";

		Department department3 = new Department();
		department3.departmentId = 3;
		department3.departmentName = "Marketing";

		Department department4 = new Department();
		department4.departmentId = 2;
		department4.departmentName = "Sale";

		Department department5 = new Department();
		department5.departmentId = 5;
		department5.departmentName = "Waiting room";
	//		Question 1:
	//			In ra thông tin của phòng ban thứ 1 (sử dụng toString())
//		System.out.println(department1.toString());
			
	//		Question 2:
//			In ra thông tin của tất cả phòng ban (sử dụng toString())
//		Department[] departments = {department1,department2,department3,department4,department5};
//		for (int i = 0; i < departments.length; i++) {
//			System.out.println(departments[i].toString());
//		}
			
	//		Question 3:
	//		In ra địa chỉ của phòng ban thứ 1
//		System.out.println(department1.hashCode());
	
	//		Question 4: Kiểm tra xem phòng ban thứ 1 có tên là "Phòng A" không?
//		Department department6 = new Department();
//		department6.departmentName = "Phòng A";
//		if (department1.equals(department6)) {
//			System.out.println("ten phong ban 1 la A");
//		} else {
//			System.out.println("ten phong ban 1 khong phai la A");
//		}
			
	//		Question 5: So sánh 2 phòng ban thứ 1 và phòng ban thứ 2 xem có bằng nhau 
	//		không (bằng nhau khi tên của 2 phòng ban đó bằng nhau)
//		if (department1.equals(department2)) {
//			System.out.println("2 phong ban giong nhau");
//		} else {
//			System.out.println("2 phong ban khac nhau");
//		}
			
	//		Question 6: Khởi tạo 1 array phòng ban gồm 5 phòng ban, sau đó in ra danh 
	//		sách phòng ban theo thứ tự tăng dần theo tên (sắp xếp theo vần ABCD)
	//		VD:
	//		Accounting
	//		Boss of director
	//		Marketing
	//		Sale
	//		Waiting room

		

//		Department[] departments = {department1,department2,department3,department4,department5};
//
//		Collections.sort(Arrays.asList(departments), new Department());
//		
//		for (Department department : departments) {
//			System.out.println(department);
//		}
			
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
