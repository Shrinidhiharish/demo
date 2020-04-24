package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Desired_Capabilities_Demo
{
public static void main(String[] args) {
String projectpath = System.getProperty("user.dir"); 
	
DesiredCapabilities caps = new DesiredCapabilities();
caps.setCapability("ignoreProtectedModeSettings", true);

System.setProperty("webdriver.ie.driver", projectpath+"\\Drivers\\IdEDriver\\IEDriverServer.exe");// can set the path to driver in environment variable
WebDriver driver = new InternetExplorerDriver();
	driver.get("http://google.com");
	driver.findElement(By.className("gLFyf gsfi")).sendKeys("make today amazing");
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	driver.close();
	driver.quit();
}
	
}
