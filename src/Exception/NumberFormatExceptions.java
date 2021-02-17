package Exception;
import java.util.*;

public class NumberFormatExceptions {
	private Scanner sc;
	int one;
	int two;
	int result;
	
	public NumberFormatExceptions() {
		sc=new Scanner(System.in);
	}
	
	public void accept() {
		System.out.println("Enter number");
		one = sc.nextInt();
		System.out.println("Enter number");
		two = sc.nextInt();
				
	}
	
	public void result() {
		try 
		{
			result = one + two;
			System.out.println(result);
		} catch(NumberFormatException ex)
		{
			System.out.println("NumberFormatException");
		}
				
	}
	
	public static void main(String[] args) {	
		NumberFormatExceptions nm = new NumberFormatExceptions();		
		nm.accept();
		nm.result();
	}

}
