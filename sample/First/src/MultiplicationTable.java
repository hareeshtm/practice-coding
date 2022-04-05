import java.util.Scanner;

/**
 * Write a  program to print multiplication tables from 10 to 20.
 * @author HP
 *
 */
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int tableIndex=10,iteration;
		for(;tableIndex<=20;tableIndex++)
		{
			System.out.println("Multiplication table of "+tableIndex);
			System.out.println("__________________________");
			for(iteration=1;iteration<=10;iteration++)
			{
				System.out.println(tableIndex+"*"+iteration+"="+tableIndex*iteration);
			}
		}

	}

}
