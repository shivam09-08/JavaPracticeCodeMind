package ExceptionHandling;

public class ExceptionBasics {
	public static void main(String[] args) {
		System.out.println("Inside Main method");
		System.out.println();
		
		try {
			int i=10;
			int j=0;
			
			System.out.println("Division of : " +i+ " by : " + j+ " is = " + i/j);
			System.out.println();
		}
		catch(ArithmeticException ar)
		{
			System.out.println("Please check the Values " +ar.getMessage());
			System.out.println();
		}
		
		try {
			int arr[] = new int[2];
			System.out.println("Values of arr at index 1 : " + arr[1]);
			System.out.println();
		}
		catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println("ArrayIndexOutOfBound as we try to access the index  which is out of array length : " +ai.fillInStackTrace());
		System.out.println();
		}
		
		try {
			String str ="Shiv";
			System.out.println("Values of given string is : "+str.charAt(0));
			System.out.println();
		}
		catch(NullPointerException nul) {
			System.out.println("String has no values to access : "+nul.getLocalizedMessage());
			System.out.println();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println();
		}
	
		ExceptionBasics obj = new ExceptionBasics();
		System.out.println("");
		obj.test();
		
	}
	
	void test()
	{
		System.out.println("Testing the other method can execute or not");
	}

}
