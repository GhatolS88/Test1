package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword1
{	
	//To run multiple times
	
	@Test(invocationCount=10)         //Test case/method
	
	public void TC1()
	{
		Reporter.log("The method TC1 is running",true);
	}

}
