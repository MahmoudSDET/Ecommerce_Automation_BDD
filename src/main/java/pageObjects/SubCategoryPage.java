package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubCategoryPage extends PageBase {

	public SubCategoryPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	@FindBy(xpath = "//div[@class='page-title']/h1")
	WebElement ProductTitle;
	
	
	@FindBy(xpath = "//*[@id=\"attribute-option-15\"]")
	WebElement Filterwithcolor;
	
	@FindBy(xpath = "//div[@class='product-item']")
	List<WebElement>SubCategoryProducts;
	
	
	
	public String checkSubCategoryIsPresent() throws InterruptedException 
	{
		
		checkElementIsPresent(ProductTitle);
		
	    String	SubCategory=getTextElement(ProductTitle);
	    
	    return SubCategory;
		
		
	}
	
	public String   validateTheSubCategoryPage() {
		
		
		String cat=getTextElement(ProductTitle).trim();
		return cat;
		
	}
	
	public int validateTheCountOfSubCategoryProducs() throws InterruptedException 
	{
		
         
	    int CountProduct=SubCategoryProducts.size();
	    
	    return CountProduct;
		
		
	}
	
	public void filterWithRedColor() throws InterruptedException {
		
		clickButton(Filterwithcolor);
		Thread.sleep(2000);
		
	}
	
	

}
