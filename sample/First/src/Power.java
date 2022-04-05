import java.util.Scanner;

/**
 * Write a program to find out power of given number without using pow()
 * function
 * 
 * @author Hareesh
 *
 */
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = 0, power = 0;
		long result = 1;
		float decimalResult = 0;
		System.out.println("enter the number and power");
		number = sc.nextInt();
		power = sc.nextInt();
		if (power >= 0) {
			for (int i = 0; i < power; i++)
				result = result * number;
			System.out.println(number + "^" + power + "=" + result);
		} else {
			for (int i = power; i < 0; i++)
				result = result * number;
			decimalResult =  (1 / (float)result);
			System.out.println(number + "^" + power + "=" + decimalResult);
		}

	}

}
