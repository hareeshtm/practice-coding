package oops;
 class ParentClass {

	public void disp()
	{
		System.out.println("Parent ClasS");
	}
}

 class ChildClass extends ParentClass{

	public void disp()
	{
		System.out.println("Child Class");
	}
}

public class MainClass {

	public static void main(String[] args) {
	
		ChildClass ch=new ChildClass();
		ch.disp();

	}

}
