package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
WebDriver driver;
	
	@FindBy(xpath="//input[@placeholder='Username']")
	
	public WebElement txt_username;
	
	@FindBy(name="password")
	public WebElement txt_password;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	public WebElement btn_login;
	
	@FindBy(xpath="//h6[normalize-space()='Dashboard']")
	public WebElement homepage;
	
	
	public LoginPage_PF(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
/*public void enterUsername(String username) {
		
		txt_username.sendKeys(username);
	}*/
public void enterUsername() {
		
		txt_username.sendKeys("Admin");
	}

	/*public void enterPassword(String password) {
		
		txt_password.sendKeys(password);
	}*/

public void enterPassword() {
	
	txt_password.sendKeys("admin123");
}

	public void clickLogin() {
		
	  btn_login.click();
	}
   public void homepageIsDisplayed() {
		
		homepage.isDisplayed();
	}

}
