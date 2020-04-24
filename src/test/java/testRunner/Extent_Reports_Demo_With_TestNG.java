package testRunner;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extent_Reports_Demo_With_TestNG {
	ExtentHtmlReporter htmlreporter;
	ExtentReports extent;
	WebDriver driver;
	
	@BeforeSuite
	public void setUp()
	{
	  htmlreporter = new ExtentHtmlReporter("extent.html");
		 extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
		
	}
	@BeforeTest
	public void setUpTest()
	{
		String projectpath = System.getProperty("user.dir"); 
		System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers\\Chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();	
	}
	
	
	@Test
	public void test1() throws IOException
	{
		
		ExtentTest test = extent.createTest("google search test one" ,"this is a test to validate google searchfunctionality");
		driver.get("http://google.com");
        test.pass("Navigated to google.com");
		
		driver.findElement(By.name("q")).sendKeys("make today amazing");
		test.pass("Entered text in searchbox");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		test.pass("Pressed keyboard enter key");

		 // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
        
    
	}
	@AfterTest
	public void tearDownTest()
	{
	    driver.close();
		System.out.println("Test Completed successfully");
		driver.quit();

	}
	
	@AfterSuite
	public void tearDown()
	{
		 // calling flush writes everything to the log file
        extent.flush();	
	}
	
	}


