package lab08;

public class BaseSingleton {
	protected BaseSingleton() { }
	
	private static BaseSingleton instance;
	public static BaseSingleton getInstance()
	{
		if (instance == null) {
			instance = new BaseSingleton();
		}             
		return instance;
	}
	
	//Some state variables
	protected int someInt;
	
	//Function is marked as virtual so that it can be overidden
	public void doSomething() {
		someInt = 1;
	}
}
