package Logic;

import java.util.Scanner;

//swap two variables
public class AS4SwapVar {
	
	public void varNum() {
		String pet = "dog";
		String name = "Zin";
		
		String tempName = pet;
		
		pet = name;
		name = tempName;
		
		
		System.out.println("String pet: " + pet);
		System.out.println("String name: " + name);
		
	}				
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		AS4SwapVar main = new AS4SwapVar();
		main.varNum();  // Add method in MainDemo
	}

}

