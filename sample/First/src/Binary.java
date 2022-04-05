import java.util.Scanner;

/**
 * Program to find the binary of a number
 * @author HP
 *
 */
public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number=0,bitPos=31;
		System.out.println("enter the number(Integer range only)");
		number=sc.nextInt();
		System.out.println("In binary");
		for(;bitPos>=0;bitPos--)
		{
			System.out.print(number>>bitPos&1);
		}
		System.out.println();
	}

}
