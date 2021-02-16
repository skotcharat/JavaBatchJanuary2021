package BankAccount;

public class SavingAccount extends BankAccount{
	private int intestRate;
	int interestAmount;
	
	public SavingAccount() {
		System.out.println("SavingAccount");
	}
	
	public void addInterest(int intestRate) {
		
		System.out.println("intestRate " + intestRate);
		interestAmount = (getTotalBalance() * intestRate) / 100;
	}
	
	@Override
	public void getBalance() {
		//super.getBalance();
		System.out.println("getBalance " + (interestAmount + getTotalBalance()));
	}

}