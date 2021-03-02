package EqualVSHashcode;

public class Employee {
	private int empid;
	private String empname;
	private double salary;
	public void setEmpid(int empid)
	{
		this.empid=empid;
	}
	public int getEmpid()
	{
		return empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public int hashCode() {
		return empid+empname.hashCode();
	}
	@Override
	public boolean equals(Object obj) {//if(e1.equals(e2))
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empid != other.empid)
			return false;
		if (empname == null) {
			if (other.empname != null)
				return false;
		} else if (!empname.equals(other.empname))
			return false;
		return true;
	}
	
	
}
