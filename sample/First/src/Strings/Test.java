package Strings;

public class Test {

	public static void main(String[] args) {
		String s1="welcome";
		String s2="welcome";
		System.out.println(s1.equals(s2));
		System.out.println(s1.concat(s2));
		System.out.println(s1);
		String s3=s2.intern();
		System.out.println(s3);
		System.out.println(s1==s3);
	
		
		

	}

}
