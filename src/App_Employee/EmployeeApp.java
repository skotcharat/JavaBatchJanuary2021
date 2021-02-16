package App_Employee;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee em = new Employee("ying", "production");
		System.out.println(em);
		
		em = new Employee("kot", "sales");
		System.out.println(em);
		
		Employee sales = new EmployeeSales();	
		((EmployeeSales)sales).checkEligibleCommission(200);
		System.out.println(sales);
			
		
		Employee sales2 = new EmployeeProduction();	
		double overtime = ((EmployeeProduction)sales2).calcOverTimeHrs(45.00);
		System.out.println(overtime);
		
		((EmployeeProduction)sales2).CheckEligibleBonus(300);
		System.out.println(sales2);
	}

}