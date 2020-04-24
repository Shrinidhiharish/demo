package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIT_Demo {
public static void main(String[] args) throws IOException, InterruptedException {
	AutoitTest();
}
	public static void AutoitTest() throws IOException, InterruptedException
	{
		String projectpath = System.getProperty("user.dir"); 
		System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tinyupload.com/");
		driver.findElement(By.name("uploaded_file")).click();
		Runtime.getRuntime().exec("F:\\Selenium\\AutoIt_Fileupload_Script.exe");
	Thread.sleep(3000);
//	driver.close();
	
	}
}
