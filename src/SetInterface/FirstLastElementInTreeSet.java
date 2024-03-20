package SetInterface;

import java.util.SortedSet;
import java.util.TreeSet;

public class FirstLastElementInTreeSet {
public static void main(String[] args) {
	
	TreeSet <Integer> tr = new TreeSet<Integer>();
//	SortedSet<Integer> th = new TreeSet<Integer>();
	
	tr.add(1);
	tr.add(4);
	tr.add(5);
	tr.add(6);
	tr.add(10);
	tr.add(15);
	tr.add(16);
	tr.add(20);
	
	System.out.println("Tree set elements are : "+tr);
	Integer  first = tr.first();
	 Integer last =tr.last();	
	 System.out.println("Fisrt element of treeset is : "+first);
	 System.out.println("Last element of treeset is : "+ last);
	 System.out.println();
	
	 //finding the values less than 7 in a TreeSet  using Sorted Set
//	 th = tr.headSet(7);
//	Iterator <Integer> itr= th.iterator();
//	while(itr.hasNext())
//	{
//		System.out.println(" Values less than 7 in tree set are : " +itr.next());
//	}
//	 
}
}
