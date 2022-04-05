import java.util.Scanner;

/**
 * Program to check in a given number, given bit position is set or clear
 * @author HP
 *
 */
public class Bitwise {

	public static void main(String[] args) {
		
		int num=0,pos=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		while(true)
		{
			System.out.println("Enter the position");
			pos=sc.nextInt();
			if(pos>=0)
				break;
			else
				System.out.println("negative numbers as position is not allowed");
		}
		/*if((num&1<<pos)>0)
			System.out.println("The bit is set");
		else
			System.out.println("The bit is clear");*/
		if((num>>pos&1)==1)
			System.out.println("The bit is set");
		else
			System.out.println("the bit is clear");
		
	}
}
