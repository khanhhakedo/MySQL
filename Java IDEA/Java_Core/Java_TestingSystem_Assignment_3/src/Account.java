import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

public class Account {
	int accountId;
	String email;
	String userName;
	String fullName;
	Department departmentID;
	Position positionID;
	Group[] groups;
	Date createDate;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		return Account;
		String result = "";
		result += "id: " + accountId;
		result += " || ";
		result += "user: " + userName;
		result += " || ";
		result += "fullname: " + fullName;
		result += " || ";
		result += "create: " + createDate;
		return result ;
	}



}

