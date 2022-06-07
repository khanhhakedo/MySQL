package com.vti.frontend;

import java.sql.SQLException;
import java.util.List;

import com.vti.backend.presentationlayer.AccountController;
import com.vti.entity.Account;


public class Program {
	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {

	/*	Grroup */
//		GroupController controller = new GroupController();
//		List<Group> groups = controller.getListGroups();
//
//		for (Group group : groups) {
//			System.out.println(group);
//		}

/* Account */
		AccountController controller = new AccountController();
		List<Account> accounts = controller.getListAccounts();

		for (Account account : accounts) {
			System.out.println(account);
		}
	}
}
