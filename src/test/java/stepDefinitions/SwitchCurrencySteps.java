package stepDefinitions;

import org.testng.Assert;

import driverhandling.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DashboardMenuSectionPage;
import pageObjects.HomePage;
import pageObjects.SearchPage;
import pageObjects.ProductDetailsPage;

public class SwitchCurrencySteps{
	
	
	private HomePage homeObject = new HomePage(DriverFactory.getDriver());
	
	private SearchPage searchPage=new SearchPage(DriverFactory.getDriver());
	
	private ProductDetailsPage detailsObject = new ProductDetailsPage(DriverFactory.getDriver()); 
	
	
	
	@When("we switch to Euro")
	public void we_switch_to_euro() {
	    
	   homeObject.changeCurrencyToEuro(); 
	}

	@Then("the price of product is switched to Euro sign")
	public void the_price_of_product_is_switched_to_euro_sign() {
	    
		searchPage.OpenProductDetailsPage();
		Assert.assertTrue(detailsObject.productPricelbl.getText().contains("€"));
	}

	@When("we switch to US Dollar")
	public void we_switch_to_us_dollar() {
	    // Write code here that turns the phrase above into concrete actions
		 homeObject.changeCurrencyToUSD();; 
	}

	@Then("the price of product is switched to Dollar sign")
	public void the_price_of_product_is_switched_to_dollar_sign() {
	    // Write code here that turns the phrase above into concrete actions
		searchPage.OpenProductDetailsPage();
		
		Assert.assertTrue(detailsObject.productPricelblDollar.getText().contains("$"));
	}


}
