package testpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//		WebDriverManager.chromedriver().version("63").setup();
		//		WebDriver driver = new ChromeDriver();
		//		WebDriverManager.firefoxdriver().setup();

		String projectpath = System.getProperty("user.dir"); 
		System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers\\Chromedriver\\chromedriver.exe");// can set the path to driver in environment variable
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		WebElement textBox = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"));
		List<WebElement> listOfInputElements = driver.findElements(By.xpath("//input"));
		int count = listOfInputElements.size();
		System.out.println(count);
		textBox.sendKeys("Automation step by step");
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}
}
