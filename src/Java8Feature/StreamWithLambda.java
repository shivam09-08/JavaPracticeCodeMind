package Java8Feature;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class StreamWithLambda {
	public static void main(String[] args) {
		
	
	
	List<Integer> number = Arrays.asList(10,3,6,10,3,5,6,7,8,9);
	System.out.println("Original list is : " +number);
	
	List<String> val = Arrays.asList("Shiv","Abhi","Sumit","Neetu","Vikas");
	Set<String> names = new HashSet<String>();
			names.addAll(val);
	System.out.println(names);
	
	names.stream().filter(e->e.startsWith("S")).forEach(e-> System.out.println(e));
//	
//	Stream<Integer> dis =number.stream().distinct();
//	System.out.println("Dis elements are  : "+dis);
	
	
	number.stream().distinct().forEach(  e-> System.out.println("Distinct element are : " +e));
	
	Long counts =number.stream().count();
	
	System.out.println("Total numbers of elements in a list is : " +counts);
	number.stream().distinct().sorted().forEach(e-> System.out.println("Sorted values are as follow : "+e));
	
	
	
	
	}

}
