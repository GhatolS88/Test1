package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keyword10 
{	
	@Test(priority=1)
	public void TC1()
	{
		Reporter.log("Tc1 is running",true);
	}
	
	@Test(priority=2)
	public void TC2()
	{
		Reporter.log("Tc2 is running",true);
	}
	
	@Test               //default priority=0
	public void TC3()
	{
		Reporter.log("TC3 is running",true);
	}
	
	@Test                  //default priority=0
	public void Tc4()
	{
		Reporter.log("Tc4 is running",true);
	}

}
