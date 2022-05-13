package stepDefinitions;

import org.testng.Assert;

import driverhandling.DriverFactory;
import io.cucumber.java.en.Given;
import pageObjects.DashboardMenuSectionPage;
import pageObjects.SearchPage;

public class TheloggedUserOperationsSharedSteps {
	
	
	DashboardMenuSectionPage  dashboardMenueSecObject=new DashboardMenuSectionPage(DriverFactory.getDriver());
	
	
	@Given("The customer is logged in successfully")
	public void the_user_is_logged_in_successfully() throws InterruptedException {
	
		
		
		boolean ActualResults=dashboardMenueSecObject.checkCustomerIsLoggedSuccessfully();
		
		Assert.assertTrue(ActualResults);

	}

}
