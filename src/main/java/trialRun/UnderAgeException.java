package trialRun;

public class UnderAgeException extends Exception
{

	private static final long serialVersionUID = 5597447145608752999L;

	/**
	 * 
	 */
	public UnderAgeException()
	{
		super("Parent is too young!");
	}

	/**
	 * @param message
	 */
	public UnderAgeException(String message)
	{
		super(message);
	}
	
}
