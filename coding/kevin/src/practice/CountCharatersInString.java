package practice;

import java.util.HashMap;
import java.util.Map.Entry;

public class CountCharatersInString {

	public static void main(String[] args) {
		String s="Hi this is Hareesh and how are you";
		s=s.toLowerCase();
		char arr[]=s.toCharArray();
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		for(Character c:arr)
		{
			if(c==' ')
			continue;
			
			if(!map.containsKey(c))
				map.put(c, 1);
			else
			{
				map.put(c, map.get(c)+1);
			}	
		}
		
	for(Entry<Character, Integer> e:map.entrySet())
	{
		System.out.println(e.getKey() +" "+e.getValue());
	}

	}

}
