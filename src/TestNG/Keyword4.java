package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword4
{	
	@Test(priority=2)
	public void TC1()
	{
		Reporter.log("The method TC1 is running");  //Testcase/method
	}
	@Test(priority=1)
	public void TC2()
	{
		Reporter.log("The method TC2 is running");
	}
	@Test                                 //by default priority is 0;
	public void TC3()
	{
		Reporter.log("The method TC3 is running");
	}
	@Test(priority=1)
	public void TC4()
	{
		Reporter.log("The method TC4 is running");
	}

}
