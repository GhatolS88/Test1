package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POM_Insurance_TestNG_TestClass extends TestNg_BaseClass
{	
	//public WebDriver Driver;
	//initializeBrowser()
	
	Insurance_Login_2 Login;                 //global variable
    Insurance_broker_signout Broker;          //global variable
    int TestCaseID;
	
	@BeforeClass
	public void OpenBrowser()
	{
		InitializedBrowser();            //nonstatic method call in nonstatic method by methodname;
		
		//create object of POM-I class
		
	   Login=new  	  Insurance_Login_2(Driver);
		  
		//create class of POM-II class
		  
	    Broker=new   Insurance_broker_signout(Driver);
	}
    
	@BeforeMethod
	public void  loginToApp() throws IOException
	{	
		//to reach upto prpert
		Login.EnterEmail(TestNG_UtilityClass.getDataFromPF("EM"));	//saradeg41@gmail.com
		Login.Enterpassword(TestNG_UtilityClass.getDataFromPF("PSW")); //Sai@1117
		Login.ClickLogin();
	}
	
	@Test (priority=1)                //Testcase/method
	public void VerifyEmailaddress() throws EncryptedDocumentException, IOException
	{
		  TestCaseID=100;
		//verify Email Address
		 String   ActualEmail=Broker.getEmail();  //saradeg41@gmail.com
	     String	ExpectedEmail=TestNG_UtilityClass.getDataFromExcelsheet(2,0);
	     Assert.assertEquals(ActualEmail,ExpectedEmail);
		
	}
	
	@Test(priority=2)
	public void VerifyTitle() throws EncryptedDocumentException, IOException
	{
		TestCaseID=101;
		String  ActualTitle=Driver.getTitle();  // Insurance Broker System
		String  ExpectedTitle=TestNG_UtilityClass.getDataFromExcelsheet(3,0);
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		
	}
	@AfterMethod
	public void LogoutFromApp(ITestResult Result) throws IOException
	{
		   //Fail              //Fail
		if(Result.getStatus()==ITestResult.FAILURE)
		{
			TestNG_UtilityClass.CaptureScreenshot(Driver,TestCaseID);  //101
		}
		Broker.Logoutbt();
		
	}
	@AfterClass
	public void CloseBrowser()
	{
		Driver.close();
	}
}
