package Training;


import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class first {
	@Test
	public void  invoke() throws MalformedURLException, URISyntaxException 
	
	{
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("RojaEmulator");
		options.withBrowserName("ANDROID");
		options.setApp("C:\\Users\\91994\\eclipse-workspace\\Appium\\src\\test\\java\\resources\\ApiDemos-debug.apk");
		
		AndroidDriver driver = new AndroidDriver(new URI("http://127.0.0.1:4723/wd/hub").toURL(), options);
		 
		
	}

}
