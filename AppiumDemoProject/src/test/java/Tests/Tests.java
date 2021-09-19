package Tests;

import static org.testng.Assert.fail;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Tests extends BaseClass {

//	@Test
//	@Ignore
//	public void TestOne() {
//		
//		try {
//		driver.get("https://www.google.com/");
//		driver.findElement(By.name("q")).sendKeys("Test Automation");
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//		
//		System.out.println("Test Completed .. ");
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
//	
//	@Test
//	@Ignore
//	public void TestTwo() {
//		
//		try {
//		//driver.get("https://www.google.com/");
//		driver.findElement(By.name("q")).sendKeys("Test Automation");
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//		
//		System.out.println("Test Completed .. ");
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
	@Test
	public void loginTest() throws InterruptedException {
		
		   driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		    driver.findElement(By.id("txtUsername")).clear();
		    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		    driver.findElement(By.id("txtPassword")).clear();
		    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		    driver.findElement(By.id("frmLogin")).click();
		    
		    for (int second = 0;; second++) {
		    	if (second >= 60) fail("timeout");
		    	try { if (isElementPresent(By.id("Welcome"))) break; } catch (Exception e) {}
		    	Thread.sleep(1000);
		    }
		    
		    
		    driver.findElement(By.id("welcome")).click();
		    driver.findElement(By.id("btnLogin")).click();
		    driver.findElement(By.linkText("Logout")).click();
	}
	
	  private boolean isElementPresent(By by) {
		    try {
		      driver.findElement(by);
		      return true;
		    } catch (NoSuchElementException e) {
		      return false;
		    }
	
	  }}
