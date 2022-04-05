package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//sorting based on age
class Student implements Comparable<Student>
{
	int rollno;  
	String name;  
	int age;  
	Student()
	{
		
	}
	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Student student) {
		
		if(age==student.age)
		return 0;
		else if(age>student.age)
			return 1;
		else
			return -1;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
public class Comparable1 {

	public static void main(String[] args) {
		
		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(new Student(101,"Vijay",23));
		al.add(new Student(106,"Ajay",27));  
		al.add(new Student(105,"Jai",21));  
		al.stream().sorted((e1,e2)->e1.name.compareTo(e2.name)).forEach(e->System.out.println(e.name));
		al.stream().sorted((e1,e2)->Integer.compare(e1.age, e2.age)).forEach(e->System.out.println(e.age));
		Collections.sort(al);
	for(Student st:al)
		System.out.println(st.rollno+" "+st.name+" "+st.age); 
		
	}

}
