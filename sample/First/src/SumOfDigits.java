import java.util.Scanner;

/**
 * Write a C Program to Find the sum of digits of a given number.
 * @author HP
 *
 */
public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int number,temp=0,sum=0;
		System.out.println("Enter the number");
		number=sc.nextInt();
		temp=number;
		while(temp!=0)
		{
			sum=sum+(temp%10);
			temp=temp/10;
		}
		System.out.println("The sum is :"+sum);
		sc.close();
	}

}
