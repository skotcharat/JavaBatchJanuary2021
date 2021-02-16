package App_Student;

public class Student {
	private String name;
	private int age;
	private String city;
	private double division;
	private double totalMark;
	private double markObtain;
	private int studentId;
	private static int lastStudentId = 100;
	
	

	public Student() {
		
	}
	
	public Student(String name, int age, String city) {
		setAge(age);
		this.name = name;
		this.city = city;
	}
	
	public Student(String name, int age, String city, double totalMark, double markObtain) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
		this.totalMark = totalMark;
		this.markObtain = markObtain;	
		setDivision();
		this.studentId = lastStudentId++;
	}
	
	

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public static int getLastStudentId() {
		return lastStudentId;
	}

	public static void setLastStudentId(int lastStudentId) {
		Student.lastStudentId = lastStudentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age < 0) {
			age = 0;
		} else {
			this.age = age;
		}
		
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getDivision() {
		return division;
	}

	public void setDivision() {
		this.division = markObtain / totalMark;
	}

	public double getTotalMark() {
		return totalMark;
	}

	public void setTotalMark(double totalMark) {
		this.totalMark = totalMark;
	}

	public double getMarkObtain() {
		return markObtain;
	}

	public void setMarkObtain(double markObtain) {
		this.markObtain = markObtain;
	}

	
	public String processResult() {
		if(division > 0.50) {
			return "Pass";
		} else {
			return "Fail";
		}
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", city=" + city + ", division=" + division + ", totalMark="
				+ totalMark + ", markObtain=" + markObtain + " " + studentId +"]";
	}
	
	

	

	

}
