

import java.util.Scanner;

public class PowerofTwo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter num");
		n=sc.nextInt();
		
		int i=1;
		while(i<n)
			i=i*2;
		if(i==n)
			System.out.println("power of 2");
		else System.out.println("Not power of 2");
		

	}

}
