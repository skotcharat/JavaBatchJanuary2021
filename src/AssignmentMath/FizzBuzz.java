package AssignmentMath;

/**
 * 
 * @author student
 * Fizz Buzz
Write a method that returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five.
For numbers which are multiples of both three and five return 'FizzBuzz'.
For numbers that are neither, return the input number.
 */

public class FizzBuzz {
	
	
	public static void main(String[] args) {
		System.out.println(fizzBuzz(15));
		
	}
	
	public static String fizzBuzz(Integer i) {
		String my = "";
		
		if(i % 3 == 0) {
			my += "Fizz";
		} else if(i % 5 == 0) {
			my += "Buzz";
		} else {
			my = Integer.toString(i);
		}
		
		return my;
		
	
	}

	
		
}

