package testRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentRports_Basics_Demo {

	
private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		ExtentHtmlReporter htmlreporter = new ExtentHtmlReporter("extentreports.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
		
		ExtentTest test = extent.createTest("google search test one" ,"this is a test to validate google searchfunctionality");
		
		String projectpath = System.getProperty("user.dir"); 
		System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers\\Chromedriver\\chromedriver.exe");
		

		driver= new ChromeDriver();
		test.log(Status.INFO, "Starting test case");
		
		driver.get("http://google.com");
		test.pass("Navigated to google.com");
		
		driver.findElement(By.name("q")).sendKeys("make today amazing");
		test.pass("Entered text in searchbox");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		test.pass("Pressed keyboard enter key");

		
		driver.close();
		driver.quit();
		test.pass("Closed the browser");
		
		test.info("Test completed");
		
		
		ExtentTest test2 = extent.createTest("google search test one" ,"this is a test to validate google searchfunctionality");
		
		driver= new ChromeDriver();
		test2.log(Status.INFO, "Starting test case");
		
		driver.get("http://google.com");
		test2.pass("Navigated to google.com");
		
		driver.findElement(By.name("q")).sendKeys("make today amazing");
		test2.pass("Entered text in searchbox");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		test2.fail("Pressed keyboard enter key");

		
		driver.close();
		driver.quit();
		test.pass("Closed the browser");
		
		
		extent.flush();
		

		


	}

}
