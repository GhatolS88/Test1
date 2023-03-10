package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Group_Testcase 
{	
	@Test(groups="Car Insurance")
	public void TC1()
	{
		Reporter.log("Tc1 is run",true);
	}
	
	@Test(groups="Car Insurance")
	public void TC2()
	{
		Reporter.log("Tc2 is run",true);
	}
	
	@Test(groups="Health Insurance")
	public void TC3()
	{
		Reporter.log("TC3 is run",true);
	}
	@Test(groups="Health Insurance")
	public void TC4()
	{
		Reporter.log("TC4 is run",true);
	}
	@Test(groups="Term Life Insurance")
	public void TC5()
	{
		Reporter.log("TC5 is run",true);
	}
	
	@Test(groups="Retirment plan")
	public void TC6()
	{
		Reporter.log("TC6 is run",true);
	}

}
