package codes;

interface Test
{
	public void run();
	public static void stamethod()
	{
		System.out.println("Inside static method of inteface");
	}
	default void check()
	{
		System.out.println("inside default check method of interface");
	}
	
}
class Hareesh implements Test
{

	@Override
	public void run() {
		System.out.println("Hareesh is running");
	}
	public void check()
	{
		System.out.println("inside public check method of class");
	}
	public static void stamethod()
	{
		System.out.println("Inside static method of class");
	}
	
}

public class DefaultMethodInterfaceCheck {

	public static void main(String[] args) {
	
		Test test=new Hareesh();
		test.run();
		test.check();
		Test.stamethod();
		Hareesh.stamethod();
	}

}
