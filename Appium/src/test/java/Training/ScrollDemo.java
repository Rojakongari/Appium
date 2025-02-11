package Training;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class ScrollDemo extends BaseTest{
	
@Test
public void ScrollDemoGesture() throws MalformedURLException, URISyntaxException, InterruptedException
	
	{
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		//uiAutomator when know where to scroll
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
		
		//scrollWithco-ordinates
	/*	boolean canScrollMore;
		do
		{
		canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			    "left", 100, "top", 100, "width", 200, "height", 200,
			    "direction", "down",
			    "percent", 3.0
			));
		}
		while(canScrollMore);
		*/
		
		//call from Basetest
		
		ScrollToEndAction();
		

}
}
