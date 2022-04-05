/*
1 
2 4 
1 3 5 
2 4 6 8 
1 3 5 7 9 
2 4 6 8 10 12
 */
package Patterns;

import java.util.Scanner;

public class EvenOddSeriesPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=0;
		System.out.println("Enter the row count");
		row=sc.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=1,odd=1,even=2;j<=i;j++)
			{
				if(i%2!=0)
				{
					System.out.print(odd+" ");
					odd+=2;
				}
				else
				{
					System.out.print(even+" ");
					even+=2;
				}
			}
			System.out.println();
			
		}
	}

}
