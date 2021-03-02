package EqualandHashcodeStudent;
import java.util.*;
public class StudentMain {
	
	private static Scanner sc;
	
	public StudentMain() {
		sc = new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		// If don't want next line WE WILL put sc = new Scanner(System.in) in main method right away
		StudentMain sm = new StudentMain(); 
		// TODO Auto-generated method stub
		Student st = new Student();
		System.out.println("Enter id ");
		st.setId(sc.nextInt());		
		System.out.println("Enter name ");
		st.setName(sc.next());		
		System.out.println("Enter mark ");
		st.setMark(sc.nextInt());
		
		Student st2 = new Student();
		System.out.println("Enter id ");
		st2.setId(sc.nextInt());	
		System.out.println("Enter name ");
		st2.setName(sc.next());		
		System.out.println("Enter mark ");
		st2.setMark(sc.nextInt());
		
		if(st.equals(st2)) {
			System.out.println("They are equal");
		} else {
			System.out.println("They are not equals");
		}
	}

}
