package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keyword6
{	
	@Test(priority=1)
	public void TC1()
	{
		Reporter.log("The method TC1 is running",true);
	}
	
	@Test(enabled=false)
	public void TC2()
	{
		Reporter.log("The method TC2 is running",true);
	}

}
