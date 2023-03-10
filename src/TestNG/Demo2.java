package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2
{	
	@Test
	public void TC3()
	{
		Assert.fail();
		Reporter.log("TC3 is run");
	}
	
	@Test
		public void TC4()
	{
	
		Reporter.log("Tc4 is run");
	}

}
