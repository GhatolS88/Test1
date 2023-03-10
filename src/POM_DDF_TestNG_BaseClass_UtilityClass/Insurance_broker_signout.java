package POM_DDF_TestNG_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Insurance_broker_signout
{	
	@FindBy(xpath="//h4[text()='saradeg41@gmail.com']")              private WebElement  SigninedAs;
	@FindBy(xpath="//input[@class='btn btn-danger']")                          private WebElement  Logout;
	
	
	public  Insurance_broker_signout(WebDriver Driver)
	{
		PageFactory.initElements(Driver, this);
	}
	
	public String getEmail()
	{
		String    ActualEmailAddress=SigninedAs.getText();  //saradeg41@gmail.com
		
		return  ActualEmailAddress;
	}
	public void Logoutbt()
	{
		Logout.click();
	}
	

}
