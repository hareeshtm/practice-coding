package collections.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import java8.Comparable1;

public class HashMapBasic {

	public static void main(String[] args) {

		HashMap<Integer,String> hmap=new HashMap<>();
		  /*Adding elements to HashMap*/
	      hmap.put(12, "Chaitanya");
	      hmap.put(2, "Rahul");
	      hmap.put(7, "Singh");
	      hmap.put(8, "Singh");
	      hmap.put(49, "Ajeet");
	      hmap.put(3, "Anuj");
	      Iterator itr=hmap.entrySet().iterator();
	      while(itr.hasNext())
	      {
	    	  Entry<Integer, String> en=(Entry<Integer, String>) itr.next();
	    	  System.out.println(en.getKey() + "  "+ en.getValue());	    	  
	      }
	      
	      /* Get values based on key*/
	      
	      String var= hmap.get(2);
	      System.out.println("Value at index 2 is: "+var);
	      
	      /* Remove values based on key*/
	      hmap.remove(3);
	      System.out.println("Map key and values after removal:");
	      hmap.forEach((k,v)->System.out.println("Key: "+ k +" value: "+v));
	      
	      System.out.println(hmap.values());
	      
	    //Different iterations
	    
	      
	      System.out.println("------------------------------");
	      //For loop
	      for(Entry<Integer, String> e:hmap.entrySet())
	    	  System.out.println(e.getKey() +"  "+ e.getValue());

	      System.out.println("------------------------------");
	      for(Integer i:hmap.keySet())
	      {
	    	  System.out.println(i + " "+ hmap.get(i));
	      }
	      
	      //While Loop
	      System.out.println("------------------------------");
	      Iterator it2=hmap.entrySet().iterator();
	      while(it2.hasNext())
	      {
	    	  Entry<Integer, String> en=(Entry<Integer, String>) it2.next();
	    	  System.out.println(en.getKey() +"  "+ en.getValue());
	      }
	      System.out.println("------------------------------for each");
	      hmap.entrySet().forEach(e->System.out.println(e.getKey()+" "+e.getValue()));
	      
	  
	}

}
