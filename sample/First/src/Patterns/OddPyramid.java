package Patterns;

import java.util.Scanner;

public class OddPyramid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=0;
		System.out.println("Enter the row count");
		row=sc.nextInt();
		for(int i=1;i<=row;i++) {
			if(i<=row/2)
			{
				for(int j=i;j<=row/2;j++)
					System.out.print(" ");
				for(int j=1;j<2*i;j++)
					System.out.print("*");
				System.out.println();
			}
			else
			{
				for(int j=row/2;j<i-1;j++)
					System.out.print(" ");
				for(int j=i*2;j<2*row+1;j++)
					System.out.print("*");
				System.out.println();
			}
		}

	}

}
