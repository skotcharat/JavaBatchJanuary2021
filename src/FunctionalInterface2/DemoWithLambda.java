package FunctionalInterface2;

public class DemoWithLambda {
	
	public void operations()
	{
		Calc cal=(number1)->{
			System.out.println("Result is "+(number1));
			};
			// ;//Lambda expression
			cal.square(60);
			
			
	}
	
	public static void main(String args[])
	{
		DemoWithLambda d1=new DemoWithLambda();
		
		d1.operations();
	}

}
//Its shortcut way to call methods in interface which is containing only one method