package collections.hashtable;

import java.util.EnumSet;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTableSample {

	public static void main(String[] args) {
		Hashtable<String,String> hashtable=new Hashtable<>();
		hashtable.put("Key1","Chaitanya");
		   hashtable.put("Key2","Ajeet");
		   hashtable.put("Key3","Peter");
		   hashtable.put("Key4","Ricky");
		   hashtable.put("Key5","Mona");
		   
		   Enumeration<String> en=hashtable.keys();
		   while(en.hasMoreElements())
		   {
			   //hashtable.put("Key6", "Hareesh");//not fail-fast
			   String key=en.nextElement();
			  System.out.println(key + "  "+ hashtable.get(key));	 
			   
		   }
				
				

	}

}
