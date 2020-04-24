package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class browserTest {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.gecko.driver", "E:\\Eclipse_Projects\\seleniumFramework\\Drivers\\Geckodriver\\geckodriver.exe");		
//		WebDriver driver = new FirefoxDriver();
		
	
     	
//		System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers\\Chromedriver\\chromedriver.exe");// can set the path to driver in environment variable
//		WebDriver driver = new ChromeDriver();
		
		String projectpath = System.getProperty("user.dir"); //1 
//		System.out.println("project path" +projectpath);
		
		System.setProperty("webdriver.ie.driver", projectpath+"\\Drivers\\IdEDriver\\IEDriverServer.exe");// can set the path to driver in environment variable
		WebDriver driver = new InternetExplorerDriver();

		driver.get("https://www.seleniumhq.org/");
		Thread.sleep(2000);
		driver.close();
	}
	
}
