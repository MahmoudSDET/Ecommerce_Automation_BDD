package stepDefinitions;

import static org.junit.Assert.assertTrue;

import org.testng.Assert;

import driverhandling.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CheckoutPage;
import pageObjects.ProductDetailsPage;
import pageObjects.SearchPage;
import pageObjects.ShoppingCartPage;


public class ShoppingCartSteps {

	private SearchPage  searchPageObject=new SearchPage(DriverFactory.getDriver());
	
	private ProductDetailsPage productDetails=new ProductDetailsPage(DriverFactory.getDriver());
	
 private ShoppingCartPage cart=new ShoppingCartPage(DriverFactory.getDriver());
 private CheckoutPage checkoutObject=new CheckoutPage(DriverFactory.getDriver());
	
	
	@When("we search for {string}")
	public void we_search_for(String productName) {
	    // Write code here that turns the phrase above into concrete actions
		
		searchPageObject.ProductSearchUsingAutoSuggest(productName);
		
		Assert.assertTrue(productDetails.productNamebreadCrumb.getText().contains(productName));
	}

	@When("choose to buy Two items")
	public void choose_to_buy_two_items() {
	    // Write code here that turns the phrase above into concrete actions
		productDetails.AddToCart();
		
	}

	@Then("moves to checkout cart and check {string}")
	public void moves_to_checkout_cart_and_check_it(String Product) {
		DriverFactory.getDriver().navigate().to("http://demo.nopcommerce.com/" + "cart");
		
	   assertTrue(DriverFactory.getDriver().getCurrentUrl().contains("cart"));
	   assertTrue(checkoutObject.getCheckoutProductName().equals(Product));
	   
	   
	    
	}

}
