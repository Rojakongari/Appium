package testUtils;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.browserstack.appium.AppiumUtils;
import com.google.common.collect.ImmutableMap;

import PageObjects.Android.FormPage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;


public class AndroidBaseTest extends AppiumUtils{
	
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	public FormPage formpage;
	
	@BeforeClass(alwaysRun=true)
	public void  configureAppium() throws MalformedURLException, URISyntaxException, InterruptedException
	{
  /* service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\rojar\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
			.withIPAddress("127.0.0.1").usingPort(4723).withTimeout(Duration.ofSeconds(300)).build();
	service.start();*/
		//Calling from Appium Utils
		service = startAppiumServer();

	
    UiAutomator2Options options = new UiAutomator2Options();
    options.setChromedriverExecutable("E:\\Drivers\\chromedriver132\\chromedriver.exe");
    options.setPlatformName("Android");
    options.setPlatformVersion("9");
	options.setDeviceName("Android9");
   // options.setUdid("222a19bb");
	options.setUdid("emulator-5554");
    options.setAutomationName("uiAutomator2");
   
   
	//options.setApp("C:\\Users\\rojar\\eclipse-workspace\\AppiumFramework\\src\\test\\java\\resources\\ApiDemos-debug.apk");
	options.setApp("C:\\Users\\rojar\\eclipse-workspace\\AppiumFramework\\src\\test\\java\\Resources\\General-Store.apk");
	
   // driver = new AppiumDriver<MobileELement>(url,cap);
    
	driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	formpage= new FormPage(driver);
	
	}
	private AppiumDriverLocalService startAppiumServer() {
		// TODO Auto-generated method stub
		return null;
	}
	@AfterClass(alwaysRun=true)
	public void tearDown()
	{
		driver.quit();
        service.stop();
		}
}
	
	