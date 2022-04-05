/**
 * Write a  program to input 10 numbers through the keyboard and find the number
of prime numbers count, store  them into a seperate array and display it.

 */
package Arrays;

import java.util.Scanner;

public class PrimeNumberCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[],c=0,prime[],ele=0,count=0;
		System.out.println("Enter the number of elements");
		ele=sc.nextInt();
		arr=new int[ele];
		prime=new int[ele];
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		for(int i=0,j=0,k=0;i<arr.length;i++)
		{
			for(j=2;j<arr[i];j++)
			{
				if(arr[i]%j==0)
					break;
			}
			if(arr[i]==j)
			{
				count++;
				prime[k++]=arr[i];//storing into destination array
			}
		}
		
		if(count!=0)
		{
			System.out.println("Number of Prime numbers: "+count);
			System.out.println("The elements are");
			for(int i=0;i<prime.length;i++)
				System.out.print(prime[i]+" ");		}
		else
			System.out.println("No prime numbers in the array");

	}

}
