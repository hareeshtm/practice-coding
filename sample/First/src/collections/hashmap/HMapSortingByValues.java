package collections.hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HMapSortingByValues {
	public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
    {
		List<Entry<String, Integer>> list=new LinkedList<Map.Entry<String,Integer>>(hm.entrySet());
		
		Collections.sort(list,
				(e1,e2)->e1.getValue().compareTo(e2.getValue())
				);
		HashMap<String, Integer> lmap=new LinkedHashMap<String, Integer>();
		
		for(Entry<String, Integer> e:list)
		{
			lmap.put(e.getKey(), e.getValue());
		}
		return lmap;
    }

	public static void main(String[] args) {
		 HashMap<String, Integer> hm = new HashMap<String, Integer>();
		 
	        // enter data into hashmap
	        hm.put("Math", 98);
	        hm.put("Data Structure", 85);
	        hm.put("Database", 91);
	        hm.put("Java", 95);
	        hm.put("Operating System", 79);
	        hm.put("Networking", 80);
	        Map<String, Integer> hm1 = sortByValue(hm);
	 
	        // print the sorted hashmap
	        for (Map.Entry<String, Integer> en : hm1.entrySet()) {
	            System.out.println("Key = " + en.getKey() +
	                          ", Value = " + en.getValue());
	        }

	}

}
