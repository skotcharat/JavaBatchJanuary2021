package ThreadExtendsThreadSumNumberJoinMethod;

public class SecondThread extends Thread {
	
	public void run()
	
	{
		Calculator cal = new Calculator();
		cal.sub();
		
	}
	public static void main(String args[])
	{
		FirstThread t1 = new FirstThread();
		t1.setName("FirstThread");
		t1.start();
		SecondThread t2 = new SecondThread();
		t2.setName("Second Thread");
		t2.start();
	}
}


