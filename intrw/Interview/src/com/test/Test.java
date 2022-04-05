package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		List<String> s=new ArrayList<String>();
		
		s.add("Hai");
		s.add("Hai");
		s.add("Hello");
		Map<String,Long> ele=s.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		for(Entry e:ele.entrySet())
		{
			String k= (String) e.getKey();
			System.out.println(k +" " + e.getValue() );
		}

		
	}

}
