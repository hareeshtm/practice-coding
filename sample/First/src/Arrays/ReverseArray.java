//Write a C program to reverse  the elements of a given array.
package Arrays;

import java.util.Scanner;

public class ReverseArray {
	static int[] reverseFunc(int arr[])
	{
		int temp=0;
		for(int i=0,j=arr.length-1;i<j;i++,j--)
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;	
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[],elements=0;
		System.out.println("Enter the number of elements");
		elements=sc.nextInt();
		arr=new int[elements];
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		 arr=reverseFunc(arr);
		System.out.println("After reversing");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");

	}

}
