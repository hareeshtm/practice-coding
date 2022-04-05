package codes;
/*
 * Problem description: Given a positive integer, check whether it has alternating bits: namely, if two adjacent bits will always have different values.

Example 1:
Input: 5
Output: True
Explanation:
The binary representation of 5 is: 101

Example 2:
Input: 7
Output: False
Explanation:
The binary representation of 7 is: 111.
 */
public class BinaryNumberWithAlternateBits {

	public boolean  hasAlternatingBits(int n)
	{
		int last=n%2;
		n=n>>1;
		while(n>0)
		{
			int current=n%2;
			if(current==last)
				return false;
			last=current;
			n=n>>2;
		}
		return true;
		
	}
	public static void main(String[] args) {

		BinaryNumberWithAlternateBits b=new BinaryNumberWithAlternateBits();
		int n=1;
		
		System.out.println(b.hasAlternatingBits(n));
		
	}

}