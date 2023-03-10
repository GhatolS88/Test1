package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test6
{	
	@Test
	public void TC1()
	{
		String   ActualResult="Tina";
		Assert.assertNotNull(ActualResult);
	}
	
	@Test
	public void TC2()
	{
		String ActualResult="null";
		Assert.assertNotNull(ActualResult);
	}
	
	

}
