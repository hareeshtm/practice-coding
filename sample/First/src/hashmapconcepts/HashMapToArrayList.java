package hashmapconcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapToArrayList {
public static void main(String[] args) {
	
	HashMap<String, Integer> compMap=new HashMap<String, Integer>();
	compMap.put("Google", 10000);
	compMap.put("Walmart", 20000);
	compMap.put("Amazon", 30000);
	compMap.put("facebook", 40000);
	compMap.put("cisco", 70000);
	//converting keys into 1 ArrayList and values to another
	
	//convert Hashmap keys into ArrayList
	List<String> compNamesList=new ArrayList<String>(compMap.keySet());
	System.out.println(compNamesList);
	
	for(String t:compNamesList)
		System.out.println(t);
	
	System.out.println("----------------------------");
	//convert Hashmap values into ArrayList
	List<Integer> empCount=new ArrayList<Integer>(compMap.values());	
	System.out.println(empCount);
	for(Integer i:empCount)
		System.out.println(i);
}

}
