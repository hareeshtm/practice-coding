package collections.hashtable;

import java.util.Collections;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;

public class HashTableSort {

	public static void main(String[] args) {
		// Hashtable doesn’t preserve the insertion order,
		//neither it sorts the inserted data based on keys or values. 
		//Which means no matter what keys & values you insert into Hashtable, the result would not be in any particular order.
		//The are ways to sort Hashtable using Collections.list and Collections.sort, 
		//however best thing to do is use LinkedHashMap or TreeMap.
		
		//Using LinkedHashMap
		
		Hashtable<Integer, String> htable=new Hashtable<Integer, String>();
		htable.put(10, "Chaitanya");
		htable.put(1, "Ajeet");
		htable.put(11, "Test");
		htable.put(9, "Demo");
		htable.put(3, "Anuj");
		System.out.println(htable);
		TreeMap<Integer, String> tm= new TreeMap<Integer, String>(htable);
		System.out.println(tm);


	}

}
