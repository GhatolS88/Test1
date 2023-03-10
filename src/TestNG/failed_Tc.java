package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class failed_Tc
{	
	@Test
	public void TC6()
	{
		Reporter.log("TC6 is run",true);
	}
	@Test
	public void TC7()
	{
		Assert.fail();
		Reporter.log("TC7 is Fail");
	}

}
