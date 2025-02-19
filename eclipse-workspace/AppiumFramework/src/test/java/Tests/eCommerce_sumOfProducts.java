package Tests;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import PageObjects.Android.CartPage;
import PageObjects.Android.FormPage;
import PageObjects.Android.ProductCatalogue;
import testUtils.AndroidBaseTest;


public class eCommerce_sumOfProducts extends AndroidBaseTest {
	@Test
	
	public void SumofProductsInCart() throws InterruptedException{
		
		//formpage declared in AndroidBaseTest
		formpage.setNameField("RojaRamani");
		formpage.setGender("female");
		formpage.setCountrySelection("Argentina");
		//formpage.submitForm();

		ProductCatalogue productCatalogue =formpage.submitForm();
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
		cartPage.submitOrder();
             	
        }
    	
         
         
}

