import java.util.Scanner;

/**
 * a C Program to reverse the digits of a given number.
 * @author HP
 *
 */
public class ReverseDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number,reverse=0,temp=0;
		System.out.println("Enter the number to be reversed");
		number=sc.nextInt();
		temp=number;
		while(temp!=0)
		{
			reverse=reverse*10+temp%10;
			temp=temp/10;
		}
		System.out.println("After Reversing "+number+" it is :"+reverse);
	}

}
