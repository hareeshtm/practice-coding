package Strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=null;
		System.out.println("enter the string");
		s=sc.next();
		char temp=0;
		/*char ch[]=s.toCharArray();
		for(int i=0,j=ch.length-1;i<j;i++,j--)
		{
			temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
		}
		
		String rev=String.valueOf(ch);
		System.out.println(rev);*/
		
		/*String dest=new String();
		for(int j=s.length()-1;j>=0;j--)
			dest=dest+s.charAt(j);
		System.out.println(dest);*/
		
		String dest="";
		for(int i=s.length()-1;i>=0;i--)
			dest=dest.concat(String.valueOf(s.charAt(i)));
		System.out.println(dest);
		


	}

}