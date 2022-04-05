/**
 *  program which deletes the duplicate elements of an array.
 */
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteDuplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[],ele=0,temp[],result[],resultantArraySize=0,totalNumberofDuplicates=0;
		System.out.println("Enter the number of elements");
		ele=sc.nextInt();
		arr=new int[ele];
		temp=new int[ele];
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		for(int i=0,k=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<temp.length;j++)
			{
				if(temp[j]==arr[i])
					count++;
			}
			if(count==0)
				temp[k++]=arr[i];
			else
				totalNumberofDuplicates++;
		}
		resultantArraySize=arr.length-totalNumberofDuplicates;
		result=new int[resultantArraySize];
		for(int i=0;i<result.length;i++)
			result[i]=temp[i];
	System.out.println(Arrays.toString(result));
	}

}
