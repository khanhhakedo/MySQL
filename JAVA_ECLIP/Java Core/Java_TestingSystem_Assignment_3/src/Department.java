import java.security.PublicKey;
import java.util.Comparator;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class Department implements Comparator<Department> { 
	int departmentId;
	String departmentName;
	
	
	@Override
	public int compare(Department d1, Department d2) {
		if (d1 == null) {
			return  -1;
		}if (d2 == null) {
			return  1;
		}
		return d1.departmentName.compareTo(d2.departmentName);
	}
		
	
	
	@Override
	public String toString() {
		String result = "";
		result += "id: " + departmentId;
		result += " || ";
		result += "name: " + departmentName;
		return result ;
	}
	
	@Override
	public boolean equals(Object a) {
		if (a == null) {
		return false;	
		}
		Department department = (Department) a;
		if (departmentId == department.departmentId && departmentName.equals(department.departmentName)){
			return true;
		}
		return false;
	}
	
	
}





