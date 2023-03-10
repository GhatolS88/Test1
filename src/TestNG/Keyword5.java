package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword5
{	
	@Test(priority=1)
	public void TC1()
	{
		Reporter.log("Method TC1 is running");
	}
	@Test(priority=2)
	public void TC2()
	{
		Reporter.log("Method TC2 is running");
	}
	@Test
	public void TC3()                                      //by default priority=0;
	{
		Reporter.log("Method TC3 is running");
	}
	@Test(priority=-1)
	public void TC4()                                     //1
	{
		Reporter.log("Method Tc4 is running");
	}

}
