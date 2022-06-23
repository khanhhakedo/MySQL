import java.io.BufferedOutputStream;
import java.util.Random;

public class DatatypeCasting {


	char a;
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
			
			Random random = new Random();

			int a = random.nextInt(100000)+0;
			String b = "0" + a ;
			String c = "00" +a ;
			String d = "000" + a;
			String e = "0000" +a;
			if (a > 9999) {
				System.out.println(a);
			}else if (a>999) {
				System.out.println(b);
			}else if (a >99) {
				System.out.println(c);
			}else if (a > 9) {
				System.out.println(d);
			}else {
				System.out.println(e);
			}



	
	//		Question 3:
	//		Lấy 2 số cuối của số ở Question 2 và in ra.
	//		Gợi ý:
	//		Cách 1: convert số có 5 chữ số ra String, sau đó lấy 2 số cuối
	//		Cách 2: chia lấy dư số đó cho 100
			
//			System.out.println("Question3 " + a);
//			String f = String.valueOf(a);
//			System.out.println(f);
//			System.out.println(f.substring(3));
	//		Question 4:
	//		Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của chúng
	
//		Question4();

}

//		public static void Question4() {
//			int a = 3;
//			int b = 7;
//			float c = (float) a/b;
//			System.out.println(c);
//
//
//
//		}
}
