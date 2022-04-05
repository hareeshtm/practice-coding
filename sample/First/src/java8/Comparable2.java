package java8;

import java.util.ArrayList;
import java.util.Collections;

class Author implements Comparable<Author> {

	String firstName;
	String lastName;
	String bookName;

	public Author(String firstName, String lastName, String bookName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.bookName = bookName;
	}

	public Author() {

	}

	@Override
	public int compareTo(Author author) {

		int last= lastName.compareTo(author.lastName);
		
	if(last==0)
	{
		return firstName.compareTo(author.firstName);
	}
	
	return last;
	}

}

public class Comparable2 {

	public static void main(String[] args) {
		ArrayList<Author> al=new ArrayList<Author>(); 
		 al.add(new Author("Henry","Miller", "Tropic of Cancer"));  
	      al.add(new Author("Nalo","Hopkinson", "Brown Girl in the Ring"));
	      al.add(new Author("Frank","Miller", "300"));
	      al.add(new Author("Deborah","Hopkinson", "Sky Boys"));
	      al.add(new Author("George R. R.","Martin", "Song of Ice and Fire"));
	      Collections.sort(al);
	      for(Author str:al){  
	    	  System.out.println(str.firstName+" "+
	          str.lastName+" "+"Book: "+str.bookName);  
	      }
	}

}
