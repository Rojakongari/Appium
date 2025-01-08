package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart_Page {
	WebDriver driver;
	
	@FindBy(xpath="//*[text()='Sauce Labs Backpack']")
	public WebElement clickOnProduct;
	
	@FindBy(xpath="//*[text()='Add to cart']")
	public WebElement addtocart_product;
	
	@FindBy(xpath="//*[@class='shopping_cart_link']")
	public WebElement verifyproduct_incart;
	
	public AddToCart_Page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnselectedproduct()
	{
		clickOnProduct.click();
	}
   public void clickOnAddToCart()
   {
	   addtocart_product.click();
   }
   
   public void clickOnCart()
   {
	   verifyproduct_incart.click();
   }
   
}
