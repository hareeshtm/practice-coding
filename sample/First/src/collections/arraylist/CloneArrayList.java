package collections.arraylist;

import java.util.ArrayList;

public class CloneArrayList {

	public static void main(String[] args) {
		//Object clone()
		//This method returns a shallow copy of the ArrayList instance.
		//The interesting point to see here is when we added and 
		//removed few elements from original ArrayList after the clone() method, 
		//the cloned ArrayList didn’t get affected.
		ArrayList<String> al = new ArrayList<String>();
		al.add("Apple");
	     al.add("Orange");
	     al.add("Mango");
	     al.add("Grapes");
	     System.out.println("ArrayList: "+al);
	     ArrayList<String> al2=(ArrayList<String>) al.clone();
	     System.out.println("Shallow copy of ArrayList: "+ al2);
	     
	     al.add("Fig");
	     al.remove("Mango");
	     System.out.println("Original ArrayList:"+al);
	     System.out.println("Cloned ArrayList:"+al2);
	     
	     
		
	}

}
