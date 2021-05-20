package StepForHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksDemoSteps {
	WebDriver driver=null;
	@Before(order=1)
	public void browserSetup()
	{
		System.out.println("i am in the browser setup");
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@Before(order=0)
	public void setup1()
	{
		System.out.println("i am inside the step 2");
	}
	@After(order=1)
	public void tearDown()
	{
		System.out.println("i am inside the teardown");
		driver.close();
		driver.quit();
	}
	@After(order=0)
	public void tearDown1()
	{
		System.out.println("i am inside the teardown 2");
	}
	@BeforeStep
	public void beforeSteps()
	{
		System.out.println("i am inside beforeSteps");
	}
	@AfterStep
	public void afterSteps()
	{
		System.out.println("i am inside afterSteps");
	}
	@Given("user come on the browser")
	public void user_come_on_the_browser() {
	   // System.out.println("hello");
	}

	@When("user give the username and password")
	public void user_give_the_username_and_password() {
		
		 //System.out.println("hello");
	}

	@And("user click login button")
	public void user_click_login_button() {
		 //System.out.println("hello");
	}

	@Then("user navigae to the home page")
	public void user_navigae_to_the_home_page() {
		 //System.out.println("hello");
	}

}
