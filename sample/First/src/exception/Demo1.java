package exception;

class Dog
{
	public String dogName="Mikku";
}
public class Demo1 {

	public static void main(String[] args) {
	try
	{
		Dog d=null;
		System.out.println(d.dogName);
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
		Dog d=new Dog();
		System.out.println(d.dogName);
	}
	
	
	finally
	{
		System.out.println("finally block is executed");
	}
		
	}

}
