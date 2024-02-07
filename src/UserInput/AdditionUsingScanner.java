package UserInput;


	import java.util.Scanner;
	public class AdditionUsingScanner {

	public static void main(String a[])
	{
	Scanner sc =new Scanner(System.in);
	System.out.println("please enter two integer numbers");

	int num1 =sc.nextInt();
	int num2 = sc.nextInt();
	int resultSum = num1+num2;
	System.out.println("Sum of two integer numbers is = " + resultSum);



	}

	}

