package App_Student;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu = new Student("y", 34, "city" , 500, 257);
		
		System.out.println(stu.getAge());
		System.out.println(stu.processResult());
		
		Student stu1 = new Student("y", 34, "city1" , 500, 257);
		Student stu2 = new Student("z", 35, "city2" , 500, 258);
		
		System.out.println(stu1);
		System.out.println(stu2);
		
		
		
		
		
	}

}