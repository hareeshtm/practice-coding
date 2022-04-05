import java.util.Scanner;

/**
 * To cehck a nuber is power of 2
 * @author HP
 *
 */
public class PowerOfTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0;
		System.out.println("Enter the number");
		num=sc.nextInt();
		/*if((num&num-1)==0)
			System.out.println("power of 2");
		else
			System.out.println("not power of 2");
		*/
		int count=0;
		for(int pos=31;pos>=0;pos--)
			if((num>>pos&1)==1)
				count++;
		if(count==1)
			System.out.println("power of 2");
		else 
			System.out.println("not power of 2");
	}
}
