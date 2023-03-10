package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample3
{	
	@Test
	public void TC3()
	{
		Reporter.log("Tc3 is run");
	}
	@Test
	public void TC4()
	{
		Reporter.log("TC4 is run");
	}

}
