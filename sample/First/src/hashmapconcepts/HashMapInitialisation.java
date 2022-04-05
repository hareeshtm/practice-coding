package hashmapconcepts;

import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapInitialisation {

	public static Map<String, Integer> marksMap	;
	
	static
	{
		marksMap=new HashMap<String, Integer>();
		marksMap.put("A", 100);
		marksMap.put("B", 2200);
	}
	
	public static void main(String[] args) {
	
			//1. Using HashMap class
		HashMap<String, String> map1=new HashMap<String, String>();
		Map<String,String> map2=new HashMap<>();
		
		//2. Static way :Static HashMap
		System.out.println(HashMapInitialisation.marksMap.get("A"));
		
		//3.Immutable map with only one single entry
		Map<String,Integer> map3=Collections.singletonMap("test", 100);
		System.out.println(map3.get("test"));
		//map3.put("abc", 200);//UnsupportedOperationException
		
		//4 . JDK 8
		
		//creating one 2D array of Strings using Stream and collecting in the form Map
		Map<String, String> map4=Stream.of(new String [][] {
			{"Tom","A Grade"},
			{"Hareesh","A+ Grade"}
		}).collect(Collectors.toMap(data->data[0], data->data[1]));
		System.out.println(map4.get("Hareesh"));
		map4.put("Arya", "A++ grade");
		System.out.println(map4.get("Arya"));
		
		//using SimpleEntry :mutable map
		Map<String,String> map5=Stream.of(
new AbstractMap.SimpleEntry<>("Naveen","Java"),
new AbstractMap.SimpleEntry<>("Hareesh","Python")
										).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(map5.get("Hareesh"));
		map5.put("Arya", "Cpp");
		System.out.println(map5.get("Arya"));
		
		//JDK 1.9
		//EmptyMap
		Map<String,String> emptyMap=Map.of();
		//emptyMap.put("Hareesh", "Elavally");
		//System.out.println(emptyMap.get("Hareesh"));//UnsupportedOperationException
		
		//singleton map
		Map<String,String> singletonMap=Map.of("k1","v1");
		System.out.println(singletonMap.get("k1"));
		//singletonMap.put("k2", "v2");//UnsupportedOperationException
		
		//Multi value Map : max of 10 key value pairs can be stored
		Map<String,String> multivalueMap=Map.of("k1","v1","k2","v2","k3","v3");
		System.out.println(multivalueMap.get("k3"));
		//multivalueMap.put("K4", "v4");//UnsupportedOperationException
		
		//using Map.ofEntries : no limitations on key and value pairs
		//immutable
		Map<String, Integer> map7=Map.ofEntries(
				new AbstractMap.SimpleEntry<>("A",100),
				new AbstractMap.SimpleEntry<>("B",200)
				);
		System.out.println(map7.get("A"));
		//map7.put("C", 300);//UnsupportedOperationException
	}

}
