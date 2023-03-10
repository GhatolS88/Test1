package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class keyword8
{	
	@Test
	public void Login()                 //test case/method
	{
		Assert.fail();
		Reporter.log("Logine Tc is running",true);
	}
	
	@Test(dependsOnMethods= {"Login"})
	public void Logout()
	{
		Reporter.log("Logout Tc is running",true);
	}

}
