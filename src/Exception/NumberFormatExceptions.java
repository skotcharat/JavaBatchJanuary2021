package Exception;
import java.util.*;

// attempted to convert a string to one of the numeric types, but that the string does not have the appropriate format

public class NumberFormatExceptions {
	private Scanner sc;
	String one;
	int result;
	
	public NumberFormatExceptions() {
		sc=new Scanner(System.in);
	}
	
	public void accept() {
		System.out.println("Enter number");
		one = sc.next();
		//System.out.println("Enter number");
		//two = sc.next();
		
				
	}
	
	public void result() {
		try 
		{
			result = Integer.parseInt(one);
			System.out.println(result);
		} catch(NumberFormatException ex)
		{
			System.out.println("NumberFormatException");
		}
				
	}
	
	public static void main(String args[]) {	
		NumberFormatExceptions nm = new NumberFormatExceptions();		
		nm.accept();
		nm.result();
	}

}
