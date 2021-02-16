package BankAccount;

public class BankAccount {
	private int accountNumber;
	private int totalBalance;
	private int depositAmount;
	private int withdrawAmount;
	
	public int getTotalBalance() {
		return totalBalance;
	}

	public void setTotalBalance(int totalBalance) {
		this.totalBalance = totalBalance;
	}
	
	public BankAccount() {
		System.out.println("BankAccount ");
	}
	
	public void deposit(int depositAmount) {
		totalBalance += depositAmount;
		System.out.println("depositAmount " + depositAmount);
	}
	
	public void withdraw(int withdrawAmount) {
		totalBalance -= withdrawAmount;
		System.out.println("withdrawAmount " + withdrawAmount);
	}

	
	public void getBalance() {
		System.out.println("totalBalance " + totalBalance);
	}
	

}
