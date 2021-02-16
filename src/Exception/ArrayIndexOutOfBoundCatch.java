package Exception;


//create a program which should generate ArrayIndexOutOfBoundsException
public class ArrayIndexOutOfBoundCatch {
	

	public void createArray() {
		int myArray[] = new int[5];
		
		myArray[0] = 1;
		myArray[1] = 4;
		myArray[2] = 2;
		myArray[3] = 3;
		myArray[4] = 4;
		
		
		System.out.println(myArray[6]);
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayIndexOutOfBoundCatch arr = new ArrayIndexOutOfBoundCatch();
		arr.createArray();
	}
	
	

}
