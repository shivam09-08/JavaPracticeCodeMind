package LogicBulidingControlStatement;

import java.util.Scanner;

public class CheckGreater {
	public static void main(String[] args) {
		CheckGreater gr=new CheckGreater();
		gr.Greater();
	}
public void Greater()
{
System.out.println("please enter first number");
Scanner sc = new Scanner(System.in);
int num1 = sc.nextInt();
System.out.println("please enter the second number ");
int num2 = sc.nextInt();

 if(num1>num2)
 {
	 System.out.println("Graeter number between the  " +num1 +" & " +num2 +  " is : " + num1);
 }
 else {
	 System.out.println("Graeter number between the  " + num1 +" & " + num2 + " is : " + num2); 
 }
 
 
}
}
