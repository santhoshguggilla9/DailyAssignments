package todayClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotDemo {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		
		TakesScreenshot screenShot = (TakesScreenshot) driver;
		File sourceFile = screenShot.getScreenshotAs(OutputType.FILE); 
		File destFile = new File("C:\\Users\\santh\\git\\repository7\\PraticeMaven\\Screenshots\\file1.jpg")
		;
		FileUtils.copyFile(sourceFile, destFile);
		System.out.println("Screenshot captured successfully");
	}

}
