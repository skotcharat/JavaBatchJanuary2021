package CollectionArrayList;
import java.util.*;

public class ListDemo {
	private List<String> list1;
	private List<String> list2;
	
	public ListDemo()
	{
		
	}
	
	public void addData() {
		list1=new ArrayList<String>();	
		list2 = new ArrayList<String>();  
		
		list1.add("hi");
		list1.add("hello");
		
		list2.add("see");
		list2.add("nice");
		
		list2.addAll(list1);
		System.out.println("list1 " + list1);
		System.out.println("list2 " + list2);
	}
	
		public void deleteData()
		{
			
			list1.removeAll(list1);
			System.out.println("list1 " + list1);
			System.out.println("list2 " + list2);
			
					
		}
		public void contain() {
			System.out.println(list2.containsAll(list1));
			System.out.println("list1 " + list1);
			System.out.println("list2 " + list2);
		}
		
		
		
	
	public static void main(String args[]) {
		ListDemo list=new ListDemo();
		System.out.println("Add data ");
		list.addData();

		System.out.println("Display after delete");
		list.deleteData();
		
		System.out.println("Display after contain");
		list.contain();
		
	
	}
}
