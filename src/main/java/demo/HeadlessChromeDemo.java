package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeDemo 
{
public static void main(String[] args) {
	test();
}
	public static void test() {
		
		String projectpath = System.getProperty("user.dir"); 
		System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers\\Chromedriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--Headless");
		options.addArguments("window-size=1366,768");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("make today amazing");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.close();
		driver.quit();
		System.out.println("completed");
		
	}
	
}
