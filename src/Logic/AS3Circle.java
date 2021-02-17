package Logic;

import java.util.*;
//Write a Java program to print the area and parameter of a circle
public class AS3Circle {
	private Scanner sc;
	
	int var1;
	int multipleTable;
	
	public void calculate()
	{
		sc = new Scanner(System.in);
		System.out.println("Enter a radius of circle");
		var1 = sc.nextInt();
		
		System.out.println("Area of circle: " + 3.14 * (var1*var1));
		System.out.println("Perimeter of circle: " + 2 * 3.14 * var1);				
		
	}
	public static void main(String args[])
	{
		AS3Circle c1 = new AS3Circle();
		c1.calculate();
	}

}
