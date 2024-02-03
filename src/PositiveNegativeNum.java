package LogicBulidingControlStatement;

import java.util.Scanner;

public class PositiveNegativeNum {
public static void main(String[] args) {
	PositiveNegativeNum posneg =new PositiveNegativeNum();
	posneg.checkPositiveNegative();
	
}
public void checkPositiveNegative()
{
	System.out.println("please enter a number");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();	
	
	if(num>0)
	{
		System.out.println("entered number " + num + " is positive number");
	}
	else if(num<0)
	{
		System.out.println("entered number " + num + " is negative number");
	}
	else
	{
		System.out.println("you entered a invalide ");
	}
	
}
}
