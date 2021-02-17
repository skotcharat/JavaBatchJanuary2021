package ExceptionInvalidAmount;

public class AmountException extends Exception {

	@Override
	public String getMessage()
	{
		return "InvalidAmountException";
	}
}
