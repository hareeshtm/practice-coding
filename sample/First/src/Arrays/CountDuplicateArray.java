package Arrays;

import java.util.Scanner;

public class CountDuplicateArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[],ele=0,temp[],k=0,c=1;
		System.out.println("Enter the number of elements");
		ele=sc.nextInt();
		arr=new int[ele];
		temp=new int[ele];
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			c=1;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					c++;
				}
				if(c!=1)
				{
					int flag=0;
					for(int m=0;m<temp.length;m++)
					{
						if(temp[m]!=arr[i])
							flag=1;
						
					}
					if(flag==1)
					{
						temp[k++]=arr[i];
						System.out.println(arr[i] +" -- "+c+" times");
					}
				}
			}
		}
	}
}
