/*Given a non-empty array of integers, 
 * every element appears twice except for one. Find that single one.
 * 
 * Example 1:
Input: [2,2,1]
	Output: 1
	
	
	xample 2:
	Input: [4,1,2,1,2]
	Output: 4
 */
package codes;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

	public static void main(String[] args) {
			
		int a[]= {4,1,2,1,2};
		
		Set<Integer> set=new HashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(set.contains(a[i]))
				set.remove(a[i]);
			else
				set.add(a[i]);
		}
		
		System.out.println(set);
		
	}

}
