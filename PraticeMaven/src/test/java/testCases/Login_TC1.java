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
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {

		
		Properties prop=new Properties();
		if(prop.getProperty("browser").equals("chrome"))
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
			
		String propLoc = "C:\\Users\\santh\\git\\repository7\\PraticeMaven\\config.properties";
		
		BufferedReader reader = new BufferedReader(new FileReader(propLoc));
		
		prop.load(reader);
		
		driver.get(prop.getProperty("searchKey"));
		
		Homepage home = new Homepage(driver);
		
		Loginpage login = new Loginpage(driver);
		
		Dashboard dashboard = new Dashboard(driver);
		
		home.clickLogin();
		
		login.enterUsername(prop.getProperty("username"));
		login.enterPassword(prop.getProperty("password"));
		
		login.clickLogin();
		Thread.sleep(3000);
		dashboard.clickLogout();
		
		System.out.println("Test passed!!");
		driver.quit();
		
	}


}
