package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.ultis.ScannerUltis;

public class Program {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		UserFunction userFunction = new UserFunction();
		while (true) {
			String formatString = "|%-46s|%n";
			System.out.println();
			System.out.println("+----------------------------------------------+");
			System.out.println("|                       MENU                   |");
			System.out.println("|----------------------------------------------|");
			System.out.printf(formatString, "1. Hiển thị tất cả employee trong project");
			System.out.printf(formatString, "2. Hiển thị tất cả manager của các project");
			System.out.printf(formatString, "3. Đăng nhập manager");
			System.out.printf(formatString, "4. Thoát chương trình");
			System.out.println("+----------------------------------------------+");
			System.out.println();
			System.out.println("Lựa chọn của bạn:");
			System.out.print(">>");
			int choose = ScannerUltis.inputInt();
			switch (choose) {
				case 1:
					userFunction.showAllEmployeeInProject();
					break;
				case 2:			
					userFunction.showAllManagerInAllProject();
					break;
				case 3:
					userFunction.isLoginManager();
					break;
				case 4:
					System.out.println("Thoát chương trình");
					return;
				default:
					System.err.println("Lựa chọn bạn không phù hợp! Hãy nhập lại");
					break;
			}
		}
	}
}
