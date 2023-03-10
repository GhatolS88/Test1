package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2
{	
	@Test
	public void TC1()
	{	
		String ExpectedResult="Hello";
		String ActualResult="Hi";
		Assert.assertNotEquals(ActualResult,ExpectedResult);   //hello,hi
		
		
	}
	
		@Test                           // Test case/method
		public void TC2()
		{
			String ExpectedResult="Hi";
			String ActualResult="Hi";
			Assert.assertNotEquals(ActualResult,ExpectedResult);   //Hi,Hi
			
		}
		
	}


