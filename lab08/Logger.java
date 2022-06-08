package lab08;

public class Logger {
	
	private Logger() {}
	
	private static Logger uniqueInstance;
	
	public static Logger getInstance()
	{
		
		if (uniqueInstance == null)
			uniqueInstance = new Logger();
		
		return uniqueInstance;
		
	}
}
