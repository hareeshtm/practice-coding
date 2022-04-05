package codes;
/*
 * 
Problem description: Given a string, determine if it is a palindrome, considering 
only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:
Input: "A man, a plan, a canal: Panama"
Output: true

Example 2:
Input: "race a car"
Output: false
 */
public class ValidPalindrome {

	public boolean isPalindrome(String s)
	{
		String s1=s.toLowerCase();
		System.out.println(s1);
		for(int i=0,j=s1.length()-1;i<j;i++,j--)
		{
			if(!(s1.charAt(i)>='a' && s1.charAt(i)<='z'))
			{
				++j;
				continue;	
			}
			if(!(s1.charAt(j)>='a' && s1.charAt(j)<='z'))
			{
				--i;
				continue;	
			}
			
			if(s1.charAt(i)!=s1.charAt(j))
				return false;
		}
		
		return true;
	}
	public static void main(String[] args) {
		
		ValidPalindrome v= new ValidPalindrome();
		
		String s="malayalam";
		
		System.out.println(v.isPalindrome(s));
	}

}
