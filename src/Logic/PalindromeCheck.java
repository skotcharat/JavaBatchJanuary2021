package Logic;

/**
 * 
 * @author student
 * Palindrome Check
A palindrome is a word which reads the same backward or forward. 'abcba' is a palindrome.
Write a method that detects if a string is a palindrome.
Tip: Use word.charAt(i) to get the character at position i.
 */

public class PalindromeCheck {
	
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("abcba"));	
		System.out.println(isPalindrome("abcbac"));
	}
	
	public static boolean isPalindrome(String word) {
		boolean my = true;
		
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == word.charAt(word.length()- 1 - i)) {
				my = true;
			} else {
				my = false;
			}
		}
		return my;
		
		
		
		
		
	
		
	}
		
}