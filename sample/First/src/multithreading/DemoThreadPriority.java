package multithreading;

public class DemoThreadPriority {

	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread(()->
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Hi " + Thread.currentThread().getPriority());
				try{Thread.sleep(500);}catch(Exception e) {}
			}
		},"Thread Hi");
		Thread t2=new Thread(()->
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Hello "+ Thread.currentThread().getPriority());
				try{Thread.sleep(500);}catch(Exception e) {}
			}
		},"Thread Hello");
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		try {Thread.sleep(100);}catch (InterruptedException e) {}
		t2.start();
		
	}

}
