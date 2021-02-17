package Logic;

import java.util.*;
//2)	Write a Java program that takes a number as input and prints its multiplication table up to 10
public class AS2InputMultiplicationTable {
	private Scanner sc;
	
	int var1;
	int multipleTable;
	
	public void calculate()
	{
		sc = new Scanner(System.in);
		System.out.println("Enter Number");
		var1 = sc.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			multipleTable = var1 * i;
			System.out.println("Number" + var1 + "*" + i + "=" + multipleTable);
		}
					
		
		
	}
	public static void main(String args[])
	{
		AS2InputMultiplicationTable c1 = new AS2InputMultiplicationTable();
		c1.calculate();
	}

}