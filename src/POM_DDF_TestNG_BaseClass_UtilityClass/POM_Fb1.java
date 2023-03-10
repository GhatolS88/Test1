package POM_DDF_TestNG_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Fb1 
{	
	@FindBy(xpath="//input[@id='email']")         private WebElement Email;
	
	public POM_Fb1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterEmail(String EmailAddress)
	{
		Email.sendKeys( EmailAddress);
	}
	

}
