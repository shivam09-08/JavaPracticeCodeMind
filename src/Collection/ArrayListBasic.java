package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

}
}
