import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DefaultValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//		Question 1:
	//			Không sử dụng data đã insert từ bài trước, tạo 1 array Account và khởi tạo 5 phần tử theo cú pháp (sử dụng vòng for để khởi tạo):
	//			 Email: "Email 1"
	//			 Username: "User name 1"
	//			 FullName: "Full name 1"
	//			 CreateDate: now

		Locale locale = new Locale("vi","VN");
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT,locale);
		String date = null;
		Account[] account= new Account[5];

			for ( int i = 0; i < account.length; i++){
				account[i] = new Account();
				account[i].accountId = i;
				account[i].userName = "User name " + i;
				account[i].fullName = "full name " + i;
				account[i].createDate = new Date();
				date = dateFormat.format(account[i].createDate);

			System.out.println(account[i].toString());
			System.out.println("-------------------------------");

		}


	}

}
