package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DashboardMenuSectionPage;
import pageObjects.HomePage;
import pageObjects.UserRegistrationPage;
import util.ConfigReader;
import driverhandling.DriverFactory;

public class RegistrationSteps  {

	private HomePage homeObject = new HomePage(DriverFactory.getDriver());
	private  UserRegistrationPage  registerObject=new UserRegistrationPage(DriverFactory.getDriver());

	
	private  DashboardMenuSectionPage  dashboardMenueSecObject=new DashboardMenuSectionPage(DriverFactory.getDriver());
	

	@When("^I click on register link$")
	public void i_click_on_register_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		homeObject.openRegistrationPage();
		Assert.assertTrue(DriverFactory.getDriver().getCurrentUrl().contains("register"));
	}

	@When("^I entered \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\"$")
	public void i_entered(String firstname, String lastname, String email, String password) throws Throwable {
		
		registerObject.userRegistration(firstname, lastname,email,password);
	   
	}

	@Then("^The registration page displayed successfully$")
	public void the_registration_page_displayed_successfully() throws Throwable {
		
		
		try {
	    // Write code here that turns the phrase above into concrete actions
		
			boolean ActualResults=dashboardMenueSecObject.checkCustomerIsLoggedSuccessfully();
			
			Assert.assertTrue(ActualResults);
			
			dashboardMenueSecObject.userLogout();
			
		
	
		}catch (Exception e) {
			
			// Expected Result
			String expectedResults="email already exists";
			Assert.assertTrue(registerObject.getMessageTXTOfEmailExits().contains(expectedResults));
		}
	}

}
