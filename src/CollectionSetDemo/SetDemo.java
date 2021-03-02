package CollectionSetDemo;

import java.util.*;


public class SetDemo {
	Set<String> setv;
	
	
	public SetDemo()
	{
		setv=new HashSet<String>();	
	}
	public void accept()
	{
		setv.add("one");
		setv.add("two");
		setv.add("three");
		setv.add("one");
		
	}
	public void display()
	{
		for(String s:setv)
		{
			System.out.println("String val"+s);
		}
		
	}
	public static void main(String args[])
	{
		SetDemo s1=new SetDemo();
		s1.accept();
		s1.display();
	}
	

}
