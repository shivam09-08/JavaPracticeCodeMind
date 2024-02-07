//package LogicBulidingControlStatement;
package ControlStatements;

import java.util.Scanner;

public class CalculatePower {
	public static void main(String[] args) {
		CalculatePower obj = new CalculatePower();
		obj.power();
	}
public void power()
{
	System.out.println("please enter base number");
	Scanner sc = new Scanner(System.in);
	int num1 = sc.nextInt();
	System.out.println("please enter the power number ");
	int num2 = sc.nextInt();
//double  result =Math.pow(num1, num2);
	int result =1;
	for(int i=0;i<num2; i++) {
	result *=num1;
	
}
	System.out.println("Power of given base  " +num1+" and exponent " +num2+ " is :" + result );
}
}
