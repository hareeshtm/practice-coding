package collections.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetSample {

	public static void main(String[] args) {
		 HashSet<String> hset = 
	               new HashSet<String>();
		// Adding elements to the HashSet
	      hset.add("Apple");
	      hset.add("Mango");
	      hset.add("Grapes");
	      hset.add("Orange");
	      hset.add("Fig");
	      
	    //Addition of duplicate elements
	      hset.add("Apple");
	      hset.add("Mango");
	      
	      //Addition of null values
	      hset.add(null);
	      hset.add(null);
	      //Displaying HashSet elements
	      for(String str: hset)
	    	  System.out.println(str);
	      System.out.println("*******************");
	      Iterator itr=hset.iterator();
	      while(itr.hasNext())
	      {
	    	  System.out.println(itr.next());
	      }
	      
	      //HashSet to array
	      System.out.println("*******************to array");
	      String s[]=new String[hset.size()];
	      hset.toArray(s);
	      for(String t:s)
	      {
	    	  System.out.println(t);
	      }
	      

	}

}
