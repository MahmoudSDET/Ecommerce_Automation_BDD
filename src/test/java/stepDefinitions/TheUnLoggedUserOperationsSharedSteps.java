package stepDefinitions;

import org.testng.Assert;

import driverhandling.DriverFactory;
import io.cucumber.java.en.Given;

public class TheUnLoggedUserOperationsSharedSteps {

	
	@Given("^the user in the home page$")
	public void the_user_in_the_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Assert.assertTrue(DriverFactory.getDriver().getCurrentUrl().contains("nopcommerce.com"));
		
	}
}
