package AssignmentMath;

/**
 * 
 * @author student
 * Even Fibonacci Sum
Write a method that returns the sum of all even Fibonacci numbers. Consider all Fibonacci numbers that are less than or equal to n.
Each new element in the Fibonacci sequence is generated by adding the previous two elements.
1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 */

public class EvenFibonacciSum2 {
	
	
	public static void main(String[] args) {
					
		int n = 10;		
		int fibonacci = 2;
		int x = 1;
		int z = 0;
		int sum = 0;
		
		while (fibonacci < n) {
			if(fibonacci % 2 == 0) {
				sum += fibonacci;
			}
			z = x + fibonacci;
			x = fibonacci;
			fibonacci = z;
		}
		System.out.print(sum);	
		
	}
		
}
