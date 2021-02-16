package BankAccount;

public class BankAccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub				
		CheckingAccount ca = new CheckingAccount();
		ca.deposit(50);
		ca.withdraw(10);
		ca.deductFee(10);
		ca.getBalance();
		
		System.out.println();
		
		SavingAccount sa = new SavingAccount();
		sa.deposit(110);
		sa.withdraw(10);
		sa.addInterest(10);
		sa.getBalance();
	}

}
