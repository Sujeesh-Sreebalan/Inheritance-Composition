package inheritanceAndComposition;

import java.util.ArrayList;
import java.util.List;

class Organisation {
	private List<Department> department;
	private String name;
	
	/**
	 * Constructor of the class
	 * 
	 * @param name Organisation name 
	 */
	public Organisation(String name) {
		this.name = name;
		this.department = new ArrayList<>();
	}
	
	// return the name of the organisation
	public String getName() {
		return name;
	}
	
	/**
	 * Function to add department in the list
	 * 
	 * @param dep Department object which contains the details of the department
	 * @return true is department is not presenet in the list else false
	 */
	public boolean addDepartment(Department dep) {
		if(department.contains(dep)) {
			return false;
		}
		return department.add(dep);
	}
	
	/**
	 * Function to get all employees in the organisation
	 * 
	 * @return List of all the employees within the organisation
	 */
	public List<Employee> getAllEmployees(){
		List<Employee> allEmployees = new ArrayList<>();
		for(Department dep: department) {
			allEmployees.addAll(dep.getEmployees());
		}
		return allEmployees;
	}
	
}
