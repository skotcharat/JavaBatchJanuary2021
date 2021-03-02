package ThreadExtendsThreadSumNumberJoinMethod;

public class MainDemoStartJoin {
	public static void main(String args[])
	{
		FirstThread f=new FirstThread();
		SecondThread s=new SecondThread();
		
		f.start();
		
		try {
			f.join();//it will put any other executing thread on hold and will complete
			//the task of first thread.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		s.start();
		
		try {
			s.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}

//join method will put any other thread which is executing on hold and will execute
//current thread.
