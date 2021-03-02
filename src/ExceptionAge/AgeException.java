package ExceptionAge;

public class AgeException extends Exception{
	@Override
	public String getMessage()
	{
		return "Trying to Enter Wrong age";
	}

}



