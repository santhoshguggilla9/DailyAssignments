package Sel4Features;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators {
	public static void main(String args[])
	{
		WebDriver driver;

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

		driver.get("https://www.browserstack.com/");

		WebElement appLive = driver.findElement(By.className("product-section__content-cards"));
		WebElement getADemo = driver.findElement(RelativeLocator.with(By.tagName("button")).above(appLive));
		getADemo.click();

		driver.quit();
	}

}
