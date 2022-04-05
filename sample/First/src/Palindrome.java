import java.util.Scanner;

/**
 * Write a program to print palindrome numbers between 1 to 1000. (palindrome
 * numbers means the numbers which are equal to its reverse. Ex :
 * 11,22,33,44,.........999. )
 * 
 * 
 * @author Hareesh
 *
 */
public class Palindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int upperLimit=0;
		System.out.println("Enter the upper limt");
		upperLimit=sc.nextInt();
		for (int number=1;number<=upperLimit;number++)
		{
			int reverse=0,temp=number;
			while(temp!=0)
			{
				reverse=reverse*10+temp%10;
				temp=temp/10;
			}
			if(reverse==number)
				System.out.print(number+",");
		}
	}

}
