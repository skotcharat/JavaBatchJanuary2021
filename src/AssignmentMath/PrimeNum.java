package AssignmentMath;

/**
 * 
 * @author student
 * A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.
Write a method that checks if a number is a prime number.
boolean isPrime = true;
 for (int i = n - 1; i > 1; i--) {
     if (n % i == 0) {
         isPrime = false;
         break;
     }
 }
 return isPrime;
 */

public class PrimeNum {
	
	
	public static void main(String[] args) {
		System.out.println(isPrime(15));	
		System.out.println(isPrime(16));
	}
	
	public static Boolean isPrime(Integer n) {
	
		Boolean my = true;
		if(n >= 1) {
			if(n % 2 == 0) {
				my = false;			
			} 
		}
		return my;
	}
		
}