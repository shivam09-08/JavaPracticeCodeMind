package ListInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConvertListIntoTreeSet {

	public static void main(String[] args) {
		List <Integer> lt = new ArrayList<Integer>();
		lt.addAll(Arrays.asList(2,3,7,5,1,10,9,3,1,5));
		
		
		System.out.println("List Elements are as followed : " +lt);
		
		//sort the list and keep the duplicates 
				Collections.sort(lt);
				 System.out.println("Sorting the list and keep the duplicates " +lt);
				
				 //remove duplicates and maintained insertion order
				 
				 LinkedHashSet <Integer> lhs =new LinkedHashSet<Integer> ();
				 lhs.addAll(lt);
				Iterator<Integer> pr = lhs.iterator();
				System.out.println("Preserved the insertion order and remove the duplicate  ");
				while(pr.hasNext())
				{
					System.out.println( pr.next());
				}
		
		System.out.println("Removing Duplicates and Sort the List");
		
		//sort the list and remove the duplicates
		SortedSet<Integer> th = new TreeSet<Integer>(lt);
		
		Iterator <Integer> itr=th.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}
