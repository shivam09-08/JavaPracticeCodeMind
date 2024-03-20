package SetInterface;

import java.util.HashSet;
import java.util.Set;

public class ConvertHashSetToArray {
public static void main(String[] args) {
	
	Set<Integer> ar = new HashSet<Integer>();
	
	ar.add(40);
	ar.add(30);
	ar.add(20);
	ar.add(10);
	ar.add(null);
	System.out.println("Set elements are : " + ar );
	Object[] arr=ar.toArray();
	
	System.out.println("Converted set element to Array  : ");
	for (Object object : arr) {
		System.out.println( object);
	}
	
	
}
}
