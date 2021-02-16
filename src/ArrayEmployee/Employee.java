package ArrayEmployee;

import java.util.*;
public class Employee {
	private int empid;
	private String empname;
	private double salary;
	private Scanner sc;
	public Employee()
	{
		sc=new Scanner(System.in);
	}
	public void accept()
	{
		System.out.println("Enter Employee id ");
		empid=sc.nextInt();
		System.out.println("Enter Employee name ");
		empname=sc.next();
		System.out.println("Enter Salary  ");
		salary=sc.nextDouble();
	}
	public void display()
	{
		System.out.println("Employee id  is"+ empid);
		System.out.println("Employee name is "+empname);
		System.out.println("Employee Salary is "+salary);
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
