package BankAccount;

public class CheckingAccount extends BankAccount {
	private int fee;
	
	public CheckingAccount() {
		System.out.println("CheckingAccount");
	}
	
	public void deductFee(int fee) {		
		System.out.println("fee " + fee);
		this.fee = fee; // need to initial this fee = instance var
		//fee = this.fee; --> THIS ONE WILL NOT WORK
	}
	
	@Override
	public void getBalance() {
		//super.getBalance();
		System.out.println("getBalance " + (getTotalBalance() - fee));
	}
	
	
	
	
	
	
	
}
