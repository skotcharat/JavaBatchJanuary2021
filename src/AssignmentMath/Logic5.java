package AssignmentMath;

/**
 * 
 * @author student
 * Given a number n, write a method that sums all multiples of three and five up to n (inclusive)
 */

public class Logic5 {
	
	public static void main(String[] args) {
		System.out.println(sum(15));
	}
	
	public static Integer sum(Integer n) {

		int sumary = 0;
		for(int i = 0; i <= n; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				sumary += i;
			} 
		}
		return sumary;
		
	}
		
}
