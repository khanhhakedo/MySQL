package com.vti.frontend;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.vti.backend.presentationlayer.GroupController;
import com.vti.entiy.Group;
import com.vti.utils.ScannerUntils;

/**
 * This class is used for demo program.
 * 
 * @Description: .
 * @author: NNDuy
 * @create_date: May 24, 2020
 * @version: 1.0
 * @modifer: NNDuy
 * @modifer_date: May 24, 2020
 */
public class Program {

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {

		GroupController controller = new GroupController();

		// get list group
		List<Group> groups = controller.getListGroups();

		// print group
		for (Group group : groups) {
			System.out.println(group);
		}

		// create group
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input name: ");
		String name = ScannerUntils
				.inputString(scanner, "Please input string!");

		try {
			controller.createGroup(name);
			System.out.println("Create success!");

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("create fail!");
		}

	}
}
