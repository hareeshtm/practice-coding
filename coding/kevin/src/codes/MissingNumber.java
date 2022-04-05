package codes;

import java.util.HashSet;

/*
 * Problem description: Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, 
 * find the one that is missing from the array.

Example 1:
Input: [3,0,1]
Output: 2

Example 2:
Input: [9,6,4,2,3,5,7,0,1]
Output: 8

Note: Your algorithm should run in linear runtime complexity. 
Could you implement it using only constant extra space complexity?
 */
public class MissingNumber {
	public int missingNumber(int[] nums)
	{
//		HashSet<Integer> set=new HashSet<Integer>();
//		for(int i:nums)
//			set.add(i);
//		
//		for(int i=0;i<=nums.length;i++)
//			if(!set.contains(i))
//				return i;
//		
//		return -1;
		int sum=0;
		for(int i:nums)
			sum+=i;
		int n=nums.length+1;
		return (n*(n-1))/2 -sum;
	}

	public static void main(String[] args) {
		MissingNumber n=new MissingNumber();
		int inp[]= {9,6,4,2,3,5,7,0,1};
		
		int missing=n.missingNumber(inp);
		System.out.println(missing);

	}

}