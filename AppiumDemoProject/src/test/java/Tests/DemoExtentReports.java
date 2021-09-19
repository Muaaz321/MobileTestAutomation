package Tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class DemoExtentReports {

	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	
	@BeforeSuite
	public void reportSetUp() {
		
		 // start reporters
		htmlReporter = new ExtentHtmlReporter("extent.html");
    
        // create ExtentReports and attach reporter(s)
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
		
	}
	
	
	@AfterSuite
	public void reportTearDown() {
		
		extent.flush();
	}
	
}
