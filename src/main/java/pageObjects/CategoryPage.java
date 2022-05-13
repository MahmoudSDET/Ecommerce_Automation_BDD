package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CategoryPage extends PageBase {
	
	@FindBy(xpath ="//div[@class='tags']/ul/li")
	List<WebElement> Tages;

	public CategoryPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		action=new Actions(driver);
	}
	
	@FindBy(xpath="//ul[@class='top-menu notmobile']/li/a[text()='Electronics ']/following-sibling::ul[@class='sublist first-level']/li[2]/a")
	WebElement ElectronicsSubCategory;
	
	public void redirectToSubCategory() {
		
		
		clickButton(ElectronicsSubCategory);
		
		
	}
	
public void selectTheGroupingCategoryByTageName(String TageName) {
		
	scrollToBottom();
	for(WebElement tag:Tages) {
		
	action.moveToElement(tag.findElement(By.xpath("//a[text()='"+TageName+"']"))).click().perform();
		
		break;
	}
		
		
	}
	
	
	
	

}
