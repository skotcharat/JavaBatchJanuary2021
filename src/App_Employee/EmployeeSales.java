package App_Employee;

public class EmployeeSales extends Employee {
	private int saleTarget = 100;
	private double commission = 0;
	private int sales = 0;
	
	
	
	public EmployeeSales() {
		super();
		
	}
	public EmployeeSales(String name, String dept, int sales) {
		super(name, "sales");
		
	}
	public int getSaleTarget() {
		return saleTarget;
	}
	public void setSaleTarget(int saleTarget) {
		this.saleTarget = saleTarget;
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	public int getSales() {
		return sales;
	}
	public void setSales(int sales) {
		this.sales = sales;
	}
	
	public boolean checkEligibleCommission(int sales) {
		if(sales > saleTarget) {
			setCommission((sales - saleTarget) * 0.05);
			setSales(sales); // This one really need to set value
			return true;
		} else {
			setSales(0);
			return false;
		}
		
		
	}
	@Override
	public String toString() {
		return "EmployeeSales [saleTarget=" + saleTarget + ", commission=" + commission + ", sales=" + sales + "]";
	}
	
}
