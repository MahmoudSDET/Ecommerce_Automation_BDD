package stepDefinitions;

import static org.junit.Assert.assertTrue;

import driverhandling.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CategoryPage;
import pageObjects.ProductsWithTagsPage;

public class PopularTagsSteps {
	
	
	CategoryPage catPage=new CategoryPage(DriverFactory.getDriver());
	ProductsWithTagsPage ptag=new ProductsWithTagsPage(DriverFactory.getDriver());
	
	@When("we select the {string} from popular tags")
	public void we_select_the_from_popular_tags(String tagename) {
		catPage.selectTheGroupingCategoryByTageName(tagename);
	   
	}

	@Then("we can redirect to {string} successfully")
	public void we_can_redirect_to_successfully(String tage) {
	    String productwithtage=ptag.ckeckTageName();
		assertTrue(productwithtage.contains(tage));
	   
	}


}
