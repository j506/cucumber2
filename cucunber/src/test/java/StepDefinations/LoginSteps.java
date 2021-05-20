package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	

	@Given("user is login page")
	public void user_is_login_page() {
		System.out.println("inside step-user is on the login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("inside step-user enters username and passwords");
	}

	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("inside step-user click on login button");
	}

	@Then("user is nevigated to the home page")
	public void user_is_nevigated_to_the_home_page() {
		System.out.println("inside step-user is navigating to the homepage");
	}
}