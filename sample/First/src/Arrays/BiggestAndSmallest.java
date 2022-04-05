/**
 * Write a C program to input 10 numbers through the keyboard into an array and find the 
biggest and smallest number in an Unsorted array without using any Sorting Technique.

 */
package Arrays;

import java.util.Scanner;

public class BiggestAndSmallest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[],big=0,small=0,ele=0;
		System.out.println("Enter the number of elements");
		ele=sc.nextInt();
		arr=new int[ele];
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		big=small=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>big)
				big=arr[i];
			if(arr[i]<small)
				small=arr[i];
		}
		System.out.println("Biggest: "+big+"  Smallest: "+small);
	}

}
