package Strings;

class Singleton
{
	private static Singleton singleInstance=null;
	public  void hai()
	{
		System.out.println("Hai");
	}
	
	private Singleton()
	{
		
	}
	public static Singleton getInstance()
	{
		if(singleInstance==null)
			singleInstance=new Singleton();
		return singleInstance;
	}
}
public class SingletonClass {

	public static void main(String[] args) {
		
		Singleton s=Singleton.getInstance();
		s.hai();
		
	}

}
