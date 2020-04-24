package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frames {
	static WebDriver driver;
public static void main(String[] args) {
	String projectpath = System.getProperty("user.dir"); 
	System.setProperty("webdriver.chrome.driver", projectpath+"\\\\drivers\\\\Chromedriver\\\\chromedriver.exe");// can set the path to driver in environment variable
	driver= new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
//	driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
	System.out.println(driver.findElements(By.tagName("iframe")).size());
	driver.switchTo().frame(0);
	
WebElement source=	driver.findElement(By.id("draggable"));

WebElement target = driver.findElement(By.id("droppable"));
Actions a = new Actions(driver);
a.dragAndDrop(source, target).build().perform();
}
}
