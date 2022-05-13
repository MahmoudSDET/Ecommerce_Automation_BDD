package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResetPasswordPage extends PageBase {

	public ResetPasswordPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	 @FindBy(name = "Email")
	    private WebElement Email;
	 
	 @FindBy(name = "send-email")
	    private WebElement RecoverBtn;
	 
	 @FindBy(xpath = "//div[@class='bar-notification success']")
	    private WebElement RecoveringMessage;
	 @FindBy(xpath = "//span[@title='Close']")
	    private WebElement closeMessage;
	 public void enterEmail(String EmailTxt) {
		 
		 setTextElement(Email, EmailTxt);
	 }
	 
public void clickRecoverBtn() {
		 
		clickButton(RecoverBtn);
	 }
	 

public String getResetMessage() {
	 
	String RecoveringMsg=getTextElement(RecoveringMessage);
	
	return RecoveringMsg;
 }

public void closeMessage() {
	 
	clickButton(closeMessage);
 }
	 
}


