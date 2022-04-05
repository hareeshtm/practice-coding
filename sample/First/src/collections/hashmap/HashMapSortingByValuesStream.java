package collections.hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class HashMapSortingByValuesStream {
	
	public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
    {
		LinkedHashMap<String, Integer> lmap=hm.entrySet()
				.stream()
				.sorted((e1,e2)->e1.getValue().compareTo(e2.getValue()))
				.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
						(e1,e2)->e1,LinkedHashMap::new));
		
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
