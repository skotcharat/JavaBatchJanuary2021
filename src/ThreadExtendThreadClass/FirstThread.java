package ThreadExtendThreadClass;

public class FirstThread extends Thread {
	public void run()
	{
		for(int x=1;x<=10;x++)
		{
			System.out.println("Value of Thread is "+x);
			try
			{
			Thread.sleep(1000);
			}
			catch(InterruptedException ex)
			{
				System.out.println("Thread interrupted ");
			}
		}
	}
}
