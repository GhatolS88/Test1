package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword3
{	
	@Test(priority=1)
	public void TC1()
	{
		Reporter.log("The method TC1 is running",true);
	}
	@Test(priority=2)
	public void TC2()
	{
		Reporter.log("The method TC2 is running",true);
	}
    @Test     //bydefault priority=0;
    public void TC3()    // TC
    {
    	Reporter.log("The method T3",true);
    }
}
