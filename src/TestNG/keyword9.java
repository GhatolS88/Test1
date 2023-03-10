package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keyword9 
{	
	@Test
	public void Login()
	{
		Reporter.log("method Login is running",true);
	}
	
	@Test(dependsOnMethods= {"Login"})
	public void Logout()
	{
		Reporter.log("Method Logout is running",true);
	}

}
