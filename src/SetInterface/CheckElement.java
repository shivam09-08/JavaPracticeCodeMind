package SetInterface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckElement {
public static void main(String[] args) {
	
	Set<Integer> st = new HashSet<Integer>();
	
	st.addAll(Arrays.asList(1,0,4,2,6,7,9,10,32));
	System.out.println(st);
	
	System.out.println("check if set contains 32 or not");
	boolean con =st.contains(32);
	
	System.out.println(con);
	
}
}
