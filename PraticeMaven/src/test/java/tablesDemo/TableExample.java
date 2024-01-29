package tablesDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {

	public static void main(String[] args) {
		
		WebDriver driver;

		driver = new ChromeDriver();

		driver.get("https://afd.calpoly.edu/web/sample-tables"); 
		driver.manage().window().maximize();

		String value = driver.findElement(By.xpath("//*[@id=\"content\"]/table[1]/tbody/tr[3]/td[1]")).getText();
		
		System.out.println("the value: " +value);
	}

}
