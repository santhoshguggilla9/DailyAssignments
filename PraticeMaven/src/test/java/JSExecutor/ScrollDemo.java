package JSExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScrollDemo {

	public static void main(String[] args) {
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();		
		
		driver.get("https://www.softwaretestinghelp.com/");
		
		// Scroll Down by 500 pixels
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("window.scrollTo(0,2000)");
		jsExecutor.executeScript("window.scrollBy(0,500)");
		
		// Scroll Down till the bottom of the page
		//jsExecutor.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		//move to the new webpage 
		//jsExecutor.executeScript("window.location = 'https://www.softwaretestinghelp.com/selenium-tutorial-1/'"); 
		
	}

}
