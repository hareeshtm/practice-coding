package collections.arraylist;

import java.util.ArrayList;

public class EmptyArrayList {

	public static void main(String[] args) {
	//There are two ways to empty an ArrayList – By using ArrayList.clear() method or with the help of ArrayList.removeAll() method.
		ArrayList<String> al1=new ArrayList<String>();
	       al1.add("abc");
	       al1.add("xyz");
	       System.out.println("ArrayList before clear: "+al1);
	       al1.clear();
	       System.out.println("ArrayList after clear: "+al1);
	       
	       ArrayList<String> al2=new ArrayList<String>();
	       al2.add("text 1");
	       al2.add("text 2");

	       System.out.println("ArrayList before removeAll: "+al2);
	       al2.removeAll(al2);
	       System.out.println("ArrayList before removeAll: "+al2); 

	}

}
