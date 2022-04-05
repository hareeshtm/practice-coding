import java.util.Scanner;

/**
 *   Write a C program to find the given number is Perfect number or not?
       Note : Perfect number  means sum of it's divisers exept that num
        is equalent to the same number.

 * @author HP
 *
 */
public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0,sumOfDivisers=0;
		System.out.println("Enter the number");
		num=sc.nextInt();
		for(int n=1;n<num;n++)
		{
			if(num%n==0)
				sumOfDivisers=sumOfDivisers+n;
		}
		if(num==sumOfDivisers)
			System.out.println(num+" is a perfect number");
		else
			System.out.println(num+" is not a perfect number");
	}
}
