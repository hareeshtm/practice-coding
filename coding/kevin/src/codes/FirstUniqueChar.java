package codes;

import java.util.HashMap;

/*
 * Problem description: Given a string, find the first non-repeating character in it and return it's index. 
 * If it doesn't exist, return -1.
 * Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.

 */
public class FirstUniqueChar {
	public int firstUniqueChar(String s)
	{
		HashMap<Character, Integer> hashMap=new HashMap<Character, Integer>();
		
		for(int i=0;i<s.length();i++)
		{
			if(!(hashMap.containsKey(s.charAt(i))))
			{
				hashMap.put(s.charAt(i), i);
			}
			else
				hashMap.put(s.charAt(i), -1);
		}
		
		int min=Integer.MAX_VALUE;
		for(Character c:hashMap.keySet())
		{
			if(hashMap.get(c)>-1&&hashMap.get(c)<min)
				min=hashMap.get(c);
		}
		return min==Integer.MAX_VALUE ? -1: min;
		
	}

	public static void main(String[] args) {
		
		String s="loveleetcode";
		
		FirstUniqueChar fs=new FirstUniqueChar();
		System.out.println(fs.firstUniqueChar(s));
	}

	
	
}
