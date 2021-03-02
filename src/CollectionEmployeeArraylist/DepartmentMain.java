package CollectionEmployeeArraylist;

import java.util.*;
public class DepartmentMain {
	private Scanner sc;
	private Employee e;
	private Department d;
	int noofemployee;
	private List<Employee> employeelist;
	public DepartmentMain()
	{
		sc=new Scanner(System.in);
		e=new Employee();
		d=new Department();
		System.out.println("Enter no of employees ");
		noofemployee=sc.nextInt();
		employeelist=new ArrayList<Employee>();
		
	}
	public void accept()
	{
		System.out.println("Enter depeartment code ");
		d.setDeptcode(sc.nextInt());
		System.out.println("Enter Department name ");
		d.setDeptname(sc.next());
		for(int x=1;x<=noofemployee;x++)
		{
			e=new Employee();
			System.out.println("Enter Employee id ");
			e.setEmpid(sc.nextInt());
			System.out.println("Enter Employee name ");
			e.setEmpname(sc.next());
			System.out.println("Enter Salary ");
			e.setSalary(sc.nextDouble());
			employeelist.add(e);
		}
		d.setEmployeelist(employeelist);
		
	}
	public void viewDetails()
	{
		System.out.println("Department code "+d.getDeptcode());
		System.out.println("Department name "+d.getDeptname());
		
		for(Employee e1:employeelist)
		{
			System.out.println("Employee code "+e1.getEmpid());
			System.out.println("Employee name "+e1.getEmpname());
		}
		
	}

}
