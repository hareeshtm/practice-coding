package collections.arraylist;

import java.util.ArrayList;

public class FirstIndex {

	public static void main(String[] args) {
		//public int indexOf(Object o)
		//This method returns -1 if the specified element is not present in the list.
		
		 ArrayList<Integer> al = new ArrayList<Integer>();
		 al.add(1);
	      al.add(88);
	      al.add(9);
	      al.add(17);
	      al.add(17);
	      al.add(9);
	      al.add(17);
	      al.add(91);
	      al.add(27);
	      al.add(1);
	      al.add(17);
	      System.out.println("First occurrence of elent 1: "+ al.indexOf(1));
	      System.out.println("First occurrence of elent 9: "+ al.indexOf(9));
	      System.out.println("First occurrence of elent 17: "+ al.indexOf(17));

	}

}
