package App_Bank;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba = new BankAccount("",  100);
		
		if(ba.calDeposit(200)) {
			System.out.println("success:" + ba.getBal());
		} else {
			System.out.println("Fail:" + ba.getBal());
		}
		
		if(ba.calWithdraw(100)) {
			System.out.println("success:" + ba.getBal());
		} else {
			System.out.println("Fail:" + ba.getBal());
		}
		
		BankSavingAccount bs = new BankSavingAccount();
		
		bs.setInterestRate(0.05);
		bs.calDeposit(1000);
		System.out.println("Before interest" + bs.getBal());
		bs.calInterest();
		System.out.println("After interest" + bs.getBal());
		
		
		BankSavingAccount wd = new BankSavingAccount("Harish", 40000, 0.05);

		wd.setMinBalance(5000);
		
		if(wd.calWithdraw(30000)) {
			System.out.println("Amount withdrawn... New balance " + wd.getBal());
		} else {
			System.out.println("Unable to withdraw amount");
		}
		
		// parent class refer to child class object 
		BankAccount bk = new BankSavingAccount("Harish", 40000, 0.05);  
		
		((BankSavingAccount)bk).setMinBalance(5000); // but cannot refer to child class method == > NEED CASTING
		
		if(bk.calWithdraw(30000)) { // Parent class refers to Child class over-ridden method
			System.out.println("Amount withdrawn... New balance " + bk.getBal());
		} else {
			System.out.println("Unable to withdraw amount");
		}
		
		
		
		
	}

}