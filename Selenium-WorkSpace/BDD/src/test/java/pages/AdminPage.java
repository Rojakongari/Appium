package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
WebDriver driver;

@FindBy(xpath="//*[text()='Admin']")
public WebElement Admin;

@FindBy(xpath="//*[text()='Job ']")
public WebElement verifyAdminpage;

public AdminPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}

public void clickOnAdmin()
{
	Admin.click();
}

public void Adminpageverify()
{
	verifyAdminpage.isDisplayed();
}
}
