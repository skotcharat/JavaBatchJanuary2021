package Exception;

import java.util.*;
public class MultipleExDemo {
	int arr[];
	
	private Scanner sc;
	public MultipleExDemo()
	{
		arr=new int[5];
		sc=new Scanner(System.in);
	}
	public void accept()
	{
		for(int x=0;x<arr.length;x++)
		{
			System.out.println("Enter number");
			arr[x]=sc.nextInt();
			
		}
		
	}
	
	public void divide()
	{
		for(int var=0;var<arr.length;var++)
		{
			try
			{
			double result=arr[var]/arr[var+1];
			System.out.println("Result is "+result);
			}
			catch(ArithmeticException ex)
			{
				System.out.println("Trying to divide number by zero");
			}
			catch(ArrayIndexOutOfBoundsException ex)
			{
				System.out.println("Trying to access array beyound limit");
			}
		}
	}
	public static void main(String args[])
	{
		MultipleExDemo multi=new MultipleExDemo();
		multi.accept();
		multi.divide();
	}

}
