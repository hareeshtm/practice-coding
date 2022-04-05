package Strings;

public class ReversingWords {

	public static void main(String[] args) {

		String text= new String("Hello, My name is Sachin");  
	        /* Splits the sentence by the delimeter passed as an argument */  
	        String[] sentences = text.split("");  
	       // System.out.println(Arrays.toString(sentences));  
	        for(String s: sentences)
	        	System.out.println(s);
	        
	        String s1="Java is a programming language. Java is a platform. Java is an Island.";      
	        String replaceString=s1.replace("is","was");//replaces all occurrences of "Java" to "Kava"      
	        System.out.println(replaceString);    
	        char ch[]=s1.toCharArray();
	        for(int i=0,j=ch.length-1;i<j;i++,j--)
	        {
	        	char t=ch[i];
	        	ch[i]=ch[j];
	        	ch[j]=t;
	        }
	        String rev=String.valueOf(ch);
	        System.out.println(rev);

	        String str="Hai";
	         String s="Hai";
	         System.out.println(str.compareTo(s));
	}

}
