import java.util.Scanner;

/**
 * Write a  program to reverse the bits of a given number.
 * @author HP
 *
 */
public class BitReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number,higherBit=0,lowerBit=0;
		System.out.println("enter the number");
		number=sc.nextInt();
		System.out.println("before reversing the number is");
		for(int i=31;i>=0;i--)
			System.out.print((number>>i&1)+" ");
		System.out.println();
		for(int msb=31,lsb=0;msb>lsb;msb--,lsb++)
		{
			higherBit=number>>msb&1;
			lowerBit=number>>lsb&1;
			if(higherBit!=lowerBit)
			{
				number=number^1<<msb;
				number=number^1<<lsb;
			}
		}
		
		System.out.println("after reversing the number is");
		for(int i=31;i>=0;i--)
			System.out.print((number>>i&1)+" ");
		System.out.println();

	}

}
