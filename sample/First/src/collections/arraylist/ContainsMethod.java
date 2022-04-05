package collections.arraylist;

import java.util.ArrayList;

public class ContainsMethod {

	public static void main(String[] args) {
		//ArrayList contains() method is used for checking the specified element existence in the given list.
		//public boolean contains(Object element)
		ArrayList<String> al = new ArrayList<String>();
		al.add("pen");
	      al.add("pencil");
	      al.add("ink");
	      al.add("notebook");
	      
	      System.out.println(al.contains("pencil"));

	}

}
