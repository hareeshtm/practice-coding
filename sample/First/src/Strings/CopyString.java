package Strings;

import java.util.Scanner;

//copy source string into destination string
public class CopyString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String source=null,dest=null;
		System.out.println("enter the source string");
		source=sc.next();
		//dest=new String(source);
		dest=source;
		System.out.println(dest);
			

	}

}
