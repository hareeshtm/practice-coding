/*
 * Write a program to delete an element at desired position from an array.
 */
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[],ele=0,pos=1,indicate=1;
		System.out.println("Enter the number of elements");
		ele=sc.nextInt();
		arr=new int[ele];
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		while(indicate==1)
		{
			System.out.println("Enter position from which the element to be deleted (Pos>0)");
			pos=sc.nextInt();
			if(pos>ele||pos<=0)
				System.out.println("position should be less than or equal to array size");
			else
				indicate=0;
		}
		//Logic 1
/*		int i=pos-1;
		for(;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[i]='\0';
		int newArr[]=new int[ele-1];
		for(int j=0;j<ele-1;j++)
			newArr[j]=arr[j];
		System.out.println("After deleting");
		System.out.println(Arrays.toString(newArr));
*/		
		//Logic 2
		int newArray[]=new int[ele-1];
		for(int i=0,k=0;i<arr.length;i++)
		{
			if(i==pos-1)
				continue;
			newArray[k++]=arr[i];
		}
		System.out.println("After deleting");
		System.out.println(Arrays.toString(newArray));
		
	}

}
