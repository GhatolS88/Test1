package POM_DDF_TestNG_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Insurance_Login_2
{	
	//POM-1
	//1. Data members/Global Variables should be declared globally with access level private by using @findby Annotation
	@FindBy(xpath="//input[@id='email']")          private WebElement Email;
    @FindBy(xpath="//input[@id='password']")       private WebElement password;
    @FindBy(xpath="//input[@name='submit']")       private WebElement Login;
    
  //2. Initialize within a constructor with access level public using pagefactory
   public  Insurance_Login_2(WebDriver  Driver)
    {
    	PageFactory.initElements(Driver, this);
    }
   //utilize within a method access level public
    public void EnterEmail(String  EmailAddress)
    {
    	Email.sendKeys(EmailAddress);
    }
    public void Enterpassword(String Password)
    {
    	password.sendKeys(Password);
    }
    public void ClickLogin()
    {
    	Login.click();
    }
    
}
