package pageObjects;

import org.openqa.selenium.By.ByXPath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DashboardMenuSectionPage extends PageBase {
	
	
	public DashboardMenuSectionPage(WebDriver driver) {
		super(driver);
		action=new Actions(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(css="a.ico-logout")
	public WebElement logoutLink; 
	
	@FindBy(linkText="My account")
	WebElement myAccountLink; 
	
	@FindBy(xpath="//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']")
	WebElement ElectronicsCategory; 
	
	
	@FindBy(xpath="//ul[@class='top-menu notmobile']/li")
	List <WebElement> Category; 
	
	@FindBy(xpath="//ul[@class='top-menu notmobile']/li/ul/li")
	List <WebElement> SubCategory; 
	
	public void userLogout() 
	{
		clickButton(logoutLink);
	}
	
	public void openMyAccountPage() 
	{
		clickButton(myAccountLink);
		//ElectronicsCategory.findElement(By.xpath("/following-sibling::ul[@class='sublist first-level']")).
	}
	
	public boolean checkCustomerIsLoggedSuccessfully() 
	{
		boolean checkedLogged=checkElementIsPresent(logoutLink);
		return checkedLogged;
	}

	public void selectTheCategory() throws InterruptedException {
	  
		action.moveToElement(ElectronicsCategory).perform();
	}
	
	
	public void selectTheCategoryAndSubCategory(String category,String subcategory) throws InterruptedException {
		  
		for(WebElement el:Category) {
			
			
			
	      action.moveToElement(el.findElement(By.xpath("//a[normalize-space()='"+category +"']"))).perform();
	      	
			for(WebElement el2:SubCategory) {
				
			
		     action.moveToElement(el2.findElement(By.xpath("//a[normalize-space()='"+subcategory+"']"))).click().perform();  
		        break;
			}
			
			break;
			
		}
	}
}
