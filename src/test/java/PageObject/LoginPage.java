package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rDriver)
	{
		ldriver=rDriver;

		PageFactory.initElements(rDriver, this);
	}
	
	
	@FindBy(id = "username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;

	@FindBy(id="customerKey")
	WebElement Cutomerkey;

	//@FindBy(xpath = "//button[@class='button-1 login-button']")

	@FindBy(xpath="(//a[normalize-space()='Login'])[1]")
	WebElement LoginBtn;
	
	
	@FindBy(linkText = "Logout")
	WebElement logout;

	@FindBy(xpath = "//h1[contains(text(),'CMS')]")
	WebElement Gettext;

	public void gettext()
	{
		Gettext.getText();
	}

	public void enterUsername(String Username)
	{
		username.clear();
		username.sendKeys(Username);
	}
	
	public void enterPassword(String pwd)
	{
		password.clear();
		password.sendKeys(pwd);
	}

	public void Customerkey(String key)
	{
		Cutomerkey.clear();
		Cutomerkey.sendKeys(key);
	}

	
	public void clickOnLoginButton()
	{
		LoginBtn.click();
	}
	
	public void clickOnLogOutButton()
	{
		logout.click();
	}

}
