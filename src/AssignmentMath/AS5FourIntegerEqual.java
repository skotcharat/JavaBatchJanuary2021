package AssignmentMath;

import java.util.*;
//1)	Write a Java program that takes two numbers as input and display the product of two numbers.
public class AS5FourIntegerEqual {
	private Scanner sc;
	int var1;
	int var2;
	int var3;
	int var4;
	
	public void calculate() {
		sc = new Scanner(System.in);
		System.out.println("Enter Number 1");
		var1 = sc.nextInt();
		System.out.println("Enter Number 2");
		var2 = sc.nextInt();	
		sc = new Scanner(System.in);
		System.out.println("Enter Number 3");
		var3 = sc.nextInt();
		System.out.println("Enter Number 4");
		var4 = sc.nextInt();
		
		if(var1 == var2 && var2 == var3 && var3 == var4) {
			System.out.println("all four number are equal");
		
		} else {
			System.out.println("all four number are not equal");
		}

		
					
		
	}
	public static void main(String args[])
	{
		AS5FourIntegerEqual c1 = new AS5FourIntegerEqual();
		c1.calculate();
	}

}
