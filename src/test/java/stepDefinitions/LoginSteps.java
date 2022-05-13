package stepDefinitions;

import org.testng.Assert;

import driverhandling.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DashboardMenuSectionPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class LoginSteps {
	
	
	private HomePage homeObject = new HomePage(DriverFactory.getDriver());
	private  LoginPage loginObject = new LoginPage(DriverFactory.getDriver());
	private  DashboardMenuSectionPage  dashboardMenueSecObject=new DashboardMenuSectionPage(DriverFactory.getDriver());
	
	@When("I click on login link")
	public void i_click_on_login_link() {
	    // Write code here that turns the phrase above into concrete actions
		homeObject.openLoginPage();
	}

	@When("I entered  {string} , {string}")
	public void i_entered(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		
		loginObject.UserLogin(username, password);
	    
	}
	@Then("The user is logged in successfully")
	public void the_user_is_logged_in_successfully() throws InterruptedException {
		
		boolean ActualResults=dashboardMenueSecObject.checkCustomerIsLoggedSuccessfully();
		
		Assert.assertTrue(ActualResults);

	}

}
