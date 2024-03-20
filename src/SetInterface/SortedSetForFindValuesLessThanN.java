package SetInterface;

import java.util.Arrays;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetForFindValuesLessThanN {

	public static void main(String[] args) {
		
		TreeSet <Integer> tr = new TreeSet<Integer>();
		SortedSet<Integer> th = new TreeSet<Integer>();
		
		tr.addAll(Arrays.asList(2,4,3,5,6,0,8,12,16,20));
		
		System.out.println("Tree set elements are : "+tr);
		
		System.out.println();
		System.out.println("Values less than 7 in tree set are : ");
		th= tr.headSet(7);
		Iterator <Integer> itr =th.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
}
}
