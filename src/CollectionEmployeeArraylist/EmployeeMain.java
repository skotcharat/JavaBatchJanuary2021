package CollectionEmployeeArraylist;

import java.util.*;
public class EmployeeMain {
private Scanner sc;
private int noofemployee;
private List<Employee> emplist;

public EmployeeMain()
{
	sc=new Scanner(System.in);
	System.out.println("Enter no of Employees ");
	noofemployee=sc.nextInt();
	emplist=new ArrayList<Employee>();
}

public void accept()
{
		for(int x=1;x<=noofemployee;x++)
		{
			Employee e=new Employee();
			System.out.println("Enter Employee id ");
			e.setEmpid(sc.nextInt());
			System.out.println("Enter Employee name ");
			e.setEmpname(sc.next());
			System.out.println("Enter Salary ");
			e.setSalary(sc.nextDouble());
			emplist.add(e);
		}
	
}
public void view()
{
	for(Employee e1:emplist)
	{
		System.out.println("Employee id is "+e1.getEmpid());
		System.out.println("Employee name is "+e1.getEmpname());
	}
}
public void deleteData()
{
	System.out.println("Enter Employee id which you want to delete");
	Employee e1=new Employee();
	e1.setEmpid(sc.nextInt());
	if(emplist.contains(e1))
	{
		System.out.println("object exist");
		emplist.remove(e1);
	}
}
public static void main(String args[])
{
	EmployeeMain empdata=new EmployeeMain();
	empdata.accept();
	empdata.view();
	System.out.println("Deleting data after deleting records are ");
	empdata.deleteData();
	empdata.view();
}

}