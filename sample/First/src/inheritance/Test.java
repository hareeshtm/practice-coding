package inheritance;

class A
{
	public void test()
	{
		System.out.println("in a");
	}
}
class B extends A
{
	public void test(String s)
	{
		System.out.println("in B "+ s);
	}
}
public class Test {

	public static void main(String[] args) {
		
		B b= new B();
		b.test();
		b.test("hareesh");
	}

}
