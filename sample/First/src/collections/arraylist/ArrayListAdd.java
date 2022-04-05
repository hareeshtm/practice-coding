package collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.stream.Collectors;

public class ArrayListAdd {

	public static void main(String[] args) {
		ArrayList<String> alist=new ArrayList<>();
		alist.add("Steve");
		alist.add("Tim");
	    alist.add("Lucy");
	    alist.add("Pat");
	    alist.add("Angela");
	    alist.add("Tom");
	    
	    System.out.println(alist);
	    alist.add(3, "Steve");
	    System.out.println(alist);
	    //Change an element in ArrayList
	    alist.set(0, "Hareesh");
	    System.out.println(alist);
	   
	    //remove elements from ArrayList
	    alist.add("Hareesh");
	    System.out.println(alist);
	    alist.remove("Hareesh");
	    System.out.println(alist);
	    alist.remove(2);
	    System.out.println(alist);
	    alist.remove(alist.size()-1);
	    System.out.println(alist);
	    ArrayList<String> blist=new ArrayList<>();
	    		blist.addAll(alist);
	    ArrayList<String> clist=new ArrayList<>();
	    		clist.addAll(alist);
	    //Iterating ArrayList
	    System.out.println("--------------------------");
	    for(String str:alist)
	    	System.out.println(str);
	    System.out.println("--------------------------");
	    Iterator<String> itr=alist.iterator();
	    while(itr.hasNext())
	    	System.out.println(itr.next());
	    
	    System.out.println("--------------------------");
	    alist.stream().forEach(str-> System.out.println(str));
	    //Sort ArrayList
	    System.out.println("-------------------------- sorted");
	    Collections.sort(alist);
	    alist.stream().forEach(str-> System.out.println(str));
	    System.out.println("-------------------------- sorted using stream");
	    System.out.println(blist.stream().sorted().collect(Collectors.toList()));
	    System.out.println("-------------------------- sorted using stream and printing using forEach");
	    clist.stream().sorted().forEach(str->System.out.println(str));
	    
	    if(alist.contains("Angela"))
	    	System.out.println("True");
	    blist.clear();
	    System.out.println(blist);
	    
	    alist.add("Angela");
	    alist.add(1,"Angela");
	    System.out.println(alist);
	    alist.stream().distinct().forEach(str->System.out.println(str));
	    
	}

}
