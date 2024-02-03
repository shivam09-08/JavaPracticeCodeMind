import java.util.Scanner;

public class QuotientRemainder {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter first value");
	int val1 = sc.nextInt();
	
	System.out.println("Please enter second value");
	int val2 = sc.nextInt();
	
	int resultQuo = val1/val2;
	int resultRem = val1%val2;
	
	
	System.out.println("Quotient of given values is :" + resultQuo);
	System.out.println("Remainder of given values is :" + resultRem);
	
}
}
