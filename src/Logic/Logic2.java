package Logic;

/**
 * 
 * @author student
 * 1, 1, 2, 3, 3, 5, 4, 7, 5, 9, 6, 11, 7,...50
 */

public class Logic2 {
	public static void main(String[] args) {

		int sumFisrt = 1;
		int sumSecond = 1;
		int j = 49;
		
		
		System.out.print(sumFisrt + ", ");
		for(int i = 0; i < j; i++) {
			if(sumFisrt < j && sumSecond < j) {
				System.out.print(sumFisrt + ", "); 
				sumFisrt = sumFisrt + 2;
						
				sumSecond = i + 2;
				System.out.print(sumSecond + ", ");
			} else {
				break;
			}			 			
		}
		System.out.print(sumFisrt);
			
	}
		
}	