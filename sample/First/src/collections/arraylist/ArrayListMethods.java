package collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList<String> ar1=new ArrayList<String>();
		ar1.add("Hareesh");
		ar1.add("mohan");
		ar1.add("arya");
		ar1.add("ramu");
		
		ArrayList<String> ar2=new ArrayList<String>();
		ar2.add("Anitha");
		ar2.add("Mahendran");
		//ar1.addAll(ar2);
//		ar1.addAll(2, ar2);
//		System.out.println(ar1);
//		ar1.clear();
//		System.out.println(ar1);
		
//		ArrayList<String> cloneList=(ArrayList<String>)ar1.clone();
//		System.out.println(cloneList);
//		
//		System.out.println(ar1.contains("Hareesh"));
//		
//		System.out.println(ar1.indexOf("arya"));
		
		ArrayList<String> list1=new ArrayList<String>(Arrays.asList("hareesh","naveen","hareesh","arya","hareesh"));
		System.out.println(list1);
		int i=list1.lastIndexOf("hareesh");
		System.out.println(i);
		
		list1.remove(1);
		System.out.println(list1);
		list1.remove("arya");
		System.out.println(list1);	
		
		ArrayList<Integer> numbers=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		numbers.removeIf(num -> num%2==0);
		System.out.println(numbers);
		
		System.out.println("Printing common ele----------------");
		ArrayList<String> list2=new ArrayList<String>(Arrays.asList("hareesh","naveen","hareesh","arya","hareesh","babu"));
		list2.retainAll(Collections.singleton("hareesh"));
		System.out.println(list2);
		
		ArrayList<Integer> numbers2=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16));
		ArrayList<Integer> subList=new ArrayList<Integer>(numbers2.subList(0, 7));
		System.out.println(subList);
		
		//convert list to array using toArray() method
		ArrayList<String> list3=new ArrayList<String>(Arrays.asList("hareesh","naveen","hareesh","arya","hareesh","babu"));
		Object arr[]=list3.toArray();
		System.out.println(Arrays.toString(arr));
		
		//printing using for each loop
		for(Object ob:arr)
		{
			System.out.println(ob);
		}
		
	}

}
