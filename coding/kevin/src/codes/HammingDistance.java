package codes;
/*
 * Problem description: The Hamming distance between two integers is the number 
 * of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Example:
Input: x = 1, y = 4
Output: 2
Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
 */
public class HammingDistance {

	public int hammingDistance(int x,int y)
	{
		int distance=0;
		while(x>0 || y>0)
		{
			distance+=(x%2)^(y%2);
			x=x>>1;
			y=y>>1;
		}
		
		return distance;
	}
	public static void main(String[] args) {
	
		HammingDistance d=new HammingDistance();
		int x=7,y=4;
		System.out.println(d.hammingDistance(x, y));
	}

}
