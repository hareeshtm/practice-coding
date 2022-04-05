package collections.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class AddElement {

	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<>();
		list.add("Steve");
	     list.add("Carl");
	     list.add("Raj");

	     System.out.println(list);
	     //Adding an element to the first position
	     list.addFirst("Hareesh");
	   //Adding an element to the last position
	     list.addLast("Arya");
	     System.out.println(list);
	     
	   //Removing First element
	     list.removeFirst();
	     
	     //Removing Last element
	     list.removeLast();
	     
	     System.out.println(list);
	     list.remove(1);
	     System.out.println(list);
	     //getting element
	     System.out.println(list.get(0));
	     //set value
	     list.set(1, "Amal");
	     System.out.println(list);
	     
	     //add to a position
	     list.add(0, "Deeraj");
	     System.out.println(list);
	     
	     //adding arraylist to linked list
	     LinkedList<String> lList=new LinkedList<>();
	     ArrayList<String> aList=new ArrayList<>();
	     aList.add("Hareesh");
	     aList.add("Arya");
	     aList.add("Mahendran");
	     lList.addAll(aList);
	     System.out.println(aList);
	     System.out.println(lList);
	     
	     
	     System.out.println(list.getFirst());
	     System.out.println(list.getLast());
	     
	     //Object poll(): It returns and removes the first item of the list.
	     //Object pollFirst():same as poll() method. Removes the first item of the list.
			
	    System.out.println(lList.poll()); 
	    System.out.println(lList);
	    //Object pollLast(): It returns and removes the last element of the list.
	    System.out.println(lList.pollLast());
	    System.out.println(lList);
	    
	}

}
