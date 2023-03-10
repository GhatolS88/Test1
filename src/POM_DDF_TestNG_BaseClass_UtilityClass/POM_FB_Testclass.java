package POM_DDF_TestNG_BaseClass_UtilityClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POM_FB_Testclass extends POM_FB_Baseclass1
{	
	 
	POM_Fb1 FB;
	@BeforeClass
	public void OpenBrowser()
	{
		InitializedBrowser();
		
		 FB=new  POM_Fb1(driver);
	}
	
	@BeforeMethod()
	public void LoginApp()
	{
		FB.EnterEmail();
		
	}

	{
		
	}
	@Test
	public void getTitle()
	{
	
	}
	
	@AfterMethod()
	public void LogoutFromApp()
	{
		
	}
	
	@AfterClass()
	public void CloseBrowser()
	{	
	
		
	}

}
