package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.presentationlayer.UserController;
import com.vti.entity.Employee;
import com.vti.entity.Manager;
import com.vti.entity.User;
import com.vti.ultis.ScannerUltis;

public class UserFunction {

	private UserController userController;
	public UserFunction() throws FileNotFoundException, IOException {
		userController = new UserController();
	}
	
	public boolean isLoginManager() throws ClassNotFoundException, SQLException {
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
			showMenuManager();
			return true;
		}
		else {
			System.err.println("Manager bạn nhập không tồn tại! Hãy kiểm tra lại");			
			return false;
		}
	}

	private void showMenuManager() throws ClassNotFoundException, SQLException {
		while (true) {
			String formatString = "|%-46s|%n";
			System.out.println();
			System.out.println("+----------------------------------------------+");
			System.out.println("|             MENU của manager                 |");
			System.out.println("|----------------------------------------------|");
			System.out.printf(formatString, "1. Hiển thị tất cả employee trong project");
			System.out.printf(formatString, "2. Hiển thị tất cả manager của các project");
			System.out.printf(formatString, "3. Đăng xuất");
			System.out.println("+----------------------------------------------+");
			System.out.println();
			System.out.print("Lựa chọn của bạn: ");

			int choose = ScannerUltis.inputInt();
			switch (choose) {
				case 1:
					showAllEmployeeInProject();
					break;
				case 2:			
					showAllManagerInAllProject();
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

	public void showAllManagerInAllProject() throws ClassNotFoundException, SQLException {
		System.out.println("\n***Hiển thị danh sách manager trong các project***\n");
		
		List<Manager> managers = userController.getListManagerInAllProject();
		if(!managers.isEmpty()) {
			System.out.println("+------------------------------------------------------------------------------------------------------------- +");
			System.out.println("|                             Thông tin manager trong các dự án                                                |");		
			System.out.println("|----------+------+------------------------------+------------------------------+------------------------------|");
			System.out.println("|Project Id|  ID  |            Họ Tên            |             Email            |       Năm kinh nghiệm        |");
			System.out.println("|----------|------|------------------------------|------------------------------|------------------------------|");
			String formatString = "|%-10s|%-6d|%-30s|%-30s|%-30s|%n";
			for (Manager manager : managers) {
				System.out.printf(formatString,  manager.getProjectId(), manager.getId(), manager.getFullName(), manager.getEmail(), manager.getExpInYear());
			}
			System.out.println("+----------+------+------------------------------+------------------------------+-------------------------------+");
		}
		else {
			System.err.println("Không tồn tại manager nào trong các project");
		}
		
	}

	public void showAllEmployeeInProject() throws ClassNotFoundException, SQLException {
		System.out.println("\n***Hiển thị danh sách employee trong project***\n");
		System.out.print("Mời bạn nhập project id:  ");

		int id = ScannerUltis.inputInt();
		List<Employee> employees =userController.getListEmployeeByProjectId(id);
		if(!employees.isEmpty()) {
			System.out.println("+--------------------------------------------------------------------------------------------------------------+");
			System.out.println("|                                                 Thông tin employee                                           |");		
			System.out.println("|------+------------------------------+------------------------------+------------------------------+----------|");
			System.out.println("|  ID  |            Họ Tên            |             Email            |             ProSkill         |Project Id|");
			System.out.println("|------|------------------------------|------------------------------|------------------------------|----------|");
			String formatString = "|%-6d|%-30s|%-30s|%-30s|%-10s|%n";
			for (Employee employee : employees) {
				System.out.printf(formatString, employee.getId(), employee.getFullName(), employee.getEmail(),employee.getProSkill() ,employee.getProjectId());
			}
			System.out.println("+------+------------------------------+------------------------------+------------------------------+----------+");
		}
		else {
			System.err.println("Không tồn tại project có Id="+id);
		}
		
	}

}
