package lab08;

public class SubclassSingleton extends BaseSingleton
{
	private SubclassSingleton() { }
	
	public void doSomething()    
	{                          
		someInt = 2;
	}
	
	public void newFunction() { 
		//new functionality here
	}
}