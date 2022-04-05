package collections.linkedlist;

import java.util.LinkedList;

public class PeekLinkedList {

	public static void main(String[] args) {
		//public E peek(): Retrieves, but does not remove, the head (first element) of this list.
	     // Create a LinkedList of Strings
	     LinkedList<String> list = new LinkedList<String>();
	  // Add few Elements
	     list.add("Element1");
	     list.add("Element2");
	     list.add("Element3");
	     list.add("Element4");
	     

	     // Display LinkList elements
	     System.out.println("LinkedList before: "+list);
	     
	     //peek()
	     System.out.println(list.peek());
	     
	     //public E peekFirst(): Retrieves, but does not remove, 
	     //the first element of this list, or returns null if this list is empty.
	     
	   //peekFirst()
	     System.out.println(list.peekFirst());
	     
	     //public E peekLast(): Retrieves, but does not remove, 
	     //the last element of this list, or returns null if this list is empty.
	     
	   //peekLast()
	     System.out.println(list.peekLast());

	     

	}

}
