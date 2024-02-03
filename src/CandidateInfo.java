import java.util.Scanner;


public class CandidateInfo{

public void empolyeeInfo(){


System.out.println("Candidate releated information");
System.out.println("");

Scanner sc =new Scanner(System.in);

System.out.println("Enter the applicant name");
String empName =  sc.nextLine();


System.out.println("Enter the  slot time in between A-D ");
char timeSlot = sc.next().charAt(0);

System.out.println("Enter the current CTC ");
float ctc = sc.nextFloat();

System.out.println("Enter the salary in-hand");
	int salary = sc.nextInt();

System.out.println(" Enter the expected CTC ");
double exptCtc = sc.nextDouble();


System.out.println("selected time slot is " + timeSlot);
System.out.println("applicant name is : " + empName);
System.out.println("Current CTC of employee is : " + ctc);
System.out.println("Employee get in-hand salary is : " + salary);
System.out.println("Expected CTC of an employee is : " + exptCtc);



}

}