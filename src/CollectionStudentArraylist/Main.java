package CollectionStudentArraylist;

import java.util.*;
public class Main {
private Scanner sc;
private int noofStudent;
private List<Student> st;
private College c;
private Student s;


public Main()
{
	sc=new Scanner(System.in);
	System.out.println("Enter no of student ");
	noofStudent=sc.nextInt();
	st = new ArrayList<Student>();
	c=new College();
	s = new Student();
	
}

public void accept() 
{
	
	System.out.println("Enter collegeCode ");
	c.setCollegeCode(sc.nextInt());
	System.out.println("Enter CollegeName ");
	c.setCollegeName(sc.next());
	
	for(int x=1;x<=noofStudent;x++)
	{
		
		
		
		System.out.println("Enter stuCode");
		s.setStuCode(sc.nextInt());
		System.out.println("Enter stuName ");
		s.setStuName(sc.next());
		System.out.println("Enter stuMark");
		s.setStuCode(sc.nextInt());
				
		st.add(s);
	}
	c.setStudentList(st);
	
	
	
}
public void view()
{
	System.out.println("collegeCode is "+c.getCollegeCode());
	System.out.println("CollegeName is "+c.getCollegeName());
	
	//List<Student> st=d.getStudentList();
	for(Student e1:st)
	{
		
		System.out.println("stuCode is "+e1.getStuCode());
		System.out.println("stuName is "+e1.getStuName());
		System.out.println("stuMark is "+e1.getStuMark());
	}
}

public static void main(String args[])
{
	Main empdata=new Main();
	empdata.accept();
	empdata.view();
	
}

}