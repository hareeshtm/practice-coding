/*
1 
1 0 
1 0 1 
1 0 1 0 
1 0 1 0 1 
1 0 1 0 1 0 
 */
package Patterns;

import java.util.Scanner;

public class OneZeroPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=0;
		System.out.println("Enter the row count");
		row=sc.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j%2==0)
					System.out.print(0+" ");
				else
					System.out.print(1+" ");
			}
			System.out.println();
		}
	}

}