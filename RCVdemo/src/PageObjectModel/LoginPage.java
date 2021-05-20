package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(name="userName") 
	WebElement textusername;
	
	@FindBy(name="password")
	WebElement textpassword;
	
	@FindBy(name="submit")
	WebElement btn;
	
	public void setUserName(String uname)
	{
		textusername.sendKeys(uname);
	}
	public void setPassword(String pwd)
	{
		textpassword.sendKeys(pwd);
	}
	public void clickSubmit()
	{
		btn.click();
	}

}
