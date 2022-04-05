package collections.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HMapSortingByKeys {

	public static void main(String[] args) {
		//sorting the HashMap based on the keys using the TreeMap collection class.
		 HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		 hmap.put(5, "A");
         hmap.put(11, "C");
         hmap.put(4, "Z");
         hmap.put(77, "Y");
         hmap.put(9, "P");
         hmap.put(66, "Q");
         hmap.put(0, "R");
         
         System.out.println("Before Sorting:");
         Iterator itr=hmap.entrySet().iterator();
         while(itr.hasNext())
         {
        	 Entry<Integer, String> en=(Entry<Integer, String>) itr.next();
        	 System.out.println(en.getKey() +"  "+en.getValue());
         }
         
         Map<Integer, String> map=new TreeMap<Integer, String>(hmap);
         System.out.println("After sorting");
         
         Iterator itr2=map.entrySet().iterator();
         while(itr2.hasNext())
         {
        	 Entry<Integer, String> en=(Entry<Integer, String>) itr2.next();
        	 System.out.println(en.getKey() +"  "+en.getValue());
         }
     ////////////////////////////////////////////////    
       Iterator itr3 = hmap.values().iterator();
       while(itr3.hasNext())
    	   System.out.println(itr3.next());
    	   

	}

}
