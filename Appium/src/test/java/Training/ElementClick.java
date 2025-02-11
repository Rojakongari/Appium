package Training;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class ElementClick extends BaseTest {
	@Test
	public void clickonElement() throws MalformedURLException, URISyntaxException, InterruptedException
	{
	//xpath--> //tagname[@attribute='value'] --- //tagnmae
	    driver.findElement(AppiumBy.accessibilityId("Preference")).click();
	    driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\'3. Preference dependencies\']")).click();
	    driver.findElement(By.id("android:id/checkbox")).click();
	    driver.findElement(By.xpath("//android.widget.ListView[@resource-id=\'android:id/list\']/android.widget.LinearLayout[2]")).click();
	    String alertTitle=driver.findElement(By.id("android:id/alertTitle")).getText();
	    Assert.assertEquals(alertTitle, "WiFi settings");
	    driver.findElement(By.id("android:id/edit")).sendKeys("RojaWifi");
	    driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
	    		 
	    
	}
	
    
	


}
