package java8;
//without parameter

@FunctionalInterface
interface MyFuncInterface
{
	public String sayHello();
}
public class Lambda1 {

	public static void main(String[] args) {
	
		MyFuncInterface f=() -> {return "Sugano mone";};
		
		System.out.println(f.sayHello());

}
}
