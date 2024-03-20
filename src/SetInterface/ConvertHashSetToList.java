package SetInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ConvertHashSetToList {
public static void main(String[] args) {
	Set<String> str = new HashSet<String>();
	str.addAll(Arrays.asList("shiv","rihan","pawan","bali","bhoola","shiv"));
	
	System.out.println("Set values are : " + str);
	
	List<String> lt = new ArrayList<String>(str);
	lt.add("shiv");
	Iterator <String> itr =lt.iterator();
	System.out.println("Set converted to list");
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
}
}
