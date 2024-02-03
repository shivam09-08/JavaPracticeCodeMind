//package ArrayReturnTypeGetterSetter;

public class EmployeeInfoList {
	public static void main(String[] args) {
		
		EmployeeInfoList obj1 = new EmployeeInfoList();
		EmployeeInfoGetterSetter [] info  =	obj1.addEmployeeRecord();
		
		obj1.printInfo(info);
	}
	

	
	public void printInfo( 	EmployeeInfoGetterSetter [] arr)
	{
		for(EmployeeInfoGetterSetter empinfo : arr)
		{
			System.out.println(empinfo);
		}
		
	}
	
	public EmployeeInfoGetterSetter[] addEmployeeRecord()
	
	{
		EmployeeInfoGetterSetter empObj1 = new EmployeeInfoGetterSetter();
		
		empObj1.setId(1);
		empObj1.setName("shivam");
		empObj1.setDesignation("Associate Consultant");
		empObj1.setExperience(2.5);
		empObj1.setSalary(4.5);
		empObj1.setContactNumber(1234567891);
		empObj1.setAddress("marunji");
	
//		empObj1.id=1;
//		empObj1.name ="shivam";
//		empObj1.designation="Associate Consultant";
//		empObj1.experience= 2.5;
//		empObj1.contactNumber =1087654537;
//		empObj1.address ="marunji";
		
		
		EmployeeInfoGetterSetter empObj2 = new EmployeeInfoGetterSetter();
		empObj2.setId(2);
		empObj2.setName("Rihan");
		empObj2.setDesignation("Associate Consultant1");
		empObj2.setExperience(2.9);
		empObj2.setSalary(4.5);
		empObj2.setContactNumber(1213456789);
		empObj2.setAddress("marunji");
		
		EmployeeInfoGetterSetter empObj3 = new EmployeeInfoGetterSetter();
		empObj3.setId(3);
		empObj3.setName("Zoya");
		empObj3.setDesignation(" Consultant");
		empObj3.setExperience(4.9);
		empObj3.setSalary(6.5);
		empObj3.setContactNumber(1342567889);
		empObj3.setAddress("Phase1");
		
		EmployeeInfoGetterSetter empObj4 = new EmployeeInfoGetterSetter();
		empObj4.setId(4);
		empObj4.setName("Zinat");
		empObj4.setDesignation(" Consultant");
		empObj4.setExperience(4.8);
		empObj4.setSalary(6.5);
		empObj4.setContactNumber(1234556334);
		empObj4.setAddress("Phase2");
		
		
		EmployeeInfoGetterSetter empObj5 = new EmployeeInfoGetterSetter();
		empObj4.setId(5);
		empObj4.setName("Rizwan");
		empObj4.setDesignation(" Consultant2");
		empObj4.setExperience(5.8);
		empObj4.setSalary(12.5);
		empObj4.setContactNumber(231344545);
		empObj4.setAddress("Phase3");
		
		EmployeeInfoGetterSetter [] empArray = new EmployeeInfoGetterSetter [5];
		empArray[0]= empObj1;
		empArray[1]= empObj2;
		empArray[2]= empObj3;
		empArray[3]= empObj4;
		empArray[4]= empObj5;
		
		return empArray;
		
	}
	
}
