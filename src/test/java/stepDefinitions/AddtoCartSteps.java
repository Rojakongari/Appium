package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddToCart_Page;
import pages.LoginPage;

public class AddtoCartSteps {
	WebDriver driver=null;
	LoginPage loginpage_PF;
	AddToCart_Page addtocartpage_PF;
	
	@Given("Launch page")
	public void launch_page() throws InterruptedException {
		String Projectpath=System.getProperty("user.dir");
		System.setProperty("WebDriver.Chrome.driver",Projectpath+"/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);	 
	}
	
	@When("^user enter (.*) and (.*) credentials$")
	public void user_enter_username_and_password_credentials(String username,String password) 
	{
		loginpage_PF=new LoginPage(driver);
		loginpage_PF.enterusername(username);
		loginpage_PF.enterpassword(password);
	}
	

	@And("give click on login button")
	public void give_click_on_login_button() throws InterruptedException {
		loginpage_PF=new LoginPage(driver);
		loginpage_PF.clickloginbutton();
		Thread.sleep(2000);
	   	}
	

	@Then("Navigate to  Homepage")
	public void navigate_to_homepage() {
		loginpage_PF=new LoginPage(driver);
		loginpage_PF.verifyhomepage();
	}
	
	@Then("Click on selected product")
	public void click_on_selected_product()
	{
		addtocartpage_PF = new AddToCart_Page(driver);
		addtocartpage_PF.clickOnselectedproduct();
		
	   }
	
	@Then("Add product to cart")
	public void add_product_to_cart()
	{
		addtocartpage_PF = new AddToCart_Page(driver);
		addtocartpage_PF.clickOnAddToCart();
	}
	
	@Then("Verify product in cart")
	public void verify_product_in_cart() 
	{
		addtocartpage_PF = new AddToCart_Page(driver);
		addtocartpage_PF.clickOnCart();
	    
	}
	
}
