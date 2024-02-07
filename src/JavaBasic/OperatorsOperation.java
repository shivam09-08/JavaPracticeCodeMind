package JavaBasic;
import java.util.Scanner;
public class OperatorsOperation
{
public static void main(String a[])
{

System.out.println("Basic operation on operators ");
System.out.println("");
System.out.println("");


OperatorsOperation obj = new OperatorsOperation();
 obj.arithematicOperation();
 obj.assignmentOperators();
 obj.autoIncreDecre();
 obj.logicalOperators();
obj.comparisonOperators();
obj.bitwiseOperators();
obj.turneryOperators();
}

public void arithematicOperation()
{
//int val1 = 46;
//int val2 = 4;

Scanner sc =new Scanner(System.in);
System.out.println("Enter the first number for ArithematicOperations");
int val1 = sc.nextInt();
System.out.println("Enter the second number for ArithematicOperations");
int val2 = sc.nextInt();

int result = val1+val2;
System.out.println("Addtition of 2 number is : "  + result);

int subResult =val1-val2;
System.out.println("Substraction of two number is = " + subResult);

int mulResult = val1*val2;
System.out.println("Multiplication of two numbers is  = " + mulResult);

int divResult = val1/val2;
System.out.println("Division of two numbers is  = " + divResult);

int modResult = val1%val2;
System.out.println("Modulo of two numbers is  = " + modResult);



}

public void  assignmentOperators()
{
	Scanner sc1 = new Scanner(System.in);
	System.out.println("Enter the first number for assignmentOperators");
    int val1 = sc1.nextInt();
	System.out.println("Enter the second number for assignmentOperators");
	int val2 = sc1.nextInt();
	
	val1 += val2; 
	System.out.println("Addition  of two numbers using += is  = " + val1);
	
	val1 -= val2;
	System.out.println("Substraction  of two numbers using -= is  = " + val1);
	
	val1 *= val2;
	System.out.println("Multiplication   of two numbers using *= is  = " + val1);

   int num1 = 40;
   int num2 = 5;
   num1 /= val2;
	System.out.println("Division   of two numbers using /= is  = " + num1);

}

public void autoIncreDecre()
{
	
	Scanner sc2= new Scanner(System.in);
	System.out.println("Enter the first number for autoIncreDecre");
    int val1 = sc2.nextInt();
	System.out.println("Enter the second number for autoIncreDecre");
	int val2 = sc2.nextInt();
	
	val1++;
	System.out.println("AutoIncrement using ++ on first value is = " + val1);
	
	val2--;
    System.out.println("AutoIncrement using -- on second value  is = " + val2);
	
}

public void logicalOperators()
{
	Scanner sc3= new Scanner(System.in);
	System.out.println("Enter the first number for logicalOperators");
    boolean val1 = sc3.nextBoolean();
	System.out.println("Enter the second number for logicalOperators");
	boolean val2 = sc3.nextBoolean();
	
	boolean result1 = val1&&val2;
	System.out.println("Comparing two values  using && operator = " + result1);

	boolean result2 = val1||val2;
	System.out.println("Comparing two values  using || operator = " + result2);
	
	
	boolean result3 = !val1;
	System.out.println("Nor  value1  using ! operator = " + result3);
	
}

public void comparisonOperators ()
{

	Scanner sc4= new Scanner(System.in);
	System.out.println("Enter the first number for comparisonOperators");
    int val1 = sc4.nextInt();
	System.out.println("Enter the second number for comparisonOperators");
	int val2 = sc4.nextInt();
	
	boolean resultComp = (val1 == val2);
	System.out.println("Comparing   values  using == operator  is : " + resultComp);
	
	boolean resultComp1 = (val1 >= val2);
	System.out.println("Comparing   values  using >= operator  is : " + resultComp1); 
	
	boolean resultComp3 = (val1 <= val2);
	System.out.println("Comparing   values  using <= operator  is : " + resultComp3);
	
	boolean resultComp4 = (val1 != val2);
	System.out.println("Comparing   values  using != operator  is : " + resultComp4);
	
	boolean resultComp5 = (val1 > val2);
	System.out.println("Comparing   values  using > operator  is : " + resultComp5);
	
	boolean resultComp6 = (val1 < val2);
	System.out.println("Comparing   values  using < operator  is : " + resultComp6);
}

public void bitwiseOperators()
{
	Scanner sc5= new Scanner(System.in);
	System.out.println("Enter the first number for comparisonOperators");
    int val1 = sc5.nextInt();
	System.out.println("Enter the second number for comparisonOperators");
	int val2 = sc5.nextInt();
	
	
	int bitResult = val1&val2;
	System.out.println("Comparing   values  using & bitwiseoperator  is : " + bitResult);
	
	
	int bitResult1 = val1|val2;
	System.out.println("Comparing   values  using | bitwiseoperator  is : " + bitResult1);
	
	int bitResult2 = val1<<1;
	System.out.println("Comparing   values  using << bitwiseoperator  is : " + bitResult2);
	
	int bitResult3 = val1>>2;
	System.out.println("Comparing   values  using >> bitwiseoperator  is : " + bitResult3);
}

 public void turneryOperators()
 {

	Scanner sc6= new Scanner(System.in);
	System.out.println("Enter the first number for comparisonOperators");
    int val = sc6.nextInt();
	System.out.println("Enter the second number for comparisonOperators");
	int val2 = sc6.nextInt();

	int turneyResult = 10>20 ? 250:300;
	 	System.out.println("Comparing   values  using ? > ternarywiseoperator  is : " + turneyResult);

     int turneyResult1 = 10<20 ? 250:300;
	 	System.out.println("Comparing   values  using ? < ternarywiseoperator  is : " + turneyResult1);
 }
}