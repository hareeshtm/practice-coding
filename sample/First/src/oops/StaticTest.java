package oops;

class Abc
{
	public static void test()
	{
		System.out.println("Tested");
	}
}
class Def extends Abc
{
		public static void test()
		{
			System.out.println("child");
		}
}
public class StaticTest {
public static void main(String[] args) {
	
	Def.test();
	
}
}