import java.util.Scanner;

/**
 * Swapping 2 numbers
 * @author HP
 *
 */
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1=0,num2=0,temp=0;
		System.out.println("Enter the numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		//temp=num1;num1=num2;num2=temp;
		//num2=num1+num2-(num1=num2);
		num1=num1^num2;
		num2=num1^num2;
		num1=num1^num2;
		System.out.println("After Swapping num1="+num1+" and num2="+num2);
		
	}

}
