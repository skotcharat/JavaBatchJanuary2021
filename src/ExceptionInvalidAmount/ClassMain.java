package ExceptionInvalidAmount;
import java.util.*;

// Create a program which will accept amount to withdrawn from balance 
// if amount is greater then balance then it should throw InvalidAmountException. 
// otherwise it should display amount.

public class ClassMain {
	private Scanner sc;
	static int firsAmount = 5000;
	int withdraw;
	
	public ClassMain()
	{
		sc=new Scanner(System.in);
	}
	
	public void accept()throws AmountException {
		System.out.println("enter amount to withdraw");
		withdraw = sc.nextInt();
		
		if(withdraw > firsAmount) {
			throw new AmountException();
		} else {
			firsAmount = firsAmount - withdraw;
			System.out.println("withdraw value " + firsAmount);
		}
	}
	
	public static void main(String arg[]) {
		ClassMain c = new ClassMain();
		try {
			c.accept();
		} catch (AmountException e) {
			System.out.println("Exception is "+e.getMessage());
		}
	}
}
