package collections.arraylist;

import java.util.ArrayList;

public class TrimToSize {

	public static void main(String[] args) {
		//trimToSize() method is used for memory optimization.
		//It trims the capacity of ArrayList to the current list size.
		//For e.g. An arraylist is having capacity of 15 but there are only 5 elements in it, calling trimToSize() method on
		//this ArrayList would change the capacity from 15 to 5.
		
		ArrayList<Integer> arraylist = new ArrayList<Integer>(50);
		arraylist.add(1);
	    arraylist.add(2);
	    arraylist.add(3);
	    arraylist.add(4);
	    arraylist.add(5);
	    arraylist.add(6);
	    arraylist.add(7);
	    arraylist.add(1);
	    arraylist.add(1);
	    arraylist.add(1);
	   arraylist.trimToSize();
	   System.out.println(arraylist);
	    
	}

}
