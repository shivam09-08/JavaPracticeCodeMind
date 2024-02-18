package Overriding;

public class Employee {

	int empId;
	double salary;
	String name;
	String designation;
	int yearOfExperience;
	String experienceLevel ;
	
	
	public int getEmpId() {
		return empId;
	}
	public double getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}
	public String getDesignation() {
		return designation;
	}
	public int getYearOfExperience() {
		return yearOfExperience;
	}
	public String getExperienceLevel() {
		return experienceLevel;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void setYearOfExperience(int yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}
	public void setExperienceLevel(String experienceLevel) {
		this.experienceLevel = experienceLevel;
	} 
	
 	void incrementSalary()
{
System.out.println("Employee salary is increase Based on experiance and level ");	

if(yearOfExperience >= 2 && experienceLevel.equalsIgnoreCase("l1") )
{
salary =salary+4000;	
}

}
 	void info()
 	{
 		System.out.println("Employee name is : " +name+ " , Employee id is : " +empId+ " , Employee salary is : " +salary);
 		System.out.println("Employee designation is : " +designation+ " , Employee year Of Experience is : " +yearOfExperience+ " , Employee experience Level is : " +experienceLevel);
 		
 	}

	
}
