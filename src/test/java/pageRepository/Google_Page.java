package pageRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Google_Page
{
	private static WebElement element = null;
public static WebElement textbox_Enter(WebDriver driver)
{
    element = driver.findElement(By.name("q"));
	return element;
}

public static WebElement search_button(WebDriver driver) {
	element = driver.findElement(By.name("q"));
	return element;
}
}
