package Strings;


public class ReverseWords {

	public void reverseWordInMyString(String str) {

		System.out.println("before reverse-------");
		System.out.println(str);
		String words[]=str.split(" ");
//		for(String s:words)
//			System.out.println(s);
		String rev="";
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			for(int j=word.length()-1;j>=0;j--)
			{
				rev=rev+word.charAt(j);
			}
			rev=rev+" ";
		}
		System.out.println("After reverse--------");
		
		System.out.println(rev);
				
	}

	public static void main(String[] args) {
		ReverseWords obj=new ReverseWords();
		obj.reverseWordInMyString("Welcome to BeginnersBook");
		//obj.reverseWordInMyString("This is an easy Java Program");

	}
}
