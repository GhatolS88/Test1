package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1
{	
	@Test                          //Testcase/method
	public void TC1()
	{
		String ExpectedResult="Hi";
		String ActualResult="Hi";
		Assert.assertEquals(ActualResult, ExpectedResult);
	}
	
	@Test                      //Testcase/method
	public void TC2()
	{
		String ExpectedResult="Hello";
		String ActualResult="Hi";
		Assert.assertEquals(ActualResult,ExpectedResult);
	}

}
