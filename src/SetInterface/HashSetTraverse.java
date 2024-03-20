package SetInterface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTraverse {
	
	public static void main(String[] args) {
		Set<Integer> hs = new HashSet<Integer>();
		hs.addAll(Arrays.asList( new Integer[] { 1, 3, 2, 4, 8, 9 }));
		
		Iterator <Integer> hsitr =hs.iterator();
		
		System.out.println("Iterating over set using Iterator");
		while(hsitr.hasNext())
		{
			System.out.println(hsitr.next());
		}
		
		System.out.println("Iterating over set using forEach loop");
		for (Integer items : hs) {
			System.out.println(items);
		}
	}

}
