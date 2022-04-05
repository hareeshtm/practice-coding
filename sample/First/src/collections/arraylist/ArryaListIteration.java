package collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArryaListIteration {

	public static void main(String[] args) {
	
		List<String> stuList=new ArrayList<String>();
		stuList.add("Hareesh");
		stuList.add("sdsd");
		stuList.add("arya");
		stuList.add("asdfg");
		
		//for Loop
		for(int i=0;i<stuList.size();i++)
			System.out.println(stuList.get(i));
		
		System.out.println("-----------------");
		//for each Loop
		for(String s:stuList)
			System.out.println(s);
		
		System.out.println("-----------------");
		//JDK 8 Streams with Lambda
		stuList.stream().forEach(ele -> System.out.println(ele));
		
		System.out.println("-----------------");
		
		//Iterator
		Iterator<String> itr=stuList.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("-----------------");
	//list with other colection
		
		ArrayList<Integer> numbers=new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		System.out.println(numbers);
		
	}

}
