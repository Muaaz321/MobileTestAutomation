package Tests;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Tests extends BaseClass {

	@Test
	public void TestOne() {
		
		try {
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Test Automation");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		System.out.println("Test Completed .. ");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
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
	
}
