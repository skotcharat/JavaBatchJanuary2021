package App_Bank;

public class BankSavingAccount extends BankAccount {
	private double interestRate;
	private double minBalance;
	
	public BankSavingAccount( ) {
		
	}
	
	public BankSavingAccount(String name, double amt, double interest) {
		super(name, amt);// call super class constructor from constructor
		this.interestRate = interest;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}
	
	public void calInterest( ) {
		calDeposit(getBal() * getInterestRate());
	}
	
	@Override
	public boolean calWithdraw(double amt) {
		if (amt < 0 || amt > (getBal() - getMinBalance())) {
			return false;
		}
		return super.calWithdraw(amt);
	}
}
