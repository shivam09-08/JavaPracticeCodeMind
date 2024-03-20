package ListInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class IteratingListInReverse {
	public static void main(String[] args) {
		List <Integer> numb = Arrays.asList(2,3,4,5,6,7,8,9,10);
		System.out.println("List In forward direction " + numb);
		System.out.println("");
		
		ListIterator <Integer> itr = numb.listIterator();
		
		while(itr.hasNext())
		{
			 itr.next();
		}
		while(itr.hasPrevious())
		{
			System.out.println("List traversed in backward direction : " + itr.previous());
		}
		System.out.println();
Collections.reverse(numb);
System.out.println("list trevesed in back ward direction :"+numb);
	}

}
