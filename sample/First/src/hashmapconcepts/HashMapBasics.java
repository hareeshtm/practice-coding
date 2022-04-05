package hashmapconcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {
		
		//no order - no indexing
		//stores values - Key--Value  <K,V>
		//Key cannot be duplicate.. if duplicate given, it will override the old  value with the new value
		//can store n number of null values but only one null key.if 2 null key given, latest  value associated will d take
		//Hash Map is not thread safe -Unsynchronized
		//for traversing use iterator, but not directly on the HashMap, use on either Key or value
		HashMap<String, String> capitalMap=new HashMap<String, String>();
		capitalMap.put("India", "New Delhi");
		capitalMap.put("USA", "WashingTon DC");
		capitalMap.put("UK", "London");
		capitalMap.put("UK", "London1");
		capitalMap.put(null, "Berlin");
		capitalMap.put(null, "los angales");
		capitalMap.put("Russia", null);
		capitalMap.put("Autria", null);
		capitalMap.remove("Autria");
		
		System.out.println(capitalMap.get("India"));
		System.out.println(capitalMap.get("UK"));
		System.out.println(capitalMap.get(null));
		System.out.println(capitalMap.get("Russia"));
		
		//Iterator: over the Keys :by using keySet()
		Iterator<String> itr=capitalMap.keySet().iterator();
		while(itr.hasNext())
		{
			String key=itr.next();
			String value=capitalMap.get(key);
			System.out.println("Key :"+ key + " value :"+ value	);
		}
		System.out.println("----------------------------------");
		
		//Iterator: over the set :by using entrySet()
		Iterator<Entry<String,String>> itr1=capitalMap.entrySet().iterator();
		while(itr1.hasNext())
		{
			Entry<String, String> entry=itr1.next();
			System.out.println("Key :"+ entry.getKey() + " value :"+ entry.getValue());
		}
		
		System.out.println("----------------------------------");
		//Iterate hashmap using java8 foreach and lambda:
			
		capitalMap.forEach((k,v) -> System.out.println("Key :"+ k + " value :"+ v	));
		
	}

}