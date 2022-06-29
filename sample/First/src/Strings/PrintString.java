package Strings;

import java.util.Scanner;

//program to print string char by char
public class PrintString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=null;
		System.out.println("enter the string");
		s=sc.next();
		for(int i=0;i<s.length();i++)
			System.out.print(s.charAt(i));
	

	}

}
