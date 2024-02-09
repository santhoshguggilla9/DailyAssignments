package Sel4Features;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;


public class NewWindowFeature {
	public static void main(String args[])
	{

		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

		driver.get("https://www.google.com");
		System.out.println("title:" + driver.getTitle());

		WebDriver newDriver = driver.switchTo().newWindow(WindowType.TAB);
		newDriver.get("https://www.flipkart.com/viewcart");

		driver.quit();
	}	
}
