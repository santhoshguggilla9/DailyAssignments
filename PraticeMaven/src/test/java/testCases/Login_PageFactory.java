package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pagefactory.LoginpagePageFactory;
import pages.Dashboard;

public class Login_PageFactory {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/login");
		
		//Creating object of Login page
		LoginpagePageFactory login = new LoginpagePageFactory(driver);

		//Enter username & password
		login.enterUsername("santhoshg");
		login.enterPassword("Vishu@23");

		//Click on login button
		login.clickLogin();
		Thread.sleep(3000);

		//Close browser instance
		//driver.quit();

	}

}
