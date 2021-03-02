package ThreadExtendsThreadSumNumberJoinMethod;

public class FirstThread extends Thread{
	
	
	public void run()
	
	{
		Calculator cal = new Calculator();
		cal.add();
		
	}

}


