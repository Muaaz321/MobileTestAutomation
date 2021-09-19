package Tests;

import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

	AppiumDriver<MobileElement> driver;
	
	
	@BeforeTest
	public void setup() {
		
		try {
			
		
		DesiredCapabilities caps = new DesiredCapabilities();
		//caps.setCapability("platformName", "");
		//caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability(MobileCapabilityType.VERSION, "11");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy A10s");
		caps.setCapability(MobileCapabilityType.UDID, "R9WMB0H9K8J");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		
		//caps.setCapability(MobileCapabilityType.APP, "");
		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		
		
	    URL url = new URL("http://127.0.0.1:4723/wd/hub");
	    driver = new AppiumDriver<MobileElement>(url,caps);
	    
	    //driver = new AndroidDriver<MobileElement>(url,caps);
	    //driver = new IOSDriver<MobileElement>(url,caps);
		}
	    
	    catch (Exception e) {
	    		System.out.println(e.getCause());
	    		System.out.println(e.getMessage());

		}
		
	}
	
	@Test
	public void sampleTest() {
		System.out.println("I am inside = " + Class.class.getName().toString());
	}
	
	@AfterSuite
	public void testdown() {
		
		driver.close();
		driver.quit();
			
	}
}
