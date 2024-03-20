package ListInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CheckValueExistInList {
	public static void main(String[] args) {
		List<String> elm = Arrays.asList("Shivam","Rihan","Vikas","Sumit","Abhi");
		System.out.println("ArrayList Elements are : " + elm);
		System.out.println();
//		Boolean val =elm.contains("Rihan");
//	
//	System.out.println("Checking if Rihan exits in ArrayList or not based on that return true or false :"+val);
	
		Collections.sort(elm, Collections.reverseOrder());
		  System.out.println("Sorted ArrayList "
                  + "in Descending order : "
                  + elm); 
	}

}
