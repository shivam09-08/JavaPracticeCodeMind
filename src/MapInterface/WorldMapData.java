package MapInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class WorldMapData {
	
	public static void main(String[] args) {
		
		WorldMapData obj = new WorldMapData ();
		obj.storeWorldData();
	
	}
	
 	void storeWorldData()
	{
		ArrayList <String> mh = new ArrayList<>();
		mh.add("Pune");
		mh.add("Mumbai");
		
		
		ArrayList <String> karnt = new ArrayList<>();
		karnt.add("Banglore");
		karnt.add("Mausure");
		
		
		HashMap<String , ArrayList<String>> india = new HashMap<>();
		india.put("Maharatra", mh);
		india.put("Karnataka", karnt);
		
		ArrayList<String> usState1 = new ArrayList<>();
		usState1.add("State1 City1");
		usState1.add("State1 City2");
		
		
		ArrayList<String> usState2 = new ArrayList<>();
		usState2.add("State2 City1");
		usState2.add("State2 City2");
		
		HashMap<String , ArrayList<String>> US = new HashMap<>();
		US.put("US State1", usState1);
		US.put("US State2", usState2);
		
		// World Data Store
		
		HashMap <String,HashMap<String ,ArrayList<String>>> world  = new  HashMap<>();
		
		world.put("India", india);
		world.put("US",US);
		
		iterateWorlMAp(world);
		
	}
 	
 	void iterateWorlMAp(HashMap <String,HashMap<String ,ArrayList<String>>> hm) 
 	{
 		Set<String>CountryKey =hm.keySet();
 		for (String CountryName : CountryKey) {
 			System.out.println(CountryName);
			HashMap<String,ArrayList<String>> CountryMap=hm.get(CountryName);
			
			Set<String> StaterKey =CountryMap.keySet();
			for (String StateName : StaterKey) {
				System.out.println(StateName);
				ArrayList<String> CityMap =CountryMap.get(StateName);
				for (String CityName : CityMap) {
					System.out.println(CityName);
				}
				
			}
		}
 	}

}
