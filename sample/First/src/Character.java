import java.util.Scanner;

/**
 * Scan a character display character and its ascii value only if its lower
 * @author HP
 *
 */
public class Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		ch=sc.next().charAt(0);
		if(ch>=97&&ch<=122) {
			System.out.println(ch);
		//if letter is small then converting it to capital
			int upper=ch-32;
			ch=(char)upper;
			System.out.println("upper case is "+ch);
			//Another way of changing case is bitwise operation.
			int chara=ch;
			chara=chara^32;
			ch=(char)chara;
			System.out.println("lower case is "+ch);
			
		}
		
	}

}
