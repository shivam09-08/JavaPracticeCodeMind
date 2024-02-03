import java.util.Scanner;


public class UserInputAsParameter
{
public static void main(String a[])
{
Scanner sc = new Scanner(System.in);
System.out.println("**********************************Please enter first integer value**************************************************");
int value1 = sc.nextInt();
System.out.println("");
System.out.println("**********************************Please enter Second integer value**************************************************");
int value2 = sc.nextInt();
System.out.println("");

System.out.println("**********************************Please enter first decimal value**************************************************");
double dvalue1= sc.nextDouble();
System.out.println("");

System.out.println("**********************************Please enter Second decimal value**************************************************");
double dvalue2 =sc.nextDouble();
System.out.println("");


CalculationUsingUserInputAsParameter obj = new CalculationUsingUserInputAsParameter();

System.out.println("");
System.out.println("");
obj.sum(value1,value2);
System.out.println("");
obj.sub(dvalue1,dvalue2);
System.out.println("");
obj.mul(value1,value2);
System.out.println("");
obj.div(dvalue1,dvalue2);
System.out.println("");


}
//public void sum(int value1, int value2)
//{
//	int sumResult = value1 + value2;
//	System.out.println("-------------------------------------------Sum of Integer Values is--------------------------------------------------- " );
//	System.out.println(sumResult);
//	System.out.println("");
//}

//public void sub(double dvalue1, double dvalue2)
//{
//	double subResult = dvalue1 - dvalue2;
//	System.out.println("----------------------------------------Substraction  of Decimal value input is----------------------------------------" );
//	System.out.println(subResult);
//	System.out.println("");
//}
}