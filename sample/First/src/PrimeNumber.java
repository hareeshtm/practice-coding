import java.util.Scanner;

/**
 * program to print prime numbers
 * @author HP
 *
 */
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0,limit=0;
		System.out.println("enter the limit");
		limit=sc.nextInt();
		for(int i=1;i<=limit;i++)
		{
			count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					count++;
			}
			if(count==2)
				System.out.print(i+" ");
		}
	}
}
