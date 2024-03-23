package Java8Feature;

public interface FunctionalInterfaceEx {
	
	void add(int a,int b);
	
	
	public static void display()
	{
		System.out.println("Addition of two number ");
	}
	default void sub(int a , int b)
	{
		System.out.println("subtraction of two are :" + (a-b));
	}

}
