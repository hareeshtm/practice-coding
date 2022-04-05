package Patterns;
/*
1
2*2
3*3*3
4*4*4*4
5*5*5*5*5
4*4*4*4
3*3*3
2*2
1
 */
import java.util.Scanner;

public class NumberStar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=0;
		System.out.println("Enter the row count");
		row=sc.nextInt();
		for(int i=1,k=row/2;i<=row;i++)
		{
			if(i<=row/2+1)
			{
				for(int j=1;j<2*i;j++)
					if(j%2!=0)
						System.out.print(i);
					else
						System.out.print("*");
				System.out.println();
			}
			else
			{
				for(int j=i*2,c=1;j<2*row+1;j++,c++)
					if(c%2!=0)
						System.out.print(k);
					else
						System.out.print("*");
				System.out.println();
				k--;
			}
		}
	}

}
