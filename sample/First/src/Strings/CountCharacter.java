package Strings;

import java.util.HashMap;
import java.util.Map.Entry;
public class CountCharacter {

	public static void main(String[] args) {
		String s="Hareesh";
		s=s.toLowerCase();
		HashMap<Character, Integer> count= new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++)
		{
			if(!count.containsKey(s.charAt(i)))
				count.put(s.charAt(i), 1);
			else
				count.put(s.charAt(i),count.get(s.charAt(i))+1);			
		}
		
		for(Entry<Character, Integer> e :count.entrySet())
		{
			System.out.println(e.getKey() +"  "+ e.getValue());
		}
	}
	
}
