import java.util.Scanner;

/**
 * Write a C Program to Find the factorial of a given number. User has to take the i/p at
       runtime.

 * @author HP
 *
 */
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int fact=1,number;
		System.out.println("enter the number");
		number=sc.nextInt();
		if(number==0)
		{
			System.out.println("Factorial of 0 is 1");
			return;
		}
		int cpyNumber=number;
		while(cpyNumber>0)
		{
			fact=fact*cpyNumber;
			cpyNumber--;
		}
		System.out.println("Factorial of "+number+" is "+fact );
	}

}
