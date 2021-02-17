package Logic;

/**
 * 
 * @author student
 * Linear Search
Write a method that returns the index of the first occurrence of given integer in a list.
Assume that the index of the first element in the list is zero.
If the number does not exist return -1.
 */

public class Logic7 {

	public static void main(String[] args) {
		Integer[] list = {2, 3, 4};	
		System.out.println(search(4, list));	
	}
	
	public static int search(Integer n, Integer[] list) {
		for(int i = 0; i < list.length; i++) {
			if(list[i] == n) {
				return i;
			}
		}
		return -1;		
	
	}		
}