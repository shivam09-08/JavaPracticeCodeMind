package AccessModifier;

public class AccessSpecifier {

	
protected int age;
protected int salary;
protected String name;
protected int id =1;
public AccessSpecifier(int id ,int salary,String name)
{
	this.id=id;
	this.salary=salary;
	this.name=name;
	}


public void display()
{


}


public static void main(String[] args) {
	AccessSpecifier obj =	new AccessSpecifier(1,1234567,"Shivam");
	System.out.println("Employee id : " + obj.id + "Emp salary is :" + obj.salary + "employee name is " + obj.name);
	
	obj.display();

	
}
}