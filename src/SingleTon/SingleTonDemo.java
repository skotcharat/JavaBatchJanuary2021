package SingleTon;

public class SingleTonDemo {
	private static SingleTonDemo sobj;
	
	// make constructor private call singleton prevent not access by other class
	private SingleTonDemo()
	{
		
	}
	public static  SingleTonDemo getSingleTonObj()
	{
		sobj=new SingleTonDemo();
		return sobj;
	}
	public void display()
	{
		System.out.println("calling display method");
	}
	public void add(int x,int y)
	{
		System.out.println("Value of x and y is "+x+"  "+y);
	}
	
	public static void main(String args[])
	{
		SingleTonDemo s=SingleTonDemo.getSingleTonObj();
		s.display();
		s.add(40, 89);
		SingleTonDemo s1=SingleTonDemo.getSingleTonObj();
		s1.add(70, 80);
		s1.display();
	}

}
