package WindowHandlesDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AllLinks {

	public static void main(String[] args) {


		WebDriver driver;
		
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.lambdatest.com/blog/protractor-tutorial-handling-iframes-frames-in-selenium/");

		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		int count = alllinks.size();
		
		System.out.println("all links: " +count);
		
		for(WebElement link : alllinks)
			
			System.out.println("Link text: " +link.getText());
		
		driver.close();
		
	}

}
