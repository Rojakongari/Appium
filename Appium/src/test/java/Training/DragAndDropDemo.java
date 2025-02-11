package Training;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class DragAndDropDemo extends BaseTest {
	@Test
	public void DragAndDropDemoGesture() throws MalformedURLException, URISyntaxException, InterruptedException
		
		{
			driver.findElement(AppiumBy.accessibilityId("Views")).click();
			driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
			WebElement source =driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
			//drag and drop
			((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
				    "elementId", ((RemoteWebElement) source).getId(),
				    "endX", 612,
				    "endY", 561
				));
			Thread.sleep(3000);
			String result=driver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).getText();
			Assert.assertEquals(result,"Dropped!");

					
			
}
}
