package MapInterface;

import java.util.Hashtable;

public class HashTableTest {

	public static void main(String[] args) {
		
		Hashtable <Integer,String> ht = new Hashtable<>();
		ht.put(1, "Shivam");
		ht.put(2, "Abhi");
//		ht.put(3, null);
//		ht.put(null,null);
		ht.put(1, "neetu");
		
System.out.println(ht.get(1));
	}

}
