package MapInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {
	
	public static void main(String[] args) {
		
	
	HashMap <Integer,String> hm = new HashMap<> ();
	
	hm.put(1,"Shivam");
	hm.put(2,"Abhi");
	hm.put(3,"Neetu");
	hm.put(null,null);
	hm.put(0,"null");
	
	System.out.println(hm);
	System.out.println(hm.get(2));
	
	
	Map <Integer, ArrayList <String>> mp  = new HashMap<>();
	{
		ArrayList<String> citi_411057 = new ArrayList<>();
		citi_411057.add("Hinjewadi");
		citi_411057.add("Maan");
		
		mp.put(411057, citi_411057);
		
	}
		
	}
	
	
	public void iterateMap ( HashMap <Integer,String> hm)
	{
	Set<Integer> keys =	hm.keySet();
	
	for (Integer values : keys) {
		System.out.println(hm.get(values));
		
	}
//	Collection<String> values =	hm.values();
//	Set	<Entry <Integer,String>> mapvalues =hm.entrySet();
//	for (Entry<Integer, String> entry : mapvalues) {
//		System.out.println(hm.get(mapvalues));
	}
	
	
	}


