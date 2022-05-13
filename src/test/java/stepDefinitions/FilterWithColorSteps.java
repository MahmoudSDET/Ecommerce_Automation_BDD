package stepDefinitions;

import org.testng.Assert;

import driverhandling.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DashboardMenuSectionPage;
import pageObjects.SubCategoryPage;

public class FilterWithColorSteps {
	
	
	DashboardMenuSectionPage DashboardSection=new DashboardMenuSectionPage(DriverFactory.getDriver());
	SubCategoryPage SubCategeory=new SubCategoryPage(DriverFactory.getDriver());
	
	
	@When("we select the {string} and {string}")
	public void we_select_the_and(String cat, String sub) throws InterruptedException {
	    
		DashboardSection.selectTheCategoryAndSubCategory(cat, sub);
	}

	@Then("we redirect to {string} successfully")
	public void we_redirect_to_subcategory_successfully(String SubCat) throws InterruptedException {
	
		String Actual=SubCategeory.validateTheSubCategoryPage();
		Assert.assertEquals(Actual, SubCat);
	}

	@Then("we can filter with color successfully")
	public void we_can_filter_with_color_successfully() throws InterruptedException {
		
	  int countbeforefiltering=	SubCategeory.validateTheCountOfSubCategoryProducs();
	  
	  System.out.print(countbeforefiltering);
	  SubCategeory.filterWithRedColor();
	  int countAfterfiltering=	SubCategeory.validateTheCountOfSubCategoryProducs();
	  Assert.assertNotSame(countbeforefiltering, countAfterfiltering);
	}


}
