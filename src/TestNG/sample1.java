package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample1 
{	
	@Test
	public void TC1()
	{
		Reporter.log("Tc1 is Run");
	}
    @Test
    public void TC2()
    {
    	Reporter.log("Tc2 is run");
    }
}
