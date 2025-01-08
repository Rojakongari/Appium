package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver driver;

@FindBy(xpath="//input[@placeholder='Username']")
public WebElement txt_username;

@FindBy(xpath="//input[@placeholder='Password']")
public WebElement txt_password;

@FindBy(xpath="//input[@type='submit']")
public WebElement login_button;

@FindBy(xpath="//*[@class='header_label']")
public WebElement verifyhomepage;

public LoginPage(WebDriver driver)
{
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

public void enterusername(String username)
{
	txt_username.sendKeys(username);
}
public void enterpassword(String password)
{
	txt_password.sendKeys(password);
	
}
public void clickloginbutton()
{
	login_button.click();
}

public void verifyhomepage()
{
	verifyhomepage.isDisplayed();
}
}
