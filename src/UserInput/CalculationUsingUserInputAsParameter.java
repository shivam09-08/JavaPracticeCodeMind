package UserInput;
public class CalculationUsingUserInputAsParameter
{
public void sum(int value1, int value2)
{
	int sumResult = value1 + value2;
	System.out.println("-------------------------------------------Sum of Integer Values is--------------------------------------------------- " );
	System.out.println(sumResult);
	System.out.println("");
}

public void sub(double dvalue1, double dvalue2)
{
	double subResult = dvalue1 - dvalue2;
	System.out.println("----------------------------------------Substraction  of Decimal values input is----------------------------------------" );
	System.out.println(subResult);
	System.out.println("");
}

public void mul(int value1, int value2)
{
	int mulResult = value1 * value2;
	System.out.println("-------------------------------------------Multiplication of Integer Values is--------------------------------------------------- " );
	System.out.println(mulResult);
	System.out.println("");
}

public void div(double dvalue1, double dvalue2)
{
	double divResult = dvalue1 / dvalue2;
	System.out.println("----------------------------------------Division  of Decimal values input is----------------------------------------" );
	System.out.println(divResult);
	System.out.println("");
}

}
