package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1
{	
	@Test
	public void TC1()
	{
		Reporter.log("TC1 is run",true);
	}
	
	@Test
	public void TC2()
	{
		Reporter.log("Tc2 is run",true);
	}

}
