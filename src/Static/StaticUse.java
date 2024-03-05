package Static;

public class StaticUse {
	static int id;
	static String name;
	
	
	static {
		System.out.println("inside static block");
		id=12;
		name ="Shivam";
	}
	
	static void show()
	{
		System.out.println("id : " +id +  " name is: "+ name);
	}
	
	{
		System.out.println("Using Static methods and variables");
	}

	void show(int id){
		System.out.println("inside show 2");
	}
}
