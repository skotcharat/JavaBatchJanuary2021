package App_Employee;

public class EmployeeProduction extends Employee {
	private int productTarget = 100;
	private double bonus = 0;
	private int production = 0;
	
	public EmployeeProduction() {
		super();
	}
	
	
	public EmployeeProduction(String name, String dept) {
		super(name, "production");
	}

	public boolean CheckEligibleBonus(int production) {
		if(production > productTarget) {
			setBonus((production - productTarget) * 0.05);
			setProduction(production);
			return true;
		}
		setProduction(0);
		return false;
	}
	
	public double calcOverTimeHrs(double hrsEmpWorked) {
		if (hrsEmpWorked > getTotalWorkHours()) {
			return hrsEmpWorked - getTotalWorkHours();
		} else {
			return 0;
		}
		
	}
	
	public int getProductTarget() {
		return productTarget;
	}
	public void setProductTarget(int productTarget) {
		this.productTarget = productTarget;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public int getProduction() {
		return production;
	}
	public void setProduction(int production) {
		this.production = production;
	}
	@Override
	public String toString() {
		return "EmployeeProduction [productTarget=" + productTarget + ", bonus=" + bonus + ", production=" + production
				+ "]";
	}
	
	
	

}

