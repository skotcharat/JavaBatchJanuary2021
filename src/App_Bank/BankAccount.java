package App_Bank;

//Bean Class / POJO (Plain Old Java Object)
//Complete class
public class BankAccount {
	private int accNo;
	private String custName;
	private double bal;
	
	private static int lastAccNo = 100;
	
	// No argument Constructor
	public BankAccount() {
		
	}
	
	// Parameterized constructor
	public BankAccount(String custName, double bal) {
		this.accNo = lastAccNo++;
		this.custName = custName;
		this.bal = bal;
	}
	
	
	
	
	public BankAccount(int accNo2, String name, double amt) {
		// TODO Auto-generated constructor stub
	}

	public static int getLastAccNo() {
		return lastAccNo;
	}

	public static void setLastAccNo(int lastAccNo) {
		BankAccount.lastAccNo = lastAccNo;
	}

	
	// insert / modify / delete data
	// Setter / Mutator Method
	public void setAccNo (int acno) {
		accNo = acno;
	}

	// Fetch data
	//Getter / Access method
	public int getAccNo() {
		return accNo;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public double getBal() {
		return bal;
	}

	void setBal(double bal) {
		this.bal = bal;
	}
	// Deposit
	public boolean calDeposit(double money) {
		if(money < 0) {
			return false;
		} else {
			bal += money;
			return true;
		}		
		
	}
	
	//withdraw
	public boolean calWithdraw(double money) {
		if(money < 0 || money > bal) {
			return false;
		} else {
			bal -= money;
			return true;
		}	
	}

	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", custName=" + custName + ", bal=" + bal + "]";
	}	
}
