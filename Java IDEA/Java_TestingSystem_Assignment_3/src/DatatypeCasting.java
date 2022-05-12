
public class DatatypeCasting {
public static void main(String[] args) {
	//	Question 1:
	//		Khai báo 2 số lương có kiểu dữ liệu là float.
	//		Khởi tạo Lương của Account 1 là 5240.5 $
	//		Khởi tạo Lương của Account 2 là 10970.055$
	//		Khai báo 1 số int để làm tròn Lương của Account 1 và in số int đó ra
	//		Khai báo 1 số int để làm tròn Lương của Account 2 và in số int đó ra
	
//		float salaryAccount1 = 5240.5f;
//		float salaryAccount2 = 10970.055f;
//
//		int salary1 = (int) salaryAccount1;
//		int salary2 = (int) salaryAccount2;
//
//		System.out.println(salary1);
//		System.out.println(salary2);
	
	//		Question 2:
	//		Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ thêm có
	//		số 0 ở đầu cho đủ 5 chữ số)
	
	//		Question 3:
	//		Lấy 2 số cuối của số ở Question 2 và in ra.
	//		Gợi ý:
	//		Cách 1: convert số có 5 chữ số ra String, sau đó lấy 2 số cuối
	//		Cách 2: chia lấy dư số đó cho 100
	
	//		Question 4:
	//		Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của chúng
	
		Question4();
}

		public static void Question4() {
			int a = 3;
			int b = 7;
			float c = (float) a/b;
			System.out.println(c);
		}
}
