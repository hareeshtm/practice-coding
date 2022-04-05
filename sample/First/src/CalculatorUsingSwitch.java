import java.util.Scanner;

/**
 * Write a C program to implement a Calculator using switch.
 * @author HP
 *
 */
public class CalculatorUsingSwitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char operation;
		int num1,num2,result=0;
		System.out.println("enter the numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println("Enter the desired operation from the keyboard ('+','-','*','/')");
		operation=sc.next().charAt(0);
		switch(operation)
		{
			case '+':
				result=num1+num2;
				break;
			case '-':
				result=num1-num2;
				break;
			case '*':
				result=num1*num2;
				break;
			case '/':
				if(num2!=0)
					result=num1/num2;
				else
				{
					System.err.println("cannot divide by zero");
					return;
				}
				break;
			default:
				System.out.println("Invalid Operation");
				return;
		}
		System.out.println(result);		
	}

}
