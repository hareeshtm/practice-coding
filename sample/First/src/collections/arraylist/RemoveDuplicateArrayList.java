package collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateArrayList {

	public static void main(String[] args) {
	
		ArrayList<Integer> numbers=new ArrayList<Integer>(Arrays.asList(1,1,2,2,33,4,44,4,4,4,55,55,6,6,6,7,7,8,8,9,9,10,10));
		//1.Linked Hash Set
		LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<Integer>(numbers);//passing list
		
		ArrayList<Integer> withoutDuplicates=new ArrayList<Integer>(linkedHashSet);
		System.out.println(withoutDuplicates);
		
		ArrayList<Integer> markList=new ArrayList<Integer>(Arrays.asList(1,1,2,2,33,4,44,4,4,4,55,55,6,6,6,7,7,8,8,9,9,10,10));
		//2 . JDK-8 Stream
		
		List<Integer> unique=markList.stream()
				.distinct().sorted()
				.collect(Collectors.toList());
		System.out.println(unique);
		
	}

}
