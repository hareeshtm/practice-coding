package practice;

public class StringRev {
public static void main(String[] args) {
	
	String str="Malayalam";
	char ch[]=str.toCharArray();
	
	for(int i=0;i<ch.length/2;i++)
	{
		char temp=ch[i];
		ch[i]=ch[ch.length-i-1];
		ch[ch.length-i-1]=temp;
	}
	
	String rev=String.valueOf(ch);
	System.out.println(rev);
}
}
