package collections.vector;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class VectorCreate {

	public static void main(String[] args) {
		//Method 1:
		
		Vector vec = new Vector();
		//It creates an empty Vector with the default initial capacity of 10.
		//t means the Vector will be re-sized when the 11th elements needs to be inserted into the Vector. 
		//Note: By default vector doubles its size.
		
		vec.add(7);
		vec.add("A");
		System.out.println(vec);
		
		//Method 2:
		//Syntax: Vector object= new Vector(int initialCapacity)
		
		Vector obj=new Vector(3);
		obj.addAll(vec);
		System.out.println(obj); 	
		
		//Method 3:
		//Vector object= new vector(int initialcapacity, capacityIncrement)	
		
		Vector v=new Vector(4,6);
		//Here we have provided two arguments. 
		//The initial capacity is 4 and capacityIncrement is 6
		//It means upon insertion of 5th element the size would be 10 (4+6) 
		
		//Other Examples
		
		Vector<String> vector=new Vector<String>(2);
		
		 /* Adding elements to a vector*/
		vector.addElement("Apple");
		vector.addElement("Orange");
		vector.addElement("Mango");
		vector.addElement("Fig");
		System.out.println(vector);
		
		/* check size and capacityIncrement*/
		System.out.println("Size : "+ vector.size());
		System.out.println("Default capacity increment is: "+ vector.capacity());
		
		vector.addElement("fruit1");
		vector.addElement("fruit2");
		vector.addElement("fruit3");
		/*size and capacityIncrement after two insertions*/
		System.out.println("Size after addition: "+vector.size());
	      System.out.println("Capacity after increment is: "+vector.capacity());
		
	      /*Display Vector elements*/
	      
	      Enumeration<String> en=vector.elements();
	      System.out.println("\nElements are:");
	      while(en.hasMoreElements())
	    	  System.out.print(en.nextElement() + " ");
	      
	      
	}

}
