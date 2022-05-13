package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.util.List;

import driverhandling.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.ResetPasswordPage;

public class ResetPasswordSteps {
	
	private LoginPage LoginObject = new LoginPage(DriverFactory.getDriver());
	private ResetPasswordPage RestPassObject = new ResetPasswordPage(DriverFactory.getDriver());
	
	@When("I click on forget password link")
	public void i_click_on_forget_password_link() throws InterruptedException {
	    
		LoginObject.clickonForgetPassword();
		
	}
	
	
	@Then("I can entered my email {string}")
	public void i_can_entered_my_email(String EmailTXT) {
	   
		RestPassObject.enterEmail(EmailTXT);
	}
	@When("I click on recover button")
	public void i_click_on_recover_button() {
		RestPassObject.clickRecoverBtn();
	}
	
	@Then("the message should be displayed as")
	public void the_message_should_be_displayed_as(DataTable ExpectedResValues) {
		
		String ActualResults=RestPassObject.getResetMessage();
		List<String> details = ExpectedResValues.asList(String.class);
		
		  assertEquals(ActualResults, details.get(0).toString());
	   
	}
	
	@When("I should close the displayed message")
	public void i_should_close_the_displayed_message() {
		RestPassObject.closeMessage();
	}

}
