package Tests;

import static org.testng.Assert.fail;

import java.io.IOException;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

public class Tests extends BaseClass {

	
	@Test
	public void TestOne() throws IOException {
		
		ExtentTest test = extent.createTest("TestOne", "Sample Test Case - TestOne");
		test.log(Status.INFO, "This step shows usage of log(status, details)");
		
		try {
		driver.get("https://www.google.com/");
		test.log(Status.PASS, "Logged to Google.com");
		
		driver.findElement(By.name("q")).sendKeys("Test Automation");
		test.log(Status.PASS, "Type Search in the text box");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		test.log(Status.PASS, "Enter ");
		
		test.log(Status.INFO, "Test One Completed");
		
		}catch (Exception e) {
			
			 test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		        
		     test.addScreenCaptureFromPath("screenshot.png");
			
			e.printStackTrace();
		}
	}
	
//	
	@Test
	@Ignore
	public void TestTwo() {
		
		try {
		//driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Test Automation");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		System.out.println("Test Completed .. ");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void loginTest() throws InterruptedException, IOException {
		
		ExtentTest test = extent.createTest("LoginTest", "Login Test - Login Test");
		test.log(Status.INFO, "This step shows usage of log(status, details)");
		
		try {
		    driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		    test.log(Status.PASS, "Logged to OrangeHRM");
		    

		    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		    test.log(Status.PASS, "Type Username");
		    
		    
		    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		    test.log(Status.PASS, "Type Password");
		    
		    driver.findElement(By.id("frmLogin")).click();
		    test.log(Status.PASS, "Click Login");
		    
		    for (int second = 0;; second++) {
		    	if (second >= 60) fail("timeout");
		    	try { if (isElementPresent(By.id("Welcome"))) break; } catch (Exception e) {}
		    	Thread.sleep(1000);
		    }
		    
		    
		    driver.findElement(By.id("welcome")).click();
		    test.log(Status.PASS, "Find Welcom");
		    
		    driver.findElement(By.id("btnLogin")).click();
		    test.log(Status.PASS, "Click Login Menu");
		    
		    driver.findElement(By.linkText("Logout")).click();
		    test.log(Status.PASS, "Click Logout");
		    
		}catch (Exception e) {
			test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("LoginTest.png").build());
	        
		     test.addScreenCaptureFromPath("screenshot.png");
			
			e.printStackTrace();
		}
		    
		    
	}
	
	  private boolean isElementPresent(By by) {
		    try {
		      driver.findElement(by);
		      return true;
		    } catch (NoSuchElementException e) {
		      return false;
		    }
	
	  }}
