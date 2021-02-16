package AssignmentMath;

/**
 * 
 * @author student
 * Even Fibonacci
Each new element in the Fibonacci sequence is generated by adding the previous two elements.
1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
Ex. n =10  (2+8 = 10)
 */

public class EvenFibonacciSum {
	
	
	public static void main(String[] args) {
			
		int num1 = 0;
		int num2 = 1;
		int nextNum = 0;
		int n = 10;	
		
		for (int i = 1; i < n; i++) {	    
		    nextNum = num1 + num2;	    
		    num1 = num2;	    
		    num2 = nextNum;
		    System.out.print(num2 + ", ");		    
		}		
		System.out.println(num2 + num1);	
		
		
	}
		
}