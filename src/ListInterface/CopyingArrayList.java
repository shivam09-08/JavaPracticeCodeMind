package ListInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyingArrayList {

	public static void main(String[] args) {
		List<String> al1 = Arrays.asList("Shivam","Neetu","Sumit","Ritika","Vikas","Abhi"); 
		List<String> al2 =new ArrayList<String>();
		System.out.println("List One values are : " +al1);
		al2.addAll(al1);
		
//		List<List<String>> al2 =Arrays.asList(al1);
//		
//		for (List<String> items : al2) {
//			System.out.println(items);
//		}
		for (String items : al2) {
			System.out.println( "List2 values After copying the list one is: "+items);
		}
	}
}
