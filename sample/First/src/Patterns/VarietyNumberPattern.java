package Patterns;

import java.util.Scanner;

public class VarietyNumberPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=0;
		System.out.println("Enter the row count");
		row=sc.nextInt();
		for(int i=1;i<=row;i++)
		{
			System.out.print(i+" ");
			for(int j=2,c=4,k=4+i;j<=i;j++)
			{
				System.out.print(k+" ");
				--c;
				k=k+c;
			}
				System.out.println();
		}
	}

}
