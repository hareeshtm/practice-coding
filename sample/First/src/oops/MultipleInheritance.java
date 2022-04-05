package oops;

interface Printable
{
	void show();
}
interface Showable
{
	void show();
}
class A implements Printable,Showable
{

	@Override
	public void show() {
		System.out.println("showing");
		
	}
	
}

public class MultipleInheritance {

	public static void main(String[] args) {
		
		Showable a= new A();
		a.show();

	}

}
