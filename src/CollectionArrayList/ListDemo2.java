package CollectionArrayList;
import java.util.*;

public class ListDemo2 {
	private List<String> list1;
	private Scanner sc;
	int noofelements;
	public ListDemo2()
	{
		list1=new ArrayList<String>();
		sc=new Scanner(System.in);
		System.out.println("Enter no of elements you want to enter");
		noofelements=sc.nextInt();
	}
	public void accept()
	{
		for(int x=0;x<=noofelements;x++)
		{
			System.out.println("Enter values");
			String s=sc.next();
			list1.add(s);
		}	
	}
		public void deleteData()
		{
			System.out.println("Enter value which you want to delete");
			String val=sc.next();
			list1.remove(val);
			
			
		}
		public void display()
		{
			for(String s:list1)
			{
				System.out.println("Value is "+s);
			}
		}
		
		
	
	public static void main(String args[]) {
		ListDemo2 list=new ListDemo2();
		list.accept();
		System.out.println("Display before delete ");
		list.display();
		System.out.println("Display after delete");
		list.deleteData();
		list.display();
	
	}
}
