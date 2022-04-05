package multithreading;

public class ThreadDemoLambda {

	public static void main(String[] args) {
		
		Thread t1=new Thread(()->
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Hi");
				try{Thread.sleep(500);}catch(Exception e) {}
			}
		});
		Thread t2=new Thread(()->
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Hello");
				try{Thread.sleep(500);}catch(Exception e) {}
			}
		});
		t1.start();
		try {Thread.sleep(100);}catch (InterruptedException e) {}
		t2.start();
	}

}
