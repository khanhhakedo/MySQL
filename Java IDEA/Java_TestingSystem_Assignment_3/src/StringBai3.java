import java.util.Iterator;
import java.util.Scanner;

public class StringBai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Question 1:
//			Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí 
//		tự đó (các từ có thể cách nhau bằng nhiều khoảng trắng );
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("nhap chuoi ky tu");
//		String Question1 = scanner.nextLine();
//		System.out.println("So ky tu: " + Question1.length());
//		
//		Question 2:
//		Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1;
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Nhap chuoi ky tu thu 1: ");
//		String Question2_1 = scanner.next();
//		System.out.print("Nhap chuoi ky tu 2: ");
//		String Question2_2 = scanner.next();
//		
//		System.out.println("chuoi ky tu la: " + Question2_1 +Question2_2);
		
		
//		Question 3:
//		Viết chương trình để người dùng nhập vào tên và kiểm tra, 
//		nếu tên chư viết hoa chữ cái đầu thì viết hoa lên
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("nhap vao ten");
//		String name = scanner.nextLine();
//		String nameHoa = name.substring(0,1).toUpperCase();
//		String ten = nameHoa + name.substring(1);
//		System.out.println(ten);
//		scanner.close();
		
//		Question 4:
//		Viết chương trình để người dùng nhập vào tên in từng ký tự trong tên của người dùng ra
//		VD:
//		Người dùng nhập vào "Nam", hệ thống sẽ in ra
//		"Ký tự thứ 1 là: N"
//		"Ký tự thứ 1 là: A"
//		"Ký tự thứ 1 là: M"
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("nhap vao ten");
//		String name = scanner.nextLine();
//		String viethoa = name.toUpperCase();
//		for (int i = 0; i < name.length(); i++) {
//		System.out.println( "Ky tu thu " +i +": " + viethoa.charAt(i));
//			
//		}
	
		
//		Question 5:
//		Viết chương trình để người dùng nhập vào họ, sau đó yêu cầu người dùng nhập vào 
//		tên và hệ thống sẽ in ra họ và tên đầy đủ
		
//		Question 6:
//		Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và sau đó hệ thống
//		sẽ tách ra họ, tên , tên đệm
//		VD:
//		Người dùng nhập vào "Nguyễn Văn Nam"
//		Hệ thống sẽ in ra
//		"Họ là: Nguyễn"
//		"Tên đệm là: Văn"
//		"Tên là: Nam"
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Nhap vao ten day du");
//		String fullName = scanner.nextLine();
//		// chuan hoa du lieu
//		
//		fullName = fullName.trim();
//		String[] dacattim = fullName.split(" ");
//		String ho = "";
//		String tendem1 = "" ;
//		String tendem2 = "" ;
//		String ten = "";
//		
//		ho = dacattim[0];
//		ten = dacattim[dacattim.length - 1];
//		
//		for (int i = 1; i < dacattim.length - 2 ; i++) {
//			tendem1 = dacattim[i] +"";
//			
//		}
//		for (int i = 1; i < dacattim.length - 1 ; i++) {
//			tendem2 = dacattim[i] +"";
//		}
//		System.out.println(ho);
//		System.out.println(tendem1);
//		System.out.println(tendem2);
//		System.out.println(ten);
//		Question 7:
//		Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và chuẩn hóa họ và tên
//		của họ như sau:
//		a) Xóa dấu cách ở đầu và cuối và giữa của chuỗi người dùng nhập vào
//		VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ chuẩn hóa thành "nguyễn văn nam"
//		b) Viết hoa chữ cái mỗi từ của người dùng
//		VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ chuẩn hóa thành "Nguyễn Văn Nam"
		
//		Question 8:
//		In ra tất cả các group có chứa chữ "Java"
		
//		Question 9:
//		In ra tất cả các group "Java"
		
//		Question 10 (Optional):
//		Kiểm tra 2 chuỗi có là đảo ngược của nhau hay không.
//		Nếu có xuất ra “OK” ngược lại “KO”.
//		Ví dụ “word” và “drow” là 2 chuỗi đảo ngược nhau.
		
//		Question 11 (Optional): Count special Character
//		Tìm số lần xuất hiện ký tự "a" trong chuỗi
		
//		Question 12 (Optional): Reverse String
//		Đảo ngược chuỗi sử dụng vòng lặp
		
//		Question 13 (Optional): String not contains digit
//		Kiểm tra một chuỗi có chứa chữ số hay không, nếu có in ra false ngược lại true.
//		Ví dụ:
//		"abc" => true
//		"1abc", "abc1", "123", "a1bc", null => false
		
//		Question 14 (Optional): Replace character
//		Cho một chuỗi str, chuyển các ký tự được chỉ định sang một ký tự khác cho trước.
//		Ví dụ:
//		"VTI Academy" chuyển ký tự 'e' sang '*' kết quả " VTI Acad*my"
		
//		Question 15 (Optional): Revert string by word
//		Đảo ngược các ký tự của chuỗi cách nhau bởi dấu cách mà không dùng thư viện.
//		Ví dụ: " I am developer " => "developer am I".
//		Các ký tự bên trong chỉ cách nhau đúng một dấu khoảng cách.
//		Gợi ý: Các bạn cần loại bỏ dấu cách ở đầu và cuối câu, thao tác cắt chuỗi theo dấu cách
		
//		Question 16 (Optional):
//		Cho một chuỗi str và số nguyên n >= 0. Chia chuỗi str ra làm các phần bằng nhau với n ký 
//		tự. Nếu chuỗi không chia được thì xuất ra màn hình “KO”.
	}

}
