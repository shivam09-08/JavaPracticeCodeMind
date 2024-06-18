package CollectionSortingComparatercompare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSort {

	public static void main(String[] args) {
	
		ArrayListSort obj = new ArrayListSort();
		obj.sortEmployee();
		

	}
	void sortEmployee()
	{
		List<Employee> emp = new ArrayList<>();
		
		emp.add(new Employee("Shivam",1,26));
		emp.add(new Employee("Neetu",2,24));
		emp.add(new Employee("Abhi",3,25));
		emp.add(new Employee("Sumit",4,26));
		emp.add(new Employee("Vikas",5,27));
		
		System.out.println("Emplyee before sorting");
		
		for (Employee employee : emp) {
			System.out.println(employee.id+" "+employee.name+ " "+ employee.age);
		}
		
		System.out.println("Employee After sorting");
		
	Collections.sort(emp);
	for (Employee employee : emp) {
		System.out.println(employee.id+" "+employee.name+ " "+ employee.age);
	}
		
	}

}
