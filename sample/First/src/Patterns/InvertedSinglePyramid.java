package Patterns;

import java.util.Scanner;

public class InvertedSinglePyramid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=0;
		System.out.println("Enter the row count");
		row=sc.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<i;j++)
				System.out.print(" ");
			for(int j=row;j>=i;j--)
				System.out.print("* ");
			System.out.println();
		}

	}

}
