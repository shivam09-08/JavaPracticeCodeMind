import java.util.Scanner;

public class CompanyInfo
{

public void jobReleatedInfo()
{
	System.out.println("");
    System.out.println("");
	System.out.println("Company releated information");
	
	System.out.println("");

	Scanner sc1 =new Scanner(System.in);
	
	System.out.println("Enter the number of vacancies ");
	byte vacancies =sc1.nextByte();
	
	System.out.println("Total number of employee in company");
	short TotalEmp =sc1.nextShort();
	
	System.out.println("Enter the company turn over ");
	long companyTurnOver = sc1.nextLong();
	
	System.out.println("Are you an indian citizen ans in true or false");
	boolean citizenship = sc1.nextBoolean();
	
	System.out.println("Number of vacancies in a company is : " + vacancies);
	System.out.println("ToalNumber of employees in a company is : " + TotalEmp);
	System.out.println("Company Turn Over  in a year in rupeees is : " + companyTurnOver);
	System.out.println("citizenship of an employee is: " + citizenship);

	
} 
}