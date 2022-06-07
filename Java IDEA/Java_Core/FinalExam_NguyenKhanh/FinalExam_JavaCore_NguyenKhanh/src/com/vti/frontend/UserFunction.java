package com.vti.frontend;

import com.vti.backend.presentationlayer.UserController;
import com.vti.entity.Employee;
import com.vti.entity.Manager;
import com.vti.entity.User;
import com.vti.ultis.ScannerUltis;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class UserFunction {

	private UserController userController;
	public UserFunction() throws FileNotFoundException, IOException {
		userController = new UserController();
	}
	
//	
	public boolean isLoginAdmin() throws ClassNotFoundException, SQLException {
		System.out.println("+----------------------------------------------+");
		System.out.println("|                    LOGIN                     |");
		System.out.println("+----------------------------------------------+");
		System.out.print("Email: ");

		String email = ScannerUltis.inputEmail();
		System.out.print("Password: ");

		String password = ScannerUltis.inputPassword();
		
		User user = userController.getUser(email, password);
		
		if(user != null) {
			System.out.println("Đăng nhập thành công");
			showMenuAdmin();
			return true;
		}
		else {
			System.err.println("Admin bạn nhập không tồn tại! Hãy kiểm tra lại");			
			return false;
		}
	}

	
//	
	private void showMenuAdmin() throws ClassNotFoundException, SQLException {
		while (true) {
			String formatString = "|%-46s|%n";
			System.out.println();
			System.out.println("+----------------------------------------------+");
			System.out.println("|             MENU của Admin                   |");
			System.out.println("|----------------------------------------------|");
			System.out.printf(formatString, "1. Hiển thị tất cả Account trong các project");
			System.out.printf(formatString, "2. Xóa Account ");
			System.out.printf(formatString, "3. Đăng xuất");
			System.out.println("+----------------------------------------------+");
			System.out.println();
			System.out.println("Lựa chọn của bạn:");
			System.out.print(">>");
			int choose = ScannerUltis.inputInt();
			switch (choose) {
				case 1:
					showAllPeople();
					break;
				case 2:
					deleteAccount();
					break;
				case 3:
					System.out.println("Đăng xuất");
					return;
				default:
					System.err.println("Lựa chọn bạn không phù hợp! Hãy nhập lại");
					break;
			}
		}
	}

//
	public void deleteAccount() throws ClassNotFoundException, SQLException {

	System.out.print("Mời bạn nhập IdAccount cần xóa:   ");

	int ID = ScannerUltis.inputInt();
	userController.deleteAccount(ID);
	}	

//	
	public void createAccount() throws ClassNotFoundException, SQLException {

	System.out.print("Mời bạn nhập fullName của Account :   ");

	String a = ScannerUltis.inputString();
	
	System.out.print("Mời bạn nhập email của Account :   ");
	
	String b = ScannerUltis.inputString();
	
	userController.createAccount(a, b);
	
	}	
	
//	
	public void showAllPeopleProject() throws ClassNotFoundException, SQLException {
		System.out.println("\n***  Hiển thị danh sách Employee và Manager  trong project  ***\n");
		System.out.print("Mời bạn nhập projectId:   ");

		int id = ScannerUltis.inputInt();
		
			System.out.println("|                                    Thông tin Manager & Employee trong project" + id +"                         |");

		List<Manager> managers = userController.getListManagerByProjectId(id);
		if(!managers.isEmpty()) {

			System.out.println("+----------------------------------------------------------------------------------------------------------------+");
			System.out.println("|                                                  Thông tin Manager                                             |");
			System.out.println("|------------+------+------------------------------+------------------------------+---- -------------------------|");
			System.out.println("|Project Id  |  ID  |            Họ Tên            |             Email            |      Năm kinh nghiệm         |");
			System.out.println("|------------|------|------------------------------|------------------------------|------------------------------|");
			String formatString = "|%-12s|%-6d|%-30s|%-30s|%-30s|%n";
			for (Manager manager : managers) {
				System.out.printf(formatString,manager.getProjectId(), manager.getId(), manager.getFullName(), manager.getEmail(), manager.getExpInYear());
			}
			System.out.println("+------------+------+------------------------------+------------------------------+------------------------------+");
		}
		else {
			System.err.println("Không có Manager trong project" +id);
		}

		List<Employee> employees =userController.getListEmployeeByProjectId(id);
		if(!employees.isEmpty()) {

			System.out.println("|                                                   Thông tin Employee                                           |");
			System.out.println("|------------+------+------------------------------+------------------------------+---- -------------------------|");
			System.out.println("|Project Id  |  ID  |            Họ Tên            |             Email            |            ProSkill          |");
			System.out.println("|------------|------|------------------------------|------------------------------|------------------------------|");
			String formatString = "|%-12s|%-6d|%-30s|%-30s|%-30s|%n";
			for (Employee employee : employees) {
				System.out.printf(formatString, employee.getProjectId(), employee.getId(), employee.getFullName(), employee.getEmail(),employee.getProSkill() );
			}
			System.out.println("+------------+------+------------------------------+------------------------------+------------------------------+");
		}
		else {
			System.err.println("Không có Employee trong project" +id);
		}
		
	}
	
//	
	public void showAllPeople() throws ClassNotFoundException, SQLException {

			System.out.println("|                                              Thông tin Manager & Employee                                      |");

			List<Manager> managers = userController.getListManagerInAllProject();


		if(!managers.isEmpty()) {

			System.out.println("+----------------------------------------------------------------------------------------------------------------+");
			System.out.println("|                                                  Thông tin Manager                                             |");
			System.out.println("|------------+------+------------------------------+------------------------------+---- -------------------------|");
			System.out.println("|Project Id  |  ID  |            Họ Tên            |             Email            |      Năm kinh nghiệm         |");
			System.out.println("|------------|------|------------------------------|------------------------------|------------------------------|");
			String formatString = "|%-12s|%-6d|%-30s|%-30s|%-30s|%n";
			for (Manager manager : managers) {
				System.out.printf(formatString,manager.getProjectId(), manager.getId(), manager.getFullName(), manager.getEmail(), manager.getExpInYear());
			}
			System.out.println("+------------+------+------------------------------+------------------------------+------------------------------+");
		}
		else {
			System.err.println("Không có Manager trong ca project");
		}

		List<Employee> employees =userController.getListEmployeeInAllProject();
		if(!employees.isEmpty()) {

			System.out.println("|                                                   Thông tin Employee                                           |");
			System.out.println("|------------+------+------------------------------+------------------------------+---- -------------------------|");
			System.out.println("|Project Id  |  ID  |            Họ Tên            |             Email            |            ProSkill          |");
			System.out.println("|------------|------|------------------------------|------------------------------|------------------------------|");
			String formatString = "|%-12s|%-6d|%-30s|%-30s|%-30s|%n";
			for (Employee employee : employees) {
				System.out.printf(formatString, employee.getProjectId(), employee.getId(), employee.getFullName(), employee.getEmail(),employee.getProSkill() );
			}
			System.out.println("+------------+------+------------------------------+------------------------------+------------------------------+");
		}
		else {
			System.err.println("Không có Employee trong project" );
		}
		
	}


}
