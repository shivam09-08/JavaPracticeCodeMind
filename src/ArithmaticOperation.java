import java.lang.Math;
public class ArithmaticOperation
{
public static void main(String a[])
{
System.out.println("ArithmaticOperation basic ");

Add();
sub();
mul();
div();
power();

}
public static void Add()
{
int addVar1=10;
int addVar2= 25;

int addResult = addVar1+addVar2;
System.out.println("Addition of two number is = " + addResult);
}

public static void sub()
{
int subVar1=44;
int subVar2= 20;

int subResult = subVar1-subVar2;
System.out.println("Substraction  of two number is = " + subResult);
}

public static void mul()
{
int mulVar1=14;
int mulVar2= 20;

int mulResult = mulVar1*mulVar2;
System.out.println("Multiplication of two number is = " + mulResult);
}


public static void div()
{
int divVar1=50;
int divVar2= 5;

int divResult = divVar1/divVar2;
System.out.println("Division  of two number is = " + divResult);
}

public static void power()
{
 double powVar1 = 30;
 double powVar2 = 2;
 System.out.print("power of two number is =");
        System.out.println(Math.pow(powVar1, powVar2));
}

}