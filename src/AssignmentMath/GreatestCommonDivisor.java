package AssignmentMath;

/**
 * 
 * @author student
 * Greatest Common Divisor
The Greatest Common Divisor of two positive integers is the largest integer that divides both without remainder.
Write a method that returns the Greatest Common Divisor of p and q.
 */

public class GreatestCommonDivisor {
	
	
	public static void main(String[] args) {
		System.out.println(gcd(55, 5));	
	}
	
	public static Integer gcd(Integer num1, Integer num2) {
		int gcd = 0;
		for(int i = 1; i <= num1 && i <= num2; i++) {
            if(num1 % i == 0 && num2 % i == 0)
                gcd = i;
        }
		return gcd;
	}
		
	
		
		
		
		
		
}