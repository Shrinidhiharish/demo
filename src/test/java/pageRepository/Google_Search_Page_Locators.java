package pageRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Google_Search_Page_Locators 
{
  WebDriver driver;
	By Google_Search_Text_Box = By.name("q");
	By Google_Search_Button = By.name("q");
	
	public Google_Search_Page_Locators(WebDriver driver)
	{
		this.driver = driver; //or pass different argument in constructor and say 
//		which ever driver is in this class should be same as that coming from test case class
	}
	
	public void Enter_Text(String text)
	{
		driver.findElement(Google_Search_Text_Box).sendKeys(text);
	}
	public void Click_Button()
	{
		driver.findElement(Google_Search_Button).sendKeys(Keys.ENTER);
	}
	
}

