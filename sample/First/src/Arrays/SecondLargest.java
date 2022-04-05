/**
 * Write a  program to find out second largest and second smallest elements of an
Un-sorted array without using any Sorting Technique.

 */
package Arrays;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[],large=0,secondLarge=0,ele=0,small=0,secondSmall=0;
		System.out.println("Enter the number of elements");
		ele=sc.nextInt();
		arr=new int[ele];
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		if(arr[0]>arr[1])
		{
			large=arr[0];
			secondLarge=arr[1];
			small=arr[1];
			secondSmall=arr[0];
		}
		else
		{
			large=arr[1];
			secondLarge=arr[0];
			small=arr[0];
			secondSmall=arr[1];
		}
		for(int i=2;i<arr.length;i++)
		{
			if(arr[i]>large)
			{
				secondLarge=large;
				large=arr[i];
			}
			else
			{
				if(arr[i]>secondLarge)
					secondLarge=arr[i];
			}
			if(arr[i]<small)
			{
				secondSmall=small;
				small=arr[i];
			}
			else
			{
				if(arr[i]<secondSmall)
					secondSmall=arr[i];
			}
		}
		System.out.println("Largest :"+large+"  Smallest :"+small);
		System.out.println("Second Largest :"+secondLarge+"  Second Smallest :"+secondSmall);
	}

}
