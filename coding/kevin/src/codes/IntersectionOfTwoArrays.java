package codes;

import java.util.HashSet;

/*
 * Problem description: Given two arrays, write a function to compute their intersection.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]

Note:
- Each element in the result must be unique.
- The result can be in any order.
 */
public class IntersectionOfTwoArrays {

	public int[] intersection(int nums1[],int nums2[])
	{
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i:nums1)
			set.add(i);
		
		HashSet<Integer> intersection= new HashSet<Integer>();
		for(int i:nums2)
		{
			if(set.contains(i))
				intersection.add(i);
		}
		
		int result[]=new int[intersection.size()];
		int index=0;
		for(int i:intersection)
			result[index++]=i;
		
		return result;
	}
	public static void main(String[] args) {
		
		int nums1[]= {4,9,5};
		int nums2[]= {9,4,9,8,4};
				
		IntersectionOfTwoArrays b=new IntersectionOfTwoArrays();
		int intersection[]=b.intersection(nums1, nums2);
		for(int i: intersection)
			System.out.println(i);
		
				

	}

}
