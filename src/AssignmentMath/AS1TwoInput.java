package AssignmentMath;
import java.util.*;
//1)	Write a Java program that takes two numbers as input and display the product of two numbers.
public class AS1TwoInput {
	private Scanner sc;
	int var1;
	int var2;
	
	public void calculate()
	{
		sc = new Scanner(System.in);
		System.out.println("Enter Number 1");
		var1 = sc.nextInt();
		System.out.println("Enter Number 2");
		var2 = sc.nextInt();
		System.out.println("Number 1: " + var1);
		System.out.println("Number 2: " + var2);
		
					
		
	}
	public static void main(String args[])
	{
		AS1TwoInput c1 = new AS1TwoInput();
		c1.calculate();
	}

}