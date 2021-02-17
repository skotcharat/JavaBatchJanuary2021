package ExceptionAge;

import java.util.*;
public class AgeDemo {
	private Scanner sc;
	int age;
	public AgeDemo()
	{
		sc=new Scanner(System.in);
	}
	public void accept()throws AgeException
	//throws define the list of 
	//exception that can come in program 
	//but will be handled in calling method
	{
		System.out.println("Enter Age ");
		age=sc.nextInt();
			
		if(age<0)
		{
			throw new AgeException();
		}
		else
		{
			System.out.println("Age is "+age);
		}
	}
	public static void main(String args[])
	{
		AgeDemo a1=new AgeDemo();
		try
		{
		a1.accept();
		}
		catch(AgeException e1)
		{
			System.out.println("Exception is "+e1.getMessage());
		}
	}

}

