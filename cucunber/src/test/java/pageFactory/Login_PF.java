package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Login_PF {
	@FindBy(id="name")
	@CacheLookup
	WebElement txt_username;
	@FindBy(id="password")
	@CacheLookup
	WebElement txt_password;
	@FindBy(id="login")
	@CacheLookup
	WebElement btn_login;
	WebDriver driver;
	public Login_PF(WebDriver driver)
	{
		this.driver=driver;
		AjaxElementLocatorFactory factory=new AjaxElementLocatorFactory(driver,30);
		PageFactory.initElements( factory,this);
	}
	
	public void enterUsername(String username)
	{
		txt_username.sendKeys(username);
	}
	public void enterPassword(String password)
	{
		txt_password.sendKeys(password);
	}
	public void clickOnLogin()
	{
		btn_login.click();
	}

}
