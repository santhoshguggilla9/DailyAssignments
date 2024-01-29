package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchPage {

	WebDriver driver;
	public GoogleSearchPage()
	{
		driver = new ChromeDriver();
		
	}
	
	By SearchBox = By.name("q");
	
	public void searchTest(String text)
	{
		driver.get("https://www.google.com");
		driver.findElement(SearchBox).sendKeys(text);
	}
	public void teardown()
	{
		driver.close();
	}
}
