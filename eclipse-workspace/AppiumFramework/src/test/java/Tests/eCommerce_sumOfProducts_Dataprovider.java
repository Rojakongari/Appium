package Tests;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import PageObjects.Android.CartPage;
import PageObjects.Android.FormPage;
import PageObjects.Android.ProductCatalogue;
import io.appium.java_client.android.Activity;
import testUtils.AndroidBaseTest;


public class eCommerce_sumOfProducts_Dataprovider extends AndroidBaseTest {
	
	@Test(dataProvider="getData" , groups = {"Smoke"})
	
	public void SumofProductsInCart(String name,String gender,String country) throws InterruptedException{
		
		//formpage declared in AndroidBaseTest
		formpage.setNameField(name);
		formpage.setGender(gender);
		formpage.setCountrySelection(country);
		//formpage.submitForm();

		/*ProductCatalogue productCatalogue =formpage.submitForm();
		//ProductCatalogue productCatalogue = new ProductCatalogue(driver);
		//-- can remove because we are instantiating from above step
		productCatalogue.addItemToCartByIndex(0);
		productCatalogue.addItemToCartByIndex(0);
		//productCatalogue.goToCartPage();
		CartPage cartPage = productCatalogue.goToCartPage();
		double totalSum = cartPage.getProductsSum();
		double displayFormattedSum = cartPage.getTotalAmountDisplayed();
		AssertJUnit.assertEquals(totalSum, displayFormattedSum);
		cartPage.acceptTermsConditions();
		cartPage.submitOrder();*/
             	
        }
	@BeforeMethod(alwaysRun=true)
	public void preSetup()
	{
	
		Activity activity = new Activity("com.androidsample.generalstore", "com.androidsample.generalstore.MainActivity");
		//driver.startActivity(activity);
		((JavascriptExecutor)driver).executeScript("mobile: startActivity", ImmutableMap.of("intent","com.androidsample.generalstore/com.androidsample.generalstore.SplashActivity"));

			
				
	}
	@DataProvider
	public Object[][] getData()
	{
		//List<HashMap<String, String>>	data =getJsonData(System.getProperty("user.dir")+"//src//test//java//org//rahulshettyacademy//testData//eCommerce.json");
	return new Object[][] { {"rahul shetty","female","Argentina"},{"shetty MR","male","Argentina"}  };
		
		
		//return new Object[][] { {data.get(0)},{data.get(1)}  };
	}
         
         
}

