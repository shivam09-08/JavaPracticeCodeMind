package Collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListBasic {
	public static void main(String[] args) {
		
//		List <String> names = new ArrayList();
//		names.add("shivam");
//		names.add("Abhi");
//		names.add("sumit");
//		names.add("neetu");
//		names.add("vikas");
//		names.add("ritika");
		List <String> names = Arrays.asList("shivam","abhi","neetu","sumit","vikas","ritika");
		
		System.out.println("Iterating ArrayList values using forEach loop");
		for (String name : names) {
			System.out.println(name);
		
	}
		System.out.println("***************************************************************");
		System.out.println("Iterating ArrayList values using while loop");
		
		int n= names.size()-1;
		while(n>0)
		{
			System.out.println(names.get(n));
			n --;
		}

		System.out.println("***************************************************************");
		System.out.println("Iterating ArrayList values using Iterater ");
		
		  Iterator<String> it = names.iterator();
		  while(it.hasNext())
		  {
			  System.out.println(it.next());
		  }
		  

			System.out.println("***************************************************************");
			System.out.println("Iterating ArrayList values using ListIterater ");
			
			  ListIterator<String> lt = names.listIterator();
			  while(lt.hasNext())
			  {
				  System.out.println(lt.next());
			  }
			  
				System.out.println("***************************************************************");
				System.out.println("Iterating ArrayList values using ListIterater in backword");
				
				  
				  while(lt.hasPrevious())
				  {
					  System.out.println(lt.previous());
				  }
}
}
