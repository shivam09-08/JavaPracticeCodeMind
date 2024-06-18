package CollectionSortingComparatercompare;

public class Employee implements Comparable<Employee>{
	
	String name;
	int id;
	int age;
	
	
	public Employee(String name, int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}




	@Override
	public int compareTo(Employee o) {
		
		//Sorting Based on age
		
//		if(age==o.age)
//		{
//			return 0;
//		}
//		else if(age>o.age)
//		{
//			return 1;
//		}
//		return -1;
		
		// Sorting Based on Name logic
		
		return name.compareTo(o.name);
	}
	
	

}
