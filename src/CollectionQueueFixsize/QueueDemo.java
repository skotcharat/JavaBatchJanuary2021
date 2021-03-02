package CollectionQueueFixsize;
import java.util.concurrent.ArrayBlockingQueue;
// U have to create fixed size queue and add values in that queue. try to add more elements beyound the size

public class QueueDemo {

    ArrayBlockingQueue<String> names = new ArrayBlockingQueue<String>(2); 
    
	public QueueDemo() {
			
	}
	
	public void accept() {
		 names.add("Aman"); 
		 names.add("Siddhant"); 
		 names.offer("ying");//add method will give exception if u are trying to add beyond limit in queue.
		 //offer method will not give exception
	}
	
	public void display() {
		System.out.println("After addding Queue size = "+ names.size());
		
		for(String s : names)
		{
			System.out.println("Values are "+s);
		}
	}
	
	public static void main(String args[]) {
		QueueDemo q = new QueueDemo();
		q.accept();
		q.display();
		
	}


}