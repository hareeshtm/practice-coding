package hashmapconcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapCompare {

	public static void main(String[] args) {

		HashMap<Integer, String> map1=new HashMap<Integer, String>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		
		HashMap<Integer, String> map2=new HashMap<Integer, String>();
		map2.put(2, "B");
		map2.put(1, "A");
		map2.put(3, "C");
		
		HashMap<Integer, String> map3=new HashMap<Integer, String>();
		map3.put(2, "B");
		map3.put(1, "A");
		map3.put(3, "C");
		map3.put(3, "D");
		
		//1 Compare on the basis  of Key value:Use equals method.
		//if both key and value are same then true.
		System.out.println(map1.equals(map2));//true
		System.out.println(map1.equals(map3	));//true
		
		//compare hashmap for the same keys: keySet()
		
	System.out.println(map1.keySet().equals(map2.keySet()));//true
	System.out.println(map1.keySet().equals(map3.keySet()));//true
	
		//find out the extra keys
	
	HashMap<Integer, String> map4=new HashMap<Integer, String>();
	map4.put(2, "B");
	map4.put(1, "A");
	map4.put(3, "C");
	map4.put(4, "D");
	
		//Combine/union the keys from both the maps: using HashSet
		//HashSet wont allow duplicate elements..using that property
	HashSet<Integer> combineKeys= new HashSet<Integer>();
	combineKeys.addAll(map4.keySet());
	combineKeys.removeAll(map1.keySet());//removes all the keys which are there in map1 
	//combine keys contains 1,2,3,4 so 1,2,3 which is there in map1 will be removed	
	System.out.println(combineKeys);//only 4 will be present
	
	//4. Compare maps by values

	HashMap<Integer, String> map5=new HashMap<Integer, String>();
	map5.put(1, "A");
	map5.put(2, "B");
	map5.put(3, "C");
	
	HashMap<Integer, String> map6=new HashMap<Integer, String>();
	map6.put(4, "A");
	map6.put(5, "B");
	map6.put(6, "C");
	
	HashMap<Integer, String> map7=new HashMap<Integer, String>();
	map7.put(1, "A");
	map7.put(2, "B");
	map7.put(3, "C");
	map7.put(4, "C");
			//1.Duplicates are not allowed :Using ArrayList
			System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values())));//true
			System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map7.values())));//false
			
			//2.Duplicates are allowed :Using HashSet
			System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values())));//true
			System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map7.values())));//true
		
	}

}
