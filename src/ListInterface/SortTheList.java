package ListInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortTheList {
	public static void main(String[] args) {
		List <Integer> num = Arrays.asList(10,5,8,6,12,4);
		System.out.println("List before sorting : " + num);
		System.out.println("List values are : " + num);
		for (Integer numb : num) {
			System.out.println("Iterating using forEach :"+numb );
		}
		System.out.println("*****************************************");
		
	Iterator<Integer> itr	=num.iterator();
	
	while(itr.hasNext())
	{
		System.out.println("Iterating using Iterator "+ itr.next());
	}
		Collections.sort(num);
		System.out.println("Sorted list is : "+ num );
		
	}

}
