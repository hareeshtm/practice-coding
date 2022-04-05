package collections.linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class AddFrontOfLinkedList {
public static void main(String[] args) {
	//Program to add element to front(head) of LinkedList
	LinkedList<String> list = new LinkedList<String>();

    // Add elements
    list.add("AA");
    list.add("BB");
    list.add("CC");
    list.add("DD");
    
    list.offerFirst("Hareesh");
    System.out.println(list);
    list.offer("Arya");//adding in the last
    System.out.println(list);
    
    list.removeAll(list);
    System.out.println(list);
    //append all the elements of linked list to list	
    LinkedList<String> lList=new LinkedList<>();
    ArrayList<String> aList=new ArrayList<>();
    lList.add("Hareesh");
    lList.add("Arya");
    lList.add("Mahendran");
    aList.addAll(lList);
    System.out.println(aList);
    
    Collections.sort(lList);
    System.out.println(lList);
    Collections.sort(lList,Collections.reverseOrder());
    System.out.println(lList);
    
}
}
