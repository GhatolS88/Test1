package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3
{	
	@Test
	public void TC5()
	{
		Reporter.log("Tc5 is run",true);
	}
	
	@Test
	public void TC6()
	{
		Assert.fail();
		Reporter.log("TC6 is run");
	}

}
