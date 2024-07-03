package inheritanceAndComposition;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class PayRollTest {
	
	private Organisation org = new Organisation("Metacube");
	private Developer emp1  = new Developer(1, "Sujeesh", 10000, 100);
	private Developer emp2 = new Developer(2, "Nikhil", 12000, 200);
	private Developer emp3 = new Developer(3, "Gaurav", 13000, 200);
	private Department depart = new Department("Engineering");
	
	@Before
	public void setup() {
		depart.join(emp1);
		depart.join(emp2);
		org.addDepartment(depart);
	}
	
	@Test
	public void employeeSalaryTest() {
		double getSalary = 10000;
		double result = emp1.basicSalary;
		assertEquals(getSalary, result);
	}

	@Test
	public void employeeSalaryTest1() {
		double getSalary = 12000;
		double result = emp2.basicSalary;
		assertEquals(getSalary, result);
	}
	
	@Test
	public void relieveEmployeeTest() {
		assertFalse(depart.relieve(emp1));
	}
	
	@Test
	public void relieveEmployeeTest1() {
		assertFalse(depart.relieve(emp3));
	}
	
	@Test
	public void joinEmployeeTest() {
		assertTrue(depart.join(emp3));
	}
	
	@Test
	public void checkDepartmentTest() {
		String name = depart.getName();
		String res = "Engineering";
		assertEquals(name, res);
	}
	
	@Test
	public void checkDepartmentTest1() {
		String name = depart.getName();
		String res = "HR";
		assertFalse(name.equals(res));
	}
	
	@Test
	public void organisationTest() {
		String orgName = org.getName();
		String res = "Metacube";
		assertEquals(orgName, res);
	}
	
	@Test
	public void organisationTest1() {
		String orgName = org.getName();
		String res = "TCS";
		assertFalse(orgName.equals(res));
	}
	
	
	

}
