package multithreading;

public class DaemonThread {

	public static void main(String[] args) {
		
		Thread t1=new Thread(
				()->
				{
					for(int i=0;i<1000;i++)
					{
					System.out.println("Iam executedf by a child thread "+ i);
					System.out.println("Iam demon or not "+ Thread.currentThread().isDaemon());
					System.out.println("My name is "+ Thread.currentThread().getName());
					}
				});
		
		t1.setDaemon(true);
		t1.start();
		//t1.setDaemon(false);//Illegal thread state exception
		for(int i=0;i<10;i++)
		{
			System.out.println("Iam executed by a main thread "+ i);
		}

	}

}
