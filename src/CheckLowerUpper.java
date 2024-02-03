package LogicBulidingControlStatement;

import java.util.Scanner;

public class CheckLowerUpper {
public static void main(String[] args) {
	CheckLowerUpper uplw= new CheckLowerUpper();
	uplw.CheckUpperLowerCase();
	
}
public void CheckUpperLowerCase()
{
	System.out.println("please enter a character ");
	Scanner sc =new Scanner(System.in);
	char ch = sc.next().charAt(0);
	
	if(ch==Character.toUpperCase(ch))
	
	{
		System.out.println("The entered character is in upper case");
	}
	
	else if(ch==Character.toLowerCase(ch))
	{
		System.out.println("The entered character is in lowercase case");
	}
	else {
		System.out.println("You entered a wrong character");
	}
}
}
