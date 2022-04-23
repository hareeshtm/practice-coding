package collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class IterateArrayList {

	public static void main(String[] args) {
	
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
	      arrlist.add(14);
	      arrlist.add(7);
	      arrlist.add(39);
	      arrlist.add(40);
	      /* For Loop for iterating ArrayList */
	      for(int c=0;c<arrlist.size();c++)
	    	  System.out.println(arrlist.get(c));
	      
	      System.out.println("--------------------------");

	      /* Advanced For Loop*/
	      for(Integer i:arrlist)
	    	  System.out.println(i);
	      
	      System.out.println("--------------------------");
	      

	      /*Looping Array List using Iterator*/
	      Iterator itr=arrlist.iterator();	
	      while(itr.hasNext()) {
	    	  System.out.println(itr.next());
	      }
	      System.out.println("--------------------------stream sorting");
	      arrlist.stream().sorted().forEach(e->System.out.println(e));
	      
	      System.out.println("--------------------------stream sorting reverse");
	      arrlist.stream().sorted(Collections.reverseOrder()).forEach(e->System.out.println(e));
	      System.out.println("-------------------------");
	      arrlist.stream().sorted((i1,i2)->Integer.compare(i2, i1)).forEach(e->System.out.println(e));
	      //Sorting in reverse order
	      Collections.sort(arrlist,Collections.reverseOrder());
	      System.out.println(arrlist);
	      
	      ArrayList<Integer> arrlist2 = new ArrayList<Integer>();
	      arrlist2.add(14);
	      arrlist2.add(7);
	      arrlist2.add(39);
	      arrlist2.add(40);
	      Collections.sort(arrlist2);
	     Collections.reverse(arrlist2);
	     System.out.println(arrlist2);
	      
	}

}
