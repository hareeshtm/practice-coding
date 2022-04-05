package codes;
/*
 * Problem description: Given a positive integer, output its complement number.
 *  The complement strategy is to flip the bits of its binary representation.

Note:
The given integer is guaranteed to fit within the range of a 32-bit signed integer.
You could assume no leading zero bit in the integerís binary representation.

Example 1:
Input: 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. 
So you need to output 2.

Example 2:
Input: 1
Output: 0
Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.
 */
public class NumberComplement {

	public int findComplement(int num)
	{
		int result=0;
		int power=1;
		while(num>0)
		{
			result+=(num%2^1)*power;
			power*=2;
			num=num>>1;
			//power=power<<1;
		}
		
		return result;
	}
	public static void main(String[] args) {
		
		int inp=2;
		NumberComplement n=new NumberComplement();
		System.out.println(n.findComplement(inp));

	}

}
