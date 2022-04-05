package Arrays;

import java.util.Scanner;

public class ArraySample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,3};
		/*System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		System.out.println("The elements are");*/
		//for(int i=0;i<arr.length;i++)
			//System.out.print(arr[i]+" ");
		//int a[]= {1,2,3,4,5};
		//System.out.println(a[0]);
		//for each loop
		for(int i:arr)
			System.out.println(i);
		System.out.println(arr[4]);//exception
	}

}
