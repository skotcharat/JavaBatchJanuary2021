package ThreadImplementingRunnable;

public class SecondThread implements Runnable{
	public void run()
	{
		for(int x=10;x>=1;x--)
		{
			System.out.println("Value of thread is "+x);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String arg[])
	{
		FirstThread f1=new FirstThread();
		SecondThread s=new SecondThread();
		Thread t1=new Thread(f1);//to crate object object pass object 
		//of class which is implementing Runnable
		
		Thread t2=new Thread(s);
		t1.start();
		t2.start();
		
		
	}

}