//package ArrayObject;
package ObjectCreation;

public class ObjectArray {
	public static void main(String[] args) {
		
		
		Employee emp1 = new Employee();
		emp1.id=1;
		emp1.name ="shivam";
		emp1.designation="Associate Consultant";
		emp1.experience= 2.5;
		
		
		Employee emp2 = new Employee();
		emp2.id=2;
		emp2.name ="Abhishek";
		emp2.designation="Associate Consultant";
		emp2.experience= 2.10;
		
		Employee emp3 = new Employee();
		emp3.id=3;
		emp3.name ="Neetu";
		emp3.designation="Senior System Engineer";
		emp3.experience= 3;
		
		
		Employee emp4 = new Employee();
		emp4.id=4;
		emp4.name ="Vikas";
		emp4.designation="Senior System Engineer";
		emp4.experience= 3.5;
		
		Employee emp5 = new Employee();
		emp5.id=5;
		emp5.name ="Sumit";
		emp5.designation=" System Engineer";
		emp5.experience= 3.1;
		
		Employee emp6 = new Employee();
		emp6.id=6;
		emp6.name ="Ritika";
		emp6.designation=" System Engineer";
		emp6.experience= 3;
		
		Employee [] empArry = new Employee [6];
		empArry[0]= emp1;
		empArry[1]= emp2;
		empArry[2]= emp3;
		empArry[3]= emp4;
		empArry[4]= emp5;
		empArry[5]= emp6;
		
		ObjectArray obj = new  ObjectArray();
		obj.getValues(empArry);
		
		EmployeeInfo obj1 = new EmployeeInfo();
		obj1.getArrayValues(empArry);
	}

	public void getValues(Employee [] emp)
	{
		System.out.println("Print employee info using forEach loop");
		for (Employee empObj : emp)
		{
			System.out.println(" Employee id is : " + empObj.id);
			System.out.println(" Employee name is : "  + empObj.name);
			System.out.println(" Employee designation is : "  + empObj.designation);
			System.out.println(" Employee experience is : "  + empObj.experience);
			System.out.println(" ");
			
		}
		
	}
}
