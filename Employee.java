package inheritanceAndComposition;


abstract class Employee{
	
	protected int empId;
	protected String name;
	protected double basicSalary;
	protected double bonus;
	
	/**
	 * Constructor of the class 
	 * 
	 * @param empId employee id of the employee
	 * @param name of the employee
	 * @param basicSalary of the employee
	 */
	Employee(int empId, String name, double basicSalary){
		this.empId = empId;
		this.name = name;
		this.basicSalary = basicSalary;
		this.bonus = 0.0;
	}
	
	/**
	 * Abstract methods
	 */
	abstract double getBasicSalary() ;
	abstract double getBonus() ;
	abstract double getCompensation();
	
	// return employee id of the employee
	public int getId() {
		return empId;
	}
	
	// return name of the employee
	public String getName() {
		return name;
	}
}