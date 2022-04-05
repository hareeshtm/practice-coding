package collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class SubListFromArrayList {

	public static void main(String[] args) {
		//List subList(int fromIndex, int toIndex)
		// fromIndex is inclusive and toIndex is exclusive
		ArrayList<String> al = new ArrayList<String>();
		al.add("Steve");
	     al.add("Justin");
	     al.add("Ajeet");
	     al.add("John");
	     al.add("Arnold");
	     al.add("Chaitanya");
	     
	     System.out.println("Original: "+ al);
	   //Sublist to ArrayList
	     ArrayList<String> al2=new ArrayList<String>(al.subList(1, 4));
	     System.out.println(al2);
	     
	     //Sublist to List
	     List<String> list=al.subList(1, 4);
	     System.out.println(list);
	     	  
	}

}
