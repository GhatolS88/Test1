
package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Insurance_Logine
{	
	       //POM-1
	//1. Data members/Global Variables should be declared globally with access level private by using @findby Annotation
	  @FindBy(xpath="//input[@id='email']" )       private  WebElement   Email; //private WebElement Email=driver.findElement(By.xpath(//input[@id='email']"))
	  @FindBy(xpath="//input[@id='password']")     private   WebElement   Password;//private WebElement  password=driver.findElement(By.xpath("//input[@id='password']"));
	  @FindBy(xpath="//input[@type='submit']")     private   WebElement   Loginbt;//private WebElement Loginbt=driver.findElement(By.xpath(//input[@type='submit']"));
	   
	 //2. Initialize within a constructor with access level public using pagefactory
    public  Insurance_Logine(WebDriver  Driver)
    {
    	PageFactory.initElements(Driver,this); //pagefactory is bydefault class its initElement is static method is use driver and this keyword for convertion
    }
  //3. Utilize within a method with access level public
    public void EnterEmail(String EmailAddress)
    {
    	Email.sendKeys(EmailAddress);
    }
    public void EnterPassword(String password)
    {
    	Password.sendKeys( password);
    }
    public void ClickLoginbtn()
    {
    	Loginbt.click();
    }

}
