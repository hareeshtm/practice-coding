package collections.arraylist;

import java.util.ArrayList;

public class LastIndexof {

	public static void main(String[] args) {
		//public int lastIndexOf(Object obj)
		//This would return the index of last Occurrence of element Obj in the ArrayList.
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
	      
	      System.out.println("Last occurrence of elent 1: "+ al.lastIndexOf(1));
	      System.out.println("Last occurrence of elent 9: "+ al.lastIndexOf(9));
	      System.out.println("Last occurrence of elent 17: "+ al.lastIndexOf(17));
	}

}
