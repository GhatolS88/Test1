package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test5
{	
	@Test
	public void TC1()
	{
		 String   ActualResult=null;
		Assert.assertNull(ActualResult);  //pass having null value
	}
	
	@Test
	public void TC2()
	{
		String ActualResult="Sonali";
		
		Assert.assertNull(ActualResult); //fail 
	}

}
