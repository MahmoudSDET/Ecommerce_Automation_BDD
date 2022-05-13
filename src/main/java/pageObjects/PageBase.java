package pageObjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.Duration;

import java.util.Date;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {

	protected WebDriver drvier ; 
	
	public Select select ; 
	public  Actions action ; 
	protected WebDriverWait wait;
	protected JavascriptExecutor jsExecutor;
	// create constructor 
	public PageBase(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		jsExecutor = ((JavascriptExecutor) driver);
		
		
	}
	
	protected  void clickButton(WebElement element) 
	{
	
			
				this.wait.until(ExpectedConditions.elementToBeClickable(element)).click();
				
	}
	
	
	public boolean WaitUntilWebElementIsVisible(WebElement element) {
		try {
			this.wait.until(ExpectedConditions.visibilityOf(element));
			System.out.println("WebElement is visible using locator: " + "<" + element.toString() + ">");
			return true;
		} catch (Exception e) {
			System.out.println("WebElement is NOT visible, using locator: " + "<" + element.toString() + ">");
		   
			return false;
		}
	}
	protected  void setTextElement(WebElement textElement , String value) 
	{
		try {
			this.WaitUntilWebElementIsVisible(textElement);
			textElement.clear();
			textElement.sendKeys(value);
			System.out.println("Successfully Sent the following keys: '" + value + "' to element: " + "<"+ textElement.toString() + ">");
		} catch (Exception e) {
			System.out.println("Unable to locate WebElement: " + "<" + textElement.toString() + "> and send the following keys: " + value);
			
		}
	}
	
	protected  String getTextElement(WebElement textElement) 
	{
		String elementText=null;
		try {
			this.WaitUntilWebElementIsVisible(textElement);
			
			elementText=textElement.getText();
			
			System.out.println("Successfully get the following keys: '" + textElement + "' to element: " + "<"+ textElement.toString() + ">");
		
		} catch (Exception e) {
			System.out.println("Unable to locate WebElement: " + "<" + textElement.toString() + "> and get the following keys: " + elementText);
			
		}
		return elementText;
	}
	
	protected void scrollToBottom() 
	
	{
		jsExecutor.executeScript("scrollBy(0,2500)"); 
	}
	
	protected void clearText(WebElement element) 
	{
		element.clear();
	}
	protected boolean checkElementIsPresent(WebElement element) {
		boolean isElementPresent=false;
		try {
			this.WaitUntilWebElementIsVisible(element);
			
			isElementPresent=true;
			
			System.out.println("Successfully get the following keys: '" + element + "' to element: " + "<"+ element.toString() + ">");
		
		} catch (Exception e) {
			System.out.println("Unable to locate WebElement: " + "<" + element.toString() + "> and get the following keys: " + element);
			
		}
		return isElementPresent;

		
		
	}
	
	
	
	
}
