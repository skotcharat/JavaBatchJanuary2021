package Logic;

import java.util.*;

//count the letters, spaces, numbers and other characters of an input string.
public class AS6CountInput {
	Scanner sc;
	String input;

	
	public void accept() {
		sc = new Scanner(System.in);
		System.out.println("put in the string");
		// next() can read the input only till the space.
		// nextLine() reads input including space between the words
		input = sc.nextLine();
	}
	
	public void count() {
		char[] ch = input.toCharArray();
	    int letter = 0;
	    int space = 0;
	    int num = 0;
	    int other = 0;
	    for(int i = 0; i < input.length(); i++) {
	    	System.out.println(input.length());
	    	if(Character.isLetter(ch[i])) {
	    		letter++;
	    	} else if(Character.isDigit(ch[i])) {
	    		num++;
	    	} else if(Character.isSpaceChar(ch[i])) {
	    		space++;
	    	} else {
	    		other++;
	    	}
	    }
	    
		System.out.println("String input: " + input);
		System.out.println("String letter: " + letter);
		System.out.println("String num: " + num);
		System.out.println("String space: " + space);
		
	}
	
	public static void main(String arg[]) {
		AS6CountInput c = new AS6CountInput();
		c.accept();
		c.count();
	}
}
