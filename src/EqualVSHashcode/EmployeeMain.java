package EqualVSHashcode;

public class EmployeeMain {
	public static void main(String arg[])
	{
		Employee emp=new Employee();
		emp.setEmpid(1);
		emp.setEmpname("Aayra");
		emp.setSalary(8999.33);
		Employee emp1=new Employee();
		emp1.setEmpid(1);
		emp1.setEmpname("Aayra");
		emp1.setSalary(8449.33);
		if(emp.equals(emp1)) // if compare without hashcode() will not wqual
		{
			System.out.println("They are equal");
		}
		else
		{
			System.out.println("They are not equals");
		}
		
	}

}
