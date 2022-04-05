package Strings;

import java.util.Scanner;

public class Eof {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=null;
		int c=0;
		while(sc.hasNext())
		{
			s=sc.nextLine();
			System.out.println(++c+" "+s);
		}
		

	}

}
