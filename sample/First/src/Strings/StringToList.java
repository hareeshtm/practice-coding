package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StringToList {
public static void main(String[] args) {
	
	String strings[]= {"A","B","C"};
	List<String> list=new ArrayList<String>();
	Collections.addAll(list, strings);
	list.add("D");
	System.out.println(list);
	
	Iterator<String> itr=list.iterator();
	while(itr.hasNext())
		System.out.println(itr.next());
	
	Collections.synchronizedList(list);
	
	synchronized (list) {
		for(String s:list)
		{
			System.out.println(s);
		}
		
	}

	
	
	
//	List<String> list=Arrays.asList(strings);
//	System.out.println(list);
//	list.add("D");
	
	
	
	
	
	
	

	
}
}
