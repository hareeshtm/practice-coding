package collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

	public static void main(String[] args) {
		//1. Sort and then equals
		ArrayList<String> l1= new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> l2= new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		Collections.sort(l1);
		Collections.sort(l2);
		if(l1.equals(l2))
			System.out.println("equal");
		else
			System.out.println("not equal");	
		//2.compare the list , findout the additional element
		ArrayList<String> l3= new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> l4= new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		l3.removeAll(l4);
		System.out.println(l3);
		
		//3.Findout the missing elements in l3
		l4.removeAll(l3);
		System.out.println(l4);//will print which is missing in l3
		
		//4 Find common elements in Array List
		ArrayList<String> lang1=new ArrayList<String>(Arrays.asList("python","java","ruby","C#","js","angular"));
		ArrayList<String> lang2=new ArrayList<String>(Arrays.asList("python","java","ruby","PHP","scala",".net"));
		lang1.retainAll(lang2);//returns which is common in both
		System.out.println(lang1);
		
	}

}
