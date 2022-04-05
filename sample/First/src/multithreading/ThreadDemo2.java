package multithreading;
class Hi2 implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hi");
			try{Thread.sleep(500);}catch(Exception e) {}
		}
	}
}
class Hello2 implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello");
			try{Thread.sleep(500);}catch(Exception e) {}
		}
	}
}
public class ThreadDemo2 {

	public static void main(String[] args) {
	Runnable obj1=new Hi2();
	Runnable obj2=new Hello2();
	Thread t1=new Thread(obj1);
	Thread t2=new Thread(obj2);
	t1.start();
	try {Thread.sleep(100);}catch (InterruptedException e) {}
	t2.start();
	}

}