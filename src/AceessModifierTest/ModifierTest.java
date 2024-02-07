package AceessModifierTest;

import AccessModifier.AccessSpecifier;

public class ModifierTest extends AccessSpecifier{

	public ModifierTest(int id, int salary, String name) {
		super(id, salary, name);
		
	}

	public static void main(String[] args) {
		AccessSpecifier obj =new  AccessSpecifier(5,12342321,"kiran");
		ModifierTest obj1 = new ModifierTest(3,12342321,"kiran");
		
		System.out.println("Employee id : " + obj1.id + "  Emp salary is :" + obj1.salary + " employee name is " + obj1.name);
		obj.display();
	}

}
