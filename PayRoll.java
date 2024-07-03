package inheritanceAndComposition;

import java.util.List;
import java.util.Scanner;

public class PayRoll {
	
	/**
	 * Function to Print the Salary Slip of the employee
	 * 
	 * @param emp Object which contains details of employee
	 */
	public static void printPaySlip(Employee emp) {
		
		System.out.println("Employee Id: "+emp.empId);
		System.out.println("Employee name: "+emp.name);
		System.out.println("Basic Salary: "+emp.getBasicSalary());
		System.out.println("Tax: "+emp.getBasicSalary()*0.01);
		System.out.println("Bonus: "+emp.getBonus());
		System.out.println("Total Compensation: "+emp.getCompensation());
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Organisation org = new Organisation("Metacube");
		
		// Making department objects
		Department depart1 = new Department("Engineering");
		Department depart2 = new Department("Marketing");
		Department depart3 = new Department("HR");
		
		// Making Developer Objects
		Developer dev1 = new Developer(12, "John", 50000, 5000);
		Developer dev2 = new Developer(13, "Will", 48000, 4000);
		Developer dev3 = new Developer(14, "Mike", 52000, 3800);
		Developer dev4 = new Developer(15, "David", 44000, 3000);
		Developer dev5 = new Developer(16, "Micheal", 47000, 4800);
		
		// Adding Developers to different department and adding department to organisaton
		depart1.join(dev1);
		depart1.join(dev2);
		org.addDepartment(depart1);
		
		depart2.join(dev3);
		depart2.join(dev4);
		org.addDepartment(depart2);
		
		depart3.join(dev5);
		org.addDepartment(depart1);
		
		// Relieving employee from the department
		if(depart1.relieve(dev2)) {
			System.out.println("Employee Removed");
		} else {
			System.out.println("Employee not present");
		}
		
		// Calling the printPaySlip function
		List<Employee> allEmployee = org.getAllEmployees();
		for(Employee emp: allEmployee) {
			printPaySlip(emp);
		}
		
		
		sc.close();
	}

}
