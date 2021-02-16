package Exception;
import java.util.*;

public class DevideByzeroCatch {
	private Scanner sc;
	int number1;
	int number2;
public DevideByzeroCatch()
{
	sc=new Scanner(System.in);
}
	public void accept()
	{
		System.out.println("Enter number 1");
		number1=sc.nextInt();
		System.out.println("Enter number 2");
		number2=sc.nextInt();
		
	}
	public void divide()
	{
		try
		{
		double result=number1/number2;
		
		System.out.println("Result is "+result);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Trying to divide a number by zero");
		}
		System.out.println("Welcome here");
	}
	public static void main(String args[])
	{
		DevideByzeroCatch ademo=new DevideByzeroCatch();
		ademo.accept();
		ademo.divide();
		
	}
}