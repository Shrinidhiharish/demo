package pratice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childwindows {
static WebDriver driver;
	public static void main(String[] args) {
		String projectpath = System.getProperty("user.dir"); 
		System.setProperty("webdriver.chrome.driver", projectpath+"\\\\drivers\\\\Chromedriver\\\\chromedriver.exe");// can set the path to driver in environment variable
		driver= new ChromeDriver();
		driver.get("https://accounts.google.com");
		driver.findElement(By.xpath("//*[@id=\"initialView\"]/footer/ul/li[2]/a")).click();
		System.out.println(driver.getTitle());
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parentid=it.next();
		String Childid=it.next();
		driver.switchTo().window(Childid);
		System.out.println(driver.getTitle());
		
		
		
	}
}
