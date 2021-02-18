package Thread;

public class ExtendThread extends Thread{
	public void run()
	{
		for(int x=1;x<=10;x++)
		{
			System.out.println
			(Thread.currentThread().getName()+"The value of x is "+x);
			try
			{
			Thread.sleep(500);//Time is in milliseconds
			}
			catch(InterruptedException e)
			{
				System.out.println("Thread interrupted");
			}
		}
	}
	public static void main(String args[])
	{
		ExtendThread t1=new ExtendThread();
		t1.setName("FirstThread");
		t1.start();
		ExtendThread t2=new ExtendThread();
		t2.setName("Second Thread");
		t2.start();
	}

}

//Thread t1=new Thread();
//t1.start(); starting application as thread so internally it will
//call run method. in run method u are going to define business logic
//that needs to be started
