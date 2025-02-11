package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	WebDriver driver;
	
	public SearchPage(WebDriver driver)
	{
	this.driver = driver;
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath=("//input[@id='twotabsearchtextbox']")) public WebElement searchbox;
	//@FindBy(xpath=("//input[@name='q']")) public WebElement searchbox;

	
	public void searchgoogle(String searchinput)
	{
		try {
			searchbox.sendKeys(searchinput);
		}
		catch(Exception e)
		{
			System.out.println("Exception caught"+ e.getMessage());
		}
	}
	

}
