package Static;

public class StaticMain  extends StaticUse {
	
	static void show()
	{System.out.println("inside Main");
		
	}
public static void main(String[] args) {
	StaticUse obj = new StaticUse();
	StaticMain obj1= new StaticMain();
	
obj.name ="patel";
StaticUse.name= "Abhi";
	StaticUse.show();
	obj1.show();
	
	
	
}
}
