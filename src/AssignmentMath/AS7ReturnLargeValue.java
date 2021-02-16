package AssignmentMath;

import java.util.*;

//accepts two integer values from the user and return the larger values. However if the two values are the same, 
//return 0 and return the smaller value if the two values have the same remainder when divided by 6

public class AS7ReturnLargeValue {
	Scanner sc;
	int num1;
	int num2;
	int remainder1;
	int remainder2;
	
	public void accpet() {
		sc = new Scanner(System.in);
		System.out.println("Number 1");
		num1 = sc.nextInt();
		System.out.println("Number 2");
		num2 = sc.nextInt();
		
		remainder1 = num1 % 6;
		remainder2 = num2 % 6;
	}
	
	public void result() {
		System.out.println("Max: " + Math.max(num1, num2));
		if(num1 == num2) {
			System.out.println("0");
		} else if(remainder1 == remainder2) {
			System.out.println("Min: " + Math.min(num1, num2));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AS7ReturnLargeValue as = new AS7ReturnLargeValue();
		as.accpet();
		as.result();

	}

}