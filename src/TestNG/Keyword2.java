package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword2
{
	                               //test case/method
	@Test(priority=2)
	public void TC1()
	{
		Reporter.log("The method TC1 is running",true);
	}
	
	@Test(priority=1)                       //TestCase/method
	public void TC2()
	{
		Reporter.log("the method TC2 is running");
	}

}
