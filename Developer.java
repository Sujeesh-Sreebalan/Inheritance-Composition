package inheritanceAndComposition;


class Developer extends Employee{
	
	private double bonus;
	
	/**
	 * Constructor of the class which inherts its parenet class constructor
	 * 
	 * @param empId employee id of the employee
	 * @param name of the employee
	 * @param basicSalary of the employee
	 * @param bonus of the employee
	 */
	Developer(int empId, String name, double basicSalary, double bonus) {
		super(empId, name, basicSalary);
		this.bonus = bonus;
	}
	
	// return the basic salary of the employee
	@Override
	public double getBasicSalary() {
		return basicSalary;
	}
	
	// return the bonus of the employee
	@Override
	public double getBonus() {
		return bonus;
	}
	
	// return the compensation of the employee
	@Override
	public double getCompensation() {
		return basicSalary + bonus;
	}

}