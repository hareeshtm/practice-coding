package collections.treemap;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SubMapFromTreeMap {

	public static void main(String[] args) {
		// how to get a sub map from TreeMap. 
		//We are using subMap() method of TreeMap class.
		// Create a TreeMap
	    TreeMap<String, String> treemap = 
	            new TreeMap<String, String>();

	    // Put elements to the map
	    treemap.put("Key1", "Jack");
	    treemap.put("Key2", "Rick");
	    treemap.put("Key3", "Kate");
	    treemap.put("Key4", "Tom");
	    treemap.put("Key5", "Steve");
	    treemap.put("Key6", "Ram");
	    
	    // Displaying TreeMap elements
	    System.out.println("TreeMap Contains : " + treemap);
	    // Getting the sub map
	  //  The returned map is backed by this map, so changes in the 
	    // * returned map are reflected in this map, and vice-versa. 
	    // * The returned map supports all optional map operations that 
	    // * this map supports.
	    
	    SortedMap<String, String> sortedMap=treemap.subMap("Key2","Key5");
	    System.out.println("SortedMap Contains : " + sortedMap);
	    sortedMap.remove("Key4");
	    
	   // Displaying elements of original TreeMap after 
	    // * removing an element from the Sub Map. Since Sub Map is 
	     //* backed up by original Map, the element should be removed
	     //* from this TreeMap too.
	    System.out.println("TreeMap Contains : " + treemap);
	}

}
