package StepDefinitions;

import com.dietician.factory.DriverFactory;
import com.dietician.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSD {
	private LoginPage lp = new LoginPage(DriverFactory.getDriver());
	
	@Given("User is on Dietician website")
	public void user_is_on_dietician_website() {
		DriverFactory.getDriver().get("https://www.Dietician.com");
	}

	@When("User clicks account icon and selects sign in")
	public void user_clicks_account_icon_and_selects_sign_in() {
		   lp.Click_account();
		   lp.select_signin(); 
	}

	@Then("Sign in form should open")
	public void sign_in_form_should_open() {
	
	}

	@Given("User is on Sign in form")
	public void user_is_on_sign_in_form() {
	    
	}

	@When("Enters {string} and {string}")
	public void enters_and(String username, String Password) {
		
		lp.enterusername(username);
		lp.enteruserpassword(Password);
		System.out.println(username + Password);
		
		
	}

	@When("user click on signin button")
	public void user_click_on_signin_button() {
		lp.clicks_signin();
	 
	}

	@Then("navigates to home page")
	public void navigates_to_home_page() {
	    
	}


}
