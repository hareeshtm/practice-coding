package collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SwapTwoElements {

	public static void main(String[] args) {
		//Collections.swap() method for swapping.
		//public static void swap(List list, int i1, int i2)
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Sachin");
	    al.add("Rahul");
	    al.add("Saurav");
	    al.add("Sunil");
	    al.add("Kapil");
	    al.add("Vinod");
	    System.out.println("ArrayList before Swap:");
	    for(String s: al)
	    	System.out.println(s);
	    //Swapping 2nd(index 1) element with the 5th(index 4) element
	    Collections.swap(al,1, 4);
	    
	    System.out.println("ArrayList after Swap:");
	    for(String s: al)
	    	System.out.println(s);
	    
	    
	    //reversing arrayList
	    ArrayList<String> al2 = new ArrayList<String>();
	    al2.add("Sachin");
	    al2.add("Rahul");
	    al2.add("Saurav");
	    al2.add("Sunil");
	    al2.add("Kapil");
	    al2.add("Vinod");
	    System.out.println("Before reversing");
	    for(String s:al2)
	    	System.out.println(s);
	    for(int i=0;i<al2.size()/2;i++)
	    {
	    	Collections.swap(al2, i, al2.size()-i-1);
	    }
	    System.out.println("After reversing");
	    for(String s:al2)
	    	System.out.println(s);

	}

}
