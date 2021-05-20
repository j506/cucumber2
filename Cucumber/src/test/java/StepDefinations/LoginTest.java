package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	@Given("user have to come on the register the page")
	public void user_is_on_registration_page() {
	    System.out.println("inside step-user is on the registration page ");
	}

	@When("user fill the data before move login page")
	public void user_must_fill_proper_data_inside_the_reg() {
	   System.out.println("inside step-user have filled the data for registration ");
	}

	@And("user click the registration buttton")
	public void click_on_registration_button() {
	    System.out.println("inside step-user has clicked the registartion button ");
	}

	@Then("user go to the login page")
	public void user_is_nevigated_to_the_login_page() {
	   System.out.println("inside step-user navigate to login page   ");
	}


}
