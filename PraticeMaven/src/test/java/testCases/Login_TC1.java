package testCases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Dashboard;
import pages.Homepage;
import pages.Loginpage;

public class Login_TC1 {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver;
	
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		Properties prop;
		String proLoc = "C:\\Users\\santh\\git\\repository7\\PraticeMaven\\config.properties";
		
		BufferedReader reader = new BufferedReader(new FileReader(proLoc));
		prop = new Properties();
		prop.load(reader);
		
		driver.get(prop.getProperty("searchKey"));
		
		//Creating object of home page
		Homepage home = new Homepage(driver);

		//Creating object of Login page
		Loginpage login = new Loginpage(driver);

		//Creating object of Dashboard
		Dashboard dashboard = new Dashboard(driver);

		//Click on Login button
		home.clickLogin();

		//Enter username & password
		login.enterUsername(prop.getProperty("username"));
		login.enterPassword(prop.getProperty("password"));

		//Click on login button
		login.clickLogin();
		Thread.sleep(3000);


		//Capture the page heading and print on console
		System.out.println("The page heading is --- " +dashboard.getHeading());

		//Click on Logout button
		dashboard.clickLogout();

		//Close browser instance
		//driver.quit();
	}


}
