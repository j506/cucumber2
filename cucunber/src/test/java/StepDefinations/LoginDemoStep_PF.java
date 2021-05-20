package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.HomePage_PF;
import pageFactory.Login_PF;

public class LoginDemoStep_PF {
	
	WebDriver driver=null;
	Login_PF login;
	HomePage_PF home;
	@Given("Browser is open")
	public void browser_is_open() {
		System.out.println("i am in the loginpage_pf");
		   System.out.println("inside step:browser is open");
		   String projectpath=System.getProperty("user.dir");
		   System.out.println("project path is"+projectpath);
		   System.setProperty("webdriver.chrome.driver", projectpath+"\\src\\test\\resources\\drivers\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	@And("User is on login page")
	public void user_is_on_login_page() {
		driver.navigate().to("https://example.testproject.io/web/");

	}

	@When("^User enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username,String password) {
		login=new Login_PF(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		//driver.findElement(By.id("name")).sendKeys(username);
		//driver.findElement(By.id("password")).sendKeys(password);

	}
	@And("User click on login button")
	public void user_click_on_login_button() {
		login.clickOnLogin();
		//driver.findElement(By.id("login")).click();
	  
	}


	@Then("User is navigated to homepage")
	public void user_is_navigated_to_homepage() throws InterruptedException {
		home=new HomePage_PF(driver);
		home.checkLogOutIsDisplayed();
		//driver.findElement(By.id("logout")).isDisplayed();
		
		driver.close();
		driver.quit();

	}
}
