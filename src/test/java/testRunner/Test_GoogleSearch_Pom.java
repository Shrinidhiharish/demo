package testRunner;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_GoogleSearch_Pom

{
public static void main(String[] args)

{
	Google_Search();
}

public static void Google_Search()
{
	String projectpath = System.getProperty("user.dir"); 
	System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers\\Chromedriver\\chromedriver.exe");// can set the path to driver in environment variable
	WebDriver driver= new ChromeDriver();
	driver.get("http://google.com");
	driver.findElement(By.name("q")).sendKeys("make today amazing");
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	

	
	driver.close();
	System.out.println("Test Completed successfully");
	driver.quit();

}
	
}
