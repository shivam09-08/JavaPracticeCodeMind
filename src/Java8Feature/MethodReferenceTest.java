package Java8Feature;


 interface Display
{
	 
	void showMsg();
	
	}
 
 
public class MethodReferenceTest {
	
	
	public MethodReferenceTest()
	{
		System.out.println("Calling MethodRef constructor");
	}
	
	public static void display()
	{
		System.out.println("Calling Static Method of MethodRef");
	}
	
	public  void nonStstic_display()
	{
		System.out.println("Calling non Static Method of MethodRef");
	}
	
	
	public static void main(String[] args) {
		
		MethodReferenceTest obj = new MethodReferenceTest();
		
	
		
	Display mr = () -> System.out.println("hello there"); // using lambda expression
		
		
		Display mr1 = MethodReferenceTest::display; // using static method reference
		Display mr2 = obj::nonStstic_display; // using nonStstic method reference
		Display mr3 = MethodReferenceTest::new;
		
		mr.showMsg();
		mr1.showMsg();
		mr2.showMsg();
		mr3.showMsg();
		
		
		
		/**
		 * MEthod reference are used to replace lambda expression and it also used only with functional Interface 
		 * Method ref are used  in form of methods and constructor only . 
		 * Method reference are of 3 type
		 * 
		 * Static Method ref
		 * 
		 * Instance Method ref
		 * 
		 * Constructor Method ref
		 * 
		 * 
		 */
		
	}

	
	

	

}
