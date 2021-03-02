package ThreadBank;
// Create a class called Account which will have withdraw method , it will take certain amount as a parameter and will deduct amount from specific balance.
//Two threads will try to deduct different amount from balance. you have to make sure that only one thread can deduct amount at a time to remove inconsistence in balance.

class Account {
	int bal = 2000;
	synchronized void withdraw(int amount) {
		System.out.println("Withdraw amount: " + amount);
		
		 
		bal -= amount; // or  this.bal-=amount;
		System.out.println("Remain amount: " + bal);
		
		notify();  
	   
		
	}
	
	

}

class thread1 extends Thread {
	Account ac;
	public thread1(Account ac) {
		this.ac = ac;
	}
	
	
	public void run() {
		ac.withdraw(500);
	}


	
}

class thread2 extends Thread {
	Account ac;
	public thread2(Account ac) {
		this.ac = ac;
	}
	
	public void run() {
		ac.withdraw(200);
	}
}

class Accountest {  
	public static void main(String args[]){  
	
	Account obj = new Account();//only one object  
	thread1 t1 = new thread1(obj);  
	thread2 t2 = new thread2(obj);  
	t1.start();  
	t2.start();  
	}  
}   
