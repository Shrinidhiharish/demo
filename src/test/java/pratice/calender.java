package pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {
	static WebDriver driver;
	public void calender_Handling()
	{
	String projectpath = System.getProperty("user.dir"); 
	System.setProperty("webdriver.chrome.driver", projectpath+"\\\\drivers\\\\Chromedriver\\\\chromedriver.exe");// can set the path to driver in environment variable
	driver= new ChromeDriver();
	driver.get("https://www.path2usa.com/travel-companions");
	
}
}