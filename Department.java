package inheritanceAndComposition;

import java.util.ArrayList;
import java.util.List;

class Department {
	private String name;
	private List<Developer> employees;
	
	/**
	 * Constructor of the class
	 * 
	 * @param Name of the department
	 */
	public Department(String name) {
		this.name = name;
		this.employees = new ArrayList<>();
	}
	
	// return Name of the department
	public String getName() {
		return name;
	}
	
	/**
	 * 
	 * @param emp Developer object which contains details of employee
	 * @return true if add in list else false if already present
	 */
	boolean join(Developer emp) {
		if(employees.contains(emp)) {
			return false;
		}
		return employees.add(emp);
	}
	
	/**
	 * 
	 * @param emp Developer object which needs to be relieve 
	 * @return true if employee present in list else return false
	 */
	boolean relieve(Developer emp) {
		if(employees.contains(emp)) {
			return employees.remove(emp);
		}
		return false;
	}
	
	// return the employee list of the department
	public List<Developer> getEmployees(){
		return employees;
	}
		
}