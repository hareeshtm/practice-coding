package collections.treemap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class ReverseOrder {

	public static void main(String[] args) {
		// iterate TreeMap in reverse order in Java
		// default TreeMap elements are sorted in ascending order of keys
		//We can iterate the TreeMap in reverse order to display the elements in descending order of keys.
		
		Map<String,String> treemap=new TreeMap<>(Collections.reverseOrder());
		
		 // Put elements to the map
	    treemap.put("Key1", "Jack");
	    treemap.put("Key2", "Rick");
	    treemap.put("Key3", "Kate");
	    treemap.put("Key4", "Tom");
	    treemap.put("Key5", "Steve");
	    Iterator itr2	=treemap.entrySet().iterator();
	    while(itr2.hasNext())
        {
       	 Entry<Integer, String> en=(Entry<Integer, String>) itr2.next();
       	 System.out.println(en.getKey() +"  "+en.getValue());
       	
	}

}
}
