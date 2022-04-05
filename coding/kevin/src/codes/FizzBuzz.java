//Problem description: Write a program that outputs the string representation of numbers from 1 to n.
/*
 * But for multiples of three it should output �Fizz� instead of the number and for the multiples of five output �Buzz�.
 *  For numbers which are multiples of both three and five output �FizzBuzz�.
 */
package codes;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter n");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 && i%5==0)
				System.out.println("FizzBuzz");
			else if(i%3==0)
				System.out.println("Fizz");
			else if(i%5==0)
				System.out.println("Buzz");
			else 
				System.out.println(Integer.toString(i));
			
		}
		

	}

}
