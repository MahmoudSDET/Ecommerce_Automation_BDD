package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase
{
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="Email")
	WebElement emailTxtBox ; 

	@FindBy(id="Password")
	WebElement passwordTxtBox ; 

	@FindBy(css="button[class='button-1 login-button']")
	WebElement loginBtn ;
	
	
	@FindBy(xpath ="//span[@class='forgot-password']/a")
	WebElement forgetPasswordLink ;
	
	public void UserLogin(String email , String password) 
	{
		setTextElement(emailTxtBox, email);
		setTextElement(passwordTxtBox, password);
		clickButton(loginBtn);
	}

	public void clickonForgetPassword() 
	{
		
		clickButton(forgetPasswordLink);
	}
	
}
