//package conditionStatement;
package ControlStatements;

public class WhileLoopExp {
public static void main(String[] args) {
	int n=6;
	int i=1;
	int fac=1;
	
	while(i<=n)
	{
		fac=fac*i;
		i++;
	}
	System.out.println("factorial of " + n +" is = " + fac);
}
}
