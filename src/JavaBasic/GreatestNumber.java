package JavaBasic;
import java.util.Scanner;

public class GreatestNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter the first value");
	int val1 = sc.nextInt();
	
	System.out.println("Please enter the second value");
	int val2 = sc.nextInt();
	
	System.out.println("Please enter the third value");
	int val3 = sc.nextInt();
	
	if(val1>val2 && val1>val3)
	{
		System.out.println("Value one is greater" + "  " + val1);
	}
	
	else if(val2>val1 && val2>val3)
	{
		System.out.println("Value two is greater" + " " +val2);
	}
	
	else {
		System.out.println("Value three is greater" + "  " + val3);
	}
	
}
}
