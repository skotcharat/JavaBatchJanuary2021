package Exception;
// Compilation fails because ArithmeticException has already been caught. ArithmeticException is a subclass of java.lang.Exception, 
// by time the ArithmeticException has been specified it has already been caught by the Exception class.

//If ArithmeticException appears before Exception, then the file will compile. When catching exceptions the more specific exceptions must be listed before the more general (the subclasses must be caught before the superclasses).
public class practise1 {

	public static void main(String[] args) {
		try 
		{ 
		    int x = 0; 
		    int y = 5 / x; 
		} 
		catch (Exception e) 
		{
		    System.out.println("Exception"); 
		} 
		catch (ArithmeticException ae) 
		{
		    System.out.println(" Arithmetic Exception"); 
		} 
		System.out.println("finished");

	}

}
