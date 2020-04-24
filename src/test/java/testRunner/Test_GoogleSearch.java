package testRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageRepository.Google_Page;

public class Test_GoogleSearch

{
	
private	static WebDriver driver = null;
@BeforeTest
public void setupTest()
{
	String projectpath = System.getProperty("user.dir"); 
	System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers\\Chromedriver\\chromedriver.exe");// can set the path to driver in environment variable
   driver= new ChromeDriver();
	
}

@Test
public static void Google_Search()
{
	driver.get("http://google.com");
	
	Google_Page.textbox_Enter(driver).sendKeys("Make todayamazing");
	
	
//	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	Google_Page.search_button(driver).sendKeys(Keys.ENTER);
}

@AfterTest
public void tearDownTest()
{
    driver.close();
	System.out.println("Test Completed successfully");
	driver.quit();

}
	
}
