package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Failed_TC1
{	
	@Test
	public void TC8()
	{
		Assert.fail();
		Reporter.log("TC8 is Fail");
	}
	@Test
	public void TC9()
	{
		Reporter.log("TC9 is run ",true);
	}

}
