package collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListIterator {
	
	public static void main(String[] args) {
		//Using Listterator we can iterate the list in both the directions(forward and backward)
		//Along with traversing, we can also modify the list during iteration, 
		//and obtain the iterator’s current position in the list.
		List<String> linkedlist = new LinkedList<String>();
		// Add elements to LinkedList
	    linkedlist.add("Delhi");
	    linkedlist.add("Agra");
	    linkedlist.add("Mysore");
	    linkedlist.add("Chennai");
	    linkedlist.add("Pune");
	    
	    //ListIterator  listIt=linkedlist.listIterator();
	    System.out.println("Forward iteration:");
	  //  while(listIt.hasNext())
	    	//System.out.println(listIt.next());
	    
	    
		
	}

}
