package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.testng.Assert;

import driverhandling.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DashboardMenuSectionPage;
import pageObjects.SearchPage;

public class SearchProductSteps {
	
	
	
	
	private SearchPage  searchPageObject=new SearchPage(DriverFactory.getDriver());;
	

	@When("he search for {string}")
	public void he_search_for(String product) {
		
		searchPageObject.ProductSearch(product);
	    
	}
	
	@Then("the product is found in search page")
	public void the_product_details_page_is_opened(DataTable productTitle) throws InterruptedException {
		
	 String ActualResults=	searchPageObject.checkProductIsPresent();
	 List<String> details = productTitle.asList(String.class);
	 assertEquals(ActualResults, details.get(0).toString());
	 
	 
	}
}
