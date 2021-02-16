package Array2ForLoop;

public class Array {
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		arr[0] = 10;
		arr[1] = 40;
		arr[2] = 20;
		arr[3] = 25;
		arr[4] = 35;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-------------------------");
		
		for(int data : arr) {
			System.out.println(data);
		}
		System.out.println("-------------------------");
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 25) {
				System.out.println(i); 
			}
			
		}
			
		
		System.out.println("-------------------------");
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int data : arr) {
			System.out.println(data);
		}
		
		
	}
}
