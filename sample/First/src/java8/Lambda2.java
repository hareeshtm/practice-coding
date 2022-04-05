package java8;
//with single parameter
interface MyFuncInterface2
{
	public int inCrementByfive(int a);
}
public class Lambda2 {

	public static void main(String[] args) {
	MyFuncInterface2 f2=(x) ->  x + 5;
	
	System.out.println(f2.inCrementByfive(5));
	
}
}
