package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample2
{	
	@Test
	public void TC5()
	{
		Reporter.log("TC1 is run");
	}
	@Test
	public void TC6()
	{
		Reporter.log("TC@ is run");
	}

}
