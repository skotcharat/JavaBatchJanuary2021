package AbstractBank;

public class AccountMain {

	public static void main(String[] args) {
		
		Account acc;
		System.out.println(" Calling Savings Account:");
		acc=new SavingsAccount();
		acc.accept();
		acc.calculateInterest();
		acc.display();
		
		System.out.println(" Calling Current Account:");
		acc=new CurrentAccount();
		acc.accept();
		acc.calculateInterest();
		acc.display();
		
		
	}

}