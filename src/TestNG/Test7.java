package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test7
{	
	@Test
	public void TC1()
	{
		//drawback of assert class
		String S1="Hi";
		String S2="Hello";
		String S3="Goodmorning";
		
		Assert.assertNotEquals(S2, S1);  //ActualResult  ExpectedResult------>pass  //if one of the test case is fail after that no one test ex
		Assert.assertEquals(S2,S1);       //ActualResult ExpectedResult------>Fail
		Assert.assertEquals(S3,S1);      //ActualResult  ExpectedResult------>fail
		Assert.assertNotEquals(S1,S3);   //ActualResult  ExpectedResult------>pass
		
	}

}
