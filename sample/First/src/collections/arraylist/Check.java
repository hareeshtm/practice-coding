package collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Check {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> number=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		number.removeIf(num->num%2==0);
		System.out.println(number);
		
		Iterator<Integer> itr=number.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		HashMap<String, String> capitalMap=new HashMap<String, String>();
		capitalMap.put("India", "New Delhi");
		capitalMap.put("USA", "WashingTon DC");
		capitalMap.put("UK", "London");
		capitalMap.put("UK", "London1");
		capitalMap.put(null, "Berlin");
		capitalMap.put(null, "los angales");
		capitalMap.put("Russia", null);
		capitalMap.put("Autria", null);
		capitalMap.remove("Autria");
		
		Iterator<String> it=capitalMap.keySet().iterator();
		while(it.hasNext())
		{
			String k=it.next();
			System.out.println(k +"  "+ capitalMap.get(k));
		}
		System.out.println("-----------------------------------------");
		Iterator<Entry<String,String>> ie=capitalMap.entrySet().iterator();
		while(ie.hasNext())
		{
			Entry<String,String> en=ie.next();
			System.out.println(en.getKey() +" "+ en.getValue());
		}
		System.out.println("-----------------------------------------");
		
		capitalMap.forEach((k,v)-> System.out.println(k +" "+ v));
	}
}
