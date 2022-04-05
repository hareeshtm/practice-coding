package java8;

 interface DiamondProblemInterface1
{
	default void m1()
	{
		System.out.println("DiamondProblemInterface1");
	}
	public static void test()
	{
		System.out.println("static method");
	}
}
 interface DiamondProblemInterface2
{
	default void m1()
	{
		System.out.println("DiamondProblemInterface2");
	}
}
public class DiamondProblemClass implements DiamondProblemInterface1,DiamondProblemInterface2{

	public static void main(String[] args) {

		DiamondProblemClass d1=new DiamondProblemClass();
		d1.m1();
		DiamondProblemInterface1.test();
	}

	@Override
	public void m1() {
		System.out.println("HiHI");
		DiamondProblemInterface1.super.m1();
	}
	public static void test()
	{
		System.out.println("static method in child");
	}
	

}