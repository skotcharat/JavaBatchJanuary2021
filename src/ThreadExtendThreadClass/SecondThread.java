package ThreadExtendThreadClass;

public class SecondThread extends Thread{
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
		f1.start();
		s.start();
	}
}