package com.stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is on login page");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
	    
	}

	@When("user enter the username and password")
	public void user_enter_the_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user enter the username and password");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    
	}

	@And("click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("click on login button");
		driver.findElement(By.name("Submit")).click();
	    
	}

	@Then("user should land the Homepage")
	public void user_should_land_the_homepage() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("users lands on homepage");
		driver.close();
	    
	}

}
