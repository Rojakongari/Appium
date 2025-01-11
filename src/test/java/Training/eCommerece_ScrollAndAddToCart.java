package Training;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class eCommerece_ScrollAndAddToCart extends BaseTest{
	@Test
	
	public void ScrollAndAddToCart() throws InterruptedException{
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Roja");
		driver.hideKeyboard();
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
		driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
			Thread.sleep(3000);
			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"));"));
			//product names on screen
			int productCount = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();

			for(int i=0;i<productCount;i++)
				{
				String productName=driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
				if(productName.equalsIgnoreCase("Jordan 6 Rings"))
					
				{
					driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
				}
				}		
				driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
				Thread.sleep(3000);
		
	}

}
