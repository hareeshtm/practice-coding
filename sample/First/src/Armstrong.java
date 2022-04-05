/**
 * Write a  program to print ArmStrong Numbers between 1 to 500.
 */
import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number=0;
		for(;number<=500;number++)
		{
			int sum=0,temp=number;
			while(temp!=0)
			{
				int mod=temp%10;
				sum=sum+(mod*mod*mod);
				temp=temp/10;
			}
			if(sum==number)
				System.out.println(number);
		}
	}

}
