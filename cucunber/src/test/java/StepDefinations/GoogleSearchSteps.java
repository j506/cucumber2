package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	WebDriver driver=null;
	@Given("browser is open")
	public void browser_is_open() {
	   System.out.println("inside step:browser is open");
	   String projectpath=System.getProperty("user.dir");
	   System.out.println("project path is"+projectpath);
	   System.setProperty("webdriver.chrome.driver", projectpath+"\\src\\test\\resources\\drivers\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	@And("user is on googlesearch page")
	public void user_is_on_googlesearch_page() throws InterruptedException {
       System.out.println("inside step:user is on the google search page");
       driver.navigate().to("https://www.google.com/");
       
	}

	@When("user enters a text in searchbox")
	public void user_enters_a_text_in_searchbox() throws InterruptedException {
	    System.out.println("inside step:users enters the text in the google search box");
	    driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
	    
	}

	@And("hits enters")
	public void hits_enters() {
	    System.out.println("hitts enters");
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigating to the search results")
	public void user_is_navigating_to_the_search_results() {
	   System.out.println("inside step:user is nevigate to the search results");
	   driver.getPageSource().contains("Online Courses");
	   driver.close();
	   driver.quit();
	}


}
