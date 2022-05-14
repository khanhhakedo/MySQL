
public class Department implements  Comparable<Department>{
	int departmentId;
	String departmentName;


	@Override
	public int compareTo(Department other) {
		if (other == null) {
			return  -1;
		}
		if(departmentId < other.departmentId) {
			return  -1;
		}
		if(departmentId >  other.departmentId) {
			return 1;
		}
		else {
			return  0;
		}
		public String toString (){
			String result = "";
			result += "ID" + departmentId;
			result += "Name" + departmentName;

			return  result;
		}
	}
}
