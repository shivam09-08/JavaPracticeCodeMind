package JavaBasic;
public class DataTypeCheck
{
public static void main(String a[])
{
System.out.println("Programm to check data type and its  size ");

DataTypeCheck obj = new DataTypeCheck();
obj.wholeNumber();
obj.floatingNumber();
obj.booleanValue();
obj.character();
}

public void wholeNumber()
{
byte val1=127;
short val2= 32767;
int val3=  2147483647;
long val4 = 9223372036854775807L;


System.out.println("Byte value is =" + val1);
System.out.println("short value is =" + val2);
System.out.println("int value is =" + val3);
System.out.println("long value is =" + val4);

}

public void floatingNumber ()
{
	float val5=  19.9808989f;
	double val6 = 42937737.956758493765432d; 
	
	double result = val6/val5;
	
	System.out.println("float value is =" + val5);
	System.out.println("double value is =" + val6);
	System.out.println("result value is =" + result);
}

public void booleanValue()
{
	boolean val7= true;
	System.out.println("boolean value is =" + val7);
	
	
}

public void character()
{
char val8 = 'E';
System.out.println("character value is =" + val8);

}

}