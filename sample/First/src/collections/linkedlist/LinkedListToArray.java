package collections.linkedlist;

import java.util.LinkedList;

public class LinkedListToArray {

	public static void main(String[] args) {
		  //Creating and populating LinkedList
		LinkedList<String> linkedlist = new LinkedList<String>();
	    linkedlist.add("Harry");
	    linkedlist.add("Maddy");
	    linkedlist.add("Chetan");
	    linkedlist.add("Chauhan");
	    linkedlist.add("Singh");
	    
	    //converting a LinkedList of strings to String Array 
	    
	    String[] array=linkedlist.toArray(new String[linkedlist.size()]);
	    for(int i=0;i<array.length;i++)
	    	System.out.println(array[i]);
	}

}
