package CollectionQueue;

import java.util.*;
public class QueueDemo {
	private Queue<String> queue;
	
	public QueueDemo()
	{
		queue=new LinkedList<String>();
		queue.add("first");
		queue.add("second");
		queue.add("third");
		queue.offer("forth");//add method will give exception if u are trying to add beyond limit in queue.
		
		//offer method will not give exception 
		
	}
	public void display()
	{
		System.out.println("First value "+queue.element());//method will display value without removing it
		
		System.out.println("Second value"+queue.peek());//will not give exception even if there is no elements
		System.out.println("Third value"+queue.remove());//will display and remove
		System.out.println("forth value"+queue.poll());//will not give exception even if u r trying to remove element from empty list
		queue.remove();
		queue.remove();
		queue.remove();
	}
	/*public void display()
	{
		for(String s:queue)
		{
			System.out.println("Values are "+s);
		}
	}*/
	public static void main(String args[])
	{
		QueueDemo q1Demo = new QueueDemo();
		q1Demo.display();
	}


}