package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_1_Logine
{	
	//POM-1
	//1. Data members/Global Variables should be declared globally with access level private by using @findby Annotation
	@FindBy(xpath="//input[@type='text']")      private WebElement  UN; //Private WebElemnt UN=Driver.findElement(By.xpath("//input[@type='text']");
	@FindBy(xpath="//input[@type='password']")  private WebElement  Password;//private webElement password=Driver.findElement(By.xpath("//input[@type='password
	@FindBy(xpath="//button[@type='submit']")   private WebElement Login;//private WebElement Login=Driver.findElement(By.xpath("//button[@type='submit']"));
	
	//1. Data members/Global Variables should be declared globally with access level private by using @findby Annotation
	public POM_1_Logine(WebDriver Driver)
	{
		PageFactory.initElements(Driver,this);  //initElement method is used to convert find an
	}
	//To pass input into UN
	public void EnterUN(String Username)
	{
		UN.sendKeys(Username);
	}
	//To pass input into password
	public void Enterpassword(String Passwd)
	{
		Password.sendKeys(Passwd);
	}
	//to click on log in
	public void ClickLoginbtn()
	{
		Login.click();
	}
	

}
