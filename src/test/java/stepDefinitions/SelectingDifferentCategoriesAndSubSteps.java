package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.util.List;

import driverhandling.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CategoryPage;
import pageObjects.DashboardMenuSectionPage;
import pageObjects.SubCategoryPage;

public class SelectingDifferentCategoriesAndSubSteps {

	private  DashboardMenuSectionPage  dashboardMenueSecObject=new DashboardMenuSectionPage(DriverFactory.getDriver());
    private CategoryPage cat=new CategoryPage(DriverFactory.getDriver());
    
    private SubCategoryPage subcategory=new SubCategoryPage(DriverFactory.getDriver());
    		
	@When("we select the other category like Electronics from dashboard menu section")
	public void we_select_the_other_category_from_dashboard_menu_section() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		dashboardMenueSecObject.selectTheCategory();
	   
	}

	@When("we click the subcategory cells phones")
	public void we_select_the_sub_category_if_found() {
	    // Write code here that turns the phrase above into concrete actions
		cat.redirectToSubCategory();
	}

	@Then("redirection to the category and sub category is successfully")
	public void redirection_to_the_category_and_sub_category_is_successfully(DataTable Dt) throws InterruptedException {
	  String actual=	subcategory.checkSubCategoryIsPresent();
	  List<String> details = Dt.asList(String.class);
	  
	  assertEquals(actual, details.get(0).toString());
	   
	}
	
	
}
