package com.vti.frontend;

import java.sql.SQLException;
import java.util.List;

import com.vti.backend.presentationlayer.GroupController;
import com.vti.entiy.Group;

public class Program {
	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
		GroupController controller = new GroupController();
		List<Group> groups = controller.getListGroups();

		for (Group group : groups) {
			System.out.println(group);
		}
	}
}
