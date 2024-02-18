package Overriding;

public class Developer extends Employee{
	void incrementSalary()
	{
	System.out.println("Developer salary is increase Based on experiance and level ");
	System.out.println();
	if(yearOfExperience >= 3 )
	{
	salary =salary+9000;	
	}
	}

	public static void main(String[] args) {
		Employee obj = new Developer();
		obj.setDesignation("Mid-Senior");
		obj.setEmpId(20);
		obj.setExperienceLevel("l2");
		obj.setName("Vikas");
		obj.setSalary(45000);
		obj.setYearOfExperience(4);
		obj.incrementSalary();
		obj.info();
	}
	
}
