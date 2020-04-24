package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {
	static WebDriver driver;
public static void main(String[] args) {

	String projectpath = System.getProperty("user.dir"); 
	System.setProperty("webdriver.chrome.driver", projectpath+"\\drivers\\Chromedriver\\chromedriver.exe");// can set the path to driver in environment variable
	driver= new ChromeDriver();
	driver.get("https://www.amazon.com/");
	Actions actions =new Actions(driver);
//	
	actions.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Hello").doubleClick().build().perform();
	WebElement mousehour = driver.findElement(By.id("nav-link-accountList"));
	actions.moveToElement(mousehour).contextClick().build().perform();
	

}
	
	
	
}
