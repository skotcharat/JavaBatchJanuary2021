package AssignmentMath;

import java.util.Scanner;
//sum of two integers and return true if the sum is equal to a third integer
public class AS9SumInt {
	

	public static void main(String[] args) {
		int int1;
		int int2;
		int int3;
		int sum;
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
     System.out.print("Input a Int1: ");
     int1 = sc.nextInt();
     System.out.print("Input a Int2: ");
     int2 = sc.nextInt();
     System.out.print("Input a Int3: ");
     int3 = sc.nextInt();
     
     sum = int1 + int2;
     System.out.println("SUM " + sum);
     
     
     if(sum == int3) {
     	System.out.println("TRUE ");
     }
	}

}
