/**
 * Write a C program to find the duplicate elements of a given array and find the count of
duplicated elements

 */
package Arrays;

import java.util.Scanner;

public class CountDuplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[],ele=0,temp[],k=0;
		System.out.println("Enter the number of elements");
		ele=sc.nextInt();
		arr=new int[ele];
		temp=new int[ele];
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<temp.length;j++)
			{
				if(temp[j]==arr[i])
					count++;
			}
			if(count==0)
				temp[k++]=arr[i];//temp contains the elements without duplicate
		}
		for(int i=0;i<k;i++)
		{
			int c=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]==temp[i])
					c++;
			}
			System.out.println(temp[i]+" -- "+c+" times");
		}
	}

}
