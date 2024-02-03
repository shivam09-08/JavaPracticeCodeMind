//package LogicBulidingControlStatement;

import java.util.Scanner;

public class SchoolGradeSystem {
	public static void main(String[] args) {
		SchoolGradeSystem sg= new SchoolGradeSystem();
		sg.Result();
		
		
	}
	
	public void Result()
	{
	
		System.out.println("please enter a student marks");
		Scanner sc = new Scanner(System.in);
		int marks= sc.nextInt();
		String grade =null;
		
		switch(marks/10)
		{
		case 9:
		case 8:
			grade = "A";
			break;
			
		
		case 7:
		case 6:
			grade ="B";
			break;
			
		case 5:
		grade ="C";
			break;
			
		case 4:
		
			grade ="D";
			break;
			
		case 3:
		
			grade ="E";
			break;
			
			default:
				grade ="F";
			break;
		}
		
		System.out.println("Obtained marks is  "+ marks + "  and the grade will be = "+ grade );
	}

}
