package Overriding;

public class Manager extends Employee{
	void incrementSalary()
	{
	System.out.println("Manager salary is increase Based on experiance and level ");
	System.out.println();
	if(yearOfExperience >= 7  )
	{
	salary =salary+20000;	
	}

	}

	public static void main(String[] args) {
		Employee obj = new Manager();
		obj.setDesignation("Mid-Level");
		obj.setEmpId(420);
		obj.setExperienceLevel("l3");
		obj.setName("Sushant");
		obj.setSalary(70000);
		obj.setYearOfExperience(8);
		obj.incrementSalary();
		obj.info();
	}
	
	
}
