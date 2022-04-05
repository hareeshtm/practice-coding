import java.util.Scanner;

/**
 * Write a program to print fibonacci series between 0 to 50.
 * @author HP
 *
 */
public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=0,num2=1,next=0;
		while(num1<=1000)
		{
			System.out.print(num1+" ");
			next=num1+num2;
			num1=num2;
			num2=next;
		}
		
	}

}
