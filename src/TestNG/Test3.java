package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test3 
{	
	
	@Test
	public void TC1()
	{	
		boolean    ActualResult=true;
		
		Assert.assertTrue(ActualResult);  //true
		
	
	}
	@Test
	public void TC2()
	{
		boolean   ActualResult=false;
		Assert.assertTrue(ActualResult);
	}

}
