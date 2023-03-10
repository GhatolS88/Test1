package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Insurance_broker_webpage
{	
	//POM-2
	

	//1. Data members/Global Variables should be declared globally with access level private by using @findby Annotation
	
	 @FindBy(xpath="//h4[text()='saradeg41@gmail.com']")       private WebElement Signedinas;
	 @FindBy(xpath="//input[@class='btn btn-danger']")          private WebElement  Logoutbt;
	 
	//2. Initialize within a constructor with access level public using pagefactory
	public Insurance_broker_webpage(WebDriver Driver)
	 {
		 PageFactory.initElements(Driver, this);
	 }
	//Verify emailaddress
	public void VerifyEmailAddress(String ExpectedEmail)  //saradeg411@gmail.com
	{
		String  ActualEmail=Signedinas.getText();//saradeg41@gmail.com
		
		if(ExpectedEmail.equals(ActualEmail))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	public void ClickonLogoutbt()
	{
		Logoutbt.click();
	}
	
	

}
