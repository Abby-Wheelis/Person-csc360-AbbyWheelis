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
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public UnderAgeException(String message)
	{
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	
	
}
