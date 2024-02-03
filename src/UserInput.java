import java.util.Scanner;
public class UserInput{

public static void main(String a[])
{
//Scanner sc =new Scanner(System.in);

sum();
sub();
div();
mul();

}
public static void sum()
{
Scanner sc =new Scanner(System.in);
System.out.println("please enter two integer numbers for Addition");

int num1 =sc.nextInt();
int num2 = sc.nextInt();
int resultSum = num1+num2;
System.out.println("Addition of two integer numbers is = " + resultSum);
System.out.println(" ");

}
public static void sub()
{
Scanner sc =new Scanner(System.in);
System.out.println("please enter two decimal numbers for Substraction");

double sub1 =sc.nextDouble();
double sub2 = sc.nextDouble();
double resultSub = sub1-sub2;
System.out.println("Substraction  of two decimal numbers is = " + resultSub);
System.out.println(" ");
}

public static void mul()
{
Scanner sc =new Scanner(System.in);
System.out.println("please enter two interger numbers for Multiplication");

int mul1 =sc.nextInt();
int mul2 = sc.nextInt();
int resultmul = mul1*mul2;
System.out.println("Multiplication  of two interger numbers is = " + resultmul);
System.out.println(" ");
}


public static void div()
{
Scanner sc =new Scanner(System.in);
System.out.println("please enter two interger numbers for Division");

int div1 =sc.nextInt();
int div2 = sc.nextInt();
int resultdiv = div1/div2;
System.out.println("division  of two interger numbers is = " + resultdiv);
}

}


