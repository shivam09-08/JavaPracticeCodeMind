package ArrayObject;

public class EmployeeInfo {
	
	public void  getArrayValues(Employee [] empInfo)
	{
		System.out.println("Getiing Employees info using for loop");
		for(int i=0; i<empInfo.length;i++)
		{
			Employee empObj = empInfo[i];
			
			System.out.println(" Employee id is : " + empObj.id);
			System.out.println(" Employee name is : "  + empObj.name);
			System.out.println(" Employee designation is : "  + empObj.designation);
			System.out.println(" Employee experience is : "  + empObj.experience);
			System.out.println(" ");
		}
		
	}

}
