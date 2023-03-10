package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keyword7
{	
	@Test(timeOut=5000)             //test case/method
	public void TC1()
	{
		Reporter.log("The method TC1 is running",true);
	}
	
	@Test
	public void TC2()
	{
		Reporter.log("The method is TC2 is running",true);
	}

}
