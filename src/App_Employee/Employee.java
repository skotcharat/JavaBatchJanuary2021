package App_Employee;

/**
 * Create a project for Sales and Production deptt.
1. When an employee joins, System should generate empid with dept code. (SLS-1, PROD-1)
2. Sales emp,after achieving sales target, is eligible for commission.
3. Production emp also have production target, after completing he is also eligible for bonus.
4. No one should able to modify employee name.
5. Each employee must have targets which will declare at department level.
6. Production dept must have overtime functionality.
7. All employees must have total working hours and its respective functionality.
==============================================
[ NOTE - Decide interfaces and class by your own ]
After creating base modules (Classes & interfaces), work with 3 employees detail.
 * */
public class Employee {
	private String emId;
	private String name;
	private double totalWorkHours = 40;
	
	private static int lastEmld = 1;
	
	public Employee() {
		
	}
		
	public Employee(String name, String dept) {
		if(dept.equalsIgnoreCase("sales")) {
			this.emId = "SLS- " + lastEmld++;
		} else {
			this.emId = "PROD- " + lastEmld++;
		}
		this.name = name;
		

	}
	public static int getLastEmld() {
		return lastEmld;
	}

	public static void setLastEmld(int lastEmld) {
		Employee.lastEmld = lastEmld;
	}

	public String getEmId() {
		return emId;
	}
	private void setEmId(String emId) {
		this.emId = emId;
	}
	public String getName() {
		return name;
	}
	// private setEmpName so cannot be changed using setter method
	private void setName(String name) {
		this.name = name;
	}
	public double getTotalWorkHours() {
		return totalWorkHours;
	}
	public void setTotalWorkHours(double totalWorkHours) {
		this.totalWorkHours = totalWorkHours;
	}

	@Override
	public String toString() {
		return "Employee [emId=" + emId + ", name=" + name + ", totalWorkHours=" + totalWorkHours + "]";
	}

	
	


}
