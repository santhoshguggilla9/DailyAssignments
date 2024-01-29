package config;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfigurationDriver implements ConfigParty
{
	WebDriver driver;
	public void Config() {

		this.driver = new ChromeDriver();
		
	}
	@Override
	public void getUrl(String url) {
		driver.get(url);
	}

	@Override
	public void findElements() {
		
		driver.findElement(By.xpath("//*[@id=\"popup-widget145688\"]/div/div/div[1]")).click();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement chbox = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/section/div[3]/div[2]/div/nav/div[2]/div/div[2]/div/nav/ul/li[2]/a"));
		chbox.click();
	}
	@Override
	public void closeBrowser() {
		driver.close();

	}
}
