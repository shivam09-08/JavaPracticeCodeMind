package AccessModifier;

public class AccessTest {

	public static void main(String[] args) {
		
		AccessSpecifier obj=new AccessSpecifier(2,124546778,"Rahul");
		System.out.println("Employee id : " + obj.id + "Emp salary is :" + obj.salary + "employee name is " + obj.name);
		obj.display();
	}

}
