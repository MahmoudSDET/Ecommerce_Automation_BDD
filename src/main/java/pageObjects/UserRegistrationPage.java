package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPage extends PageBase 
{
	public UserRegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="gender-male")
	WebElement genderRdoBtn ; 
	
	@FindBy(id="FirstName")
	WebElement fnTxtBox; 
	
	@FindBy(id="LastName")
	WebElement lnTxtBox ; 
	
	@FindBy(id="Email")
	WebElement emailTxtBox ; 
	
	@FindBy(id="Password")
	WebElement passwordTxtBox ; 
	
	@FindBy(id="ConfirmPassword")
	WebElement confirmPasswordTxtBox ; 
	
	@FindBy(id="register-button")
	WebElement registerBtn ; 
	
	@FindBy(css="div.result")
	public WebElement successMessage ; 
	
	@FindBy(css="a.ico-logout")
	public WebElement logoutLink; 
	
	@FindBy(linkText="My account")
	WebElement myAccountLink; 
	
	@FindBy(xpath = "//form[@method='post']/div/ul/li")
	WebElement AccountAlreadyExist; 
	public void userRegistration(String firstName , String lastName , String email , String password) 
	{
		clickButton(genderRdoBtn);
		setTextElement(fnTxtBox, firstName);
		setTextElement(lnTxtBox, lastName);
		setTextElement(emailTxtBox, email);
		setTextElement(passwordTxtBox, password);
		setTextElement(confirmPasswordTxtBox, password);
		clickButton(registerBtn);
	}
	
	
	
	
	public String  getMessageTXTOfEmailExits() 
	{
		String messageText=getTextElement(AccountAlreadyExist);
		return messageText;
	 
	}
	
}
