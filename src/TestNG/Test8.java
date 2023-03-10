package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test8

{
	
		@Test
		public void TC1()
		{
			SoftAssert soft=new   SoftAssert();
			
			String  S1="Hi";
			String  S2="Hello";
			String  S3="goodMorning";
															
			soft.assertEquals(S1,S2);
			soft.assertNotEquals(S2,S1);
			soft.assertNotNull(S1,S3);
			soft.assertEquals(S3,S1);
			soft.assertAll();	
			
		}
	}


