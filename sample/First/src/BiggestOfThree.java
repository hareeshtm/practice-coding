import java.util.Scanner;

/**
 * Write a C program to find out the biggest number of  
 * three variables using if-else ladder and terinary operator.
        
 * @author HP
 *
 */
public class BiggestOfThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1=0,num2=0,num3=0;
		System.out.println("Enter the three numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		//if else ladder
/*		if(num1>num2)
			if(num1>num3)
				System.out.println(num1+" is biggest");
			else
				System.out.println(num3+" is biggest");
		else
			if(num2>num3)
				System.out.println(num2+" is biggest");
			else
				System.out.println(num3+" is biggest");
*/
		//ternary operator
		System.out.print("Biggest is ");
		System.out.println(num1>num2?(num1>num3?num1:num3):(num2>num3?num2:num3));
	}

}
