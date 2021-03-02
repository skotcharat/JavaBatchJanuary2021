package FunctionalInterface;

public class DemoWithLambda {
	
	public void operations()
	{
		Calc cal=(number1,number2)->{
			System.out.println("Result is "+(number1+number2));
			};
			// ;//Lambda expression
			cal.add(60, 70);
			
	}
	
	public static void main(String args[])
	{
		DemoWithLambda d1=new DemoWithLambda();
		
		d1.operations();
	}

}
//Its shortcut way to call methods in interface which is containing only one method