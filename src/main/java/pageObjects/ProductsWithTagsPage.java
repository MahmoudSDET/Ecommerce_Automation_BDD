package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsWithTagsPage extends PageBase {

	public ProductsWithTagsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(xpath = "//div[@class='page-title']/h1")
	WebElement ProductWithTagewTitle;
	
	
	public String ckeckTageName() {
		
		
		String tagename=getTextElement(ProductWithTagewTitle);
		
		return tagename;
	}
}
