package testRunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageRepository.Google_Search_Page_Locators;

public class Google_Search_Page_Test 
{
	private static WebDriver driver;
public static void main(String[] args) {
	Google_Search_Test_Method();
}

public static void Google_Search_Test_Method() {
	String projectpath = System.getProperty("user.dir"); 
	System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers\\Chromedriver\\chromedriver.exe");// can set the path to driver in environment variable
	driver= new ChromeDriver();
    Google_Search_Page_Locators obj = new Google_Search_Page_Locators(driver);//craete obj for page calass
    
	driver.get("http://google.com");
	obj.Enter_Text("how to write java test cases");
	obj.Click_Button();
	
}
}
