package Logic;

/**
 * 
 * @author student
 * Write a method that reverses a string.
For example, 'java interview' becomes 'weivretni avaj'.
 */

public class Logic8 {
	
	
	public static void main(String[] args) {
		System.out.println(reverse("ying"));
		
	}
	
	public static String reverse(String s) {
		
		String my = "";
		for(int i = 0; i < s.length(); i++) {
			my += s.charAt(s.length() - 1 - i);
		}
		return my;
	
	}
		
}