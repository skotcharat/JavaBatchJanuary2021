package Logic;

/**
 * 
 * @author student
 * Write a method that calculates the factorial of a given number.
Factorial is the product of all positive integers less than or equal to n. For example, factorial(4) = 4x3x2x1 = 24.
TIP: To make it more interesting, try to do it recursively.
 */

public class Logic6 {
	
	
	public static void main(String[] args) {
		System.out.println(factorial(5));
		
	}
	
	public static Integer factorial(Integer n) {
		int sum = n;
		
		for(int i = n - 1; i > 0; i--) {
			sum = sum * i;	
		}
		return sum;
	
	}
		
}