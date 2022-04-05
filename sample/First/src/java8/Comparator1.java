package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

class Student1 {
	int rollno;
	String name;
	int age;

	Student1() {

	}

	public Student1(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}

class AgeComparator implements Comparator<Student1> {

	@Override
	public int compare(Student1 s1, Student1 s2) {
		if (s1.age > s2.age)
			return 1;
		else if (s1.age < s2.age)
			return -1;
		else
			return 0;
	}
}
class NameComparator implements Comparator<Student1> {

	@Override
	public int compare(Student1 s1, Student1 s2) {
		
		return s1.name.compareTo(s2.name);
	}

	@Override
	public String toString() {
		return "NameComparator [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}


public class Comparator1 {

	public static void main(String[] args) {
		ArrayList<Student1> al=new ArrayList<>(); 
		al.add(new Student1(101,"Vijay",23));  
		al.add(new Student1(106,"Ajay",27));  
		al.add(new Student1(105,"Jai",21));  
		
		System.out.println("Sorting by Name");  
		Collections.sort(al, new NameComparator());
		for(Student1 st:al)
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
		
		
		System.out.println("Sorting by age");  
		Collections.sort(al,new AgeComparator());  
		Iterator itr2=al.iterator();  
		while(itr2.hasNext()){  
		Student1 st2=(Student1)itr2.next();  
		System.out.println(st2.rollno+" "+st2.name+" "+st2.age); 		
		}  
		
System.out.println("---------------------HashSet");
		
		HashSet<Student1> al2=new HashSet<>(); 
		al2.add(new Student1(101,"Vijay",23));  
		al2.add(new Student1(106,"Ajay",27));  
		al2.add(new Student1(105,"Jai",21));  
		al2.stream().forEach(e->System.out.println(e.rollno +" "+e.name));
		
		al2.stream().sorted((e1,e2)->e1.name.compareTo(e2.name)).forEach(e->System.out.println(e.rollno +" "+e.name));
	}

}

