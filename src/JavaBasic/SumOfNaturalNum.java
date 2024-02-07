//package LogicBulidingControlStatement;
package JavaBasic;

import java.util.Scanner;

public class SumOfNaturalNum {
public static void main(String[] args) {
	SumOfNaturalNum ob= new SumOfNaturalNum();
	ob.sum();
}
public void sum()
{
	System.out.println("please enter a number");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();	
	
	int sum_ofNatural =num*(num+1)/2;
	System.out.println("sum of " +num+ "  natural number is  = " + sum_ofNatural);
	
}
}
