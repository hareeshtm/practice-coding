package collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		
		//1. Collections.SynchronizedList Method
		List<String> nameList=Collections.synchronizedList(new ArrayList<String>());
		nameList.add("java");
		nameList.add("python");
		nameList.add("ruby");
		
		//for add or remove we dont need explicit synchronization
		//to fetch / traverse we need to use explicit synchronization.
		
		synchronized (nameList) {
			
			Iterator<String> itr= nameList.iterator();
			while(itr.hasNext())
				System.out.println(itr.next());
		}
		
		//2. copyOnWriteArrayList- its a class
		CopyOnWriteArrayList<String> empList= new CopyOnWriteArrayList<String>();
		empList.add("arya");
		empList.add("hareesh");
		empList.add("anitha");
		
		//we dont need any explicit synchronization for any operation. add/remove/traverse
		Iterator<String> itr2= empList.iterator();
		while(itr2.hasNext())
			System.out.println(itr2.next());
	}
		
		
	}


