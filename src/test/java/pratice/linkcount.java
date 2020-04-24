package pratice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkcount {
	static WebDriver driver;

	public static void main(String[] args) {
		String projectpath = System.getProperty("user.dir"); 
		System.setProperty("webdriver.chrome.driver", projectpath+"\\\\drivers\\\\Chromedriver\\\\chromedriver.exe");// can set the path to driver in environment variable
		driver= new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		System.out.println(driver.findElements(By.tagName("a")).size());

		WebElement footer = driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());
	WebElement columndriver  =	footer.findElement(By.xpath("//table//tbody//tr//td[1]//ul"));
		
	System.out.println(columndriver.findElements(By.tagName("a")).size());
	for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
	{
		String clickonlink = Keys.chord(Keys.CONTROL,Keys.ENTER);
		
		columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
	}
		Set<String> tabs=driver.getWindowHandles();
		Iterator<String> move=tabs.iterator();
		while(move.hasNext())//next index is present or not
		{
		driver.switchTo().window(move.next());//.next will move to the next index
		System.out.println(driver.getTitle());
		
	}
	}

}
