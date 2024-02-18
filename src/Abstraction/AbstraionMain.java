package Abstraction;

public class AbstraionMain {
	
	public static void main(String[] args) {
		
		Employee contractor = new Contractor("Contractor",10,10);
		Employee fullTimeEmployee = new FullTimeEmployee("FullTimeEmployee",10);
		
		System.out.println(" Contractor employee salary per day : " +contractor.calculateSalary());
		System.out.println(" Full time employee salary per day : " +fullTimeEmployee.calculateSalary());
		
	}

}
