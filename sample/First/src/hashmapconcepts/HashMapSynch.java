package hashmapconcepts;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSynch {

	public static void main(String[] args) {
		
		//synchronizedMap  method in collection class
		Map<String,String> map1=new HashMap<String, String>();
		
		map1.put("1", "Hareesh");
		map1.put("2", "Arya");
		map1.put("3", "Mahendran");
		
		//create Synchronized Map
		Map<String,String> syncMap=Collections.synchronizedMap(map1);
		System.out.println(syncMap);
		
		//ConcurrentHashMap:It doesnt throw any ConcurrentModificationException
		ConcurrentHashMap<String, String> concMap= new ConcurrentHashMap<String, String>();
		concMap.put("A", "Java");
		concMap.put("B", "Python");
		concMap.put("C", "Angular");
		System.out.println(concMap.get("A"));
		System.out.println(concMap);
		
		
	}

}
