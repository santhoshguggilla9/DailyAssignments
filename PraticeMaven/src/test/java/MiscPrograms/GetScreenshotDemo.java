package MiscPrograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetScreenshotDemo {

	public static void main(String[] args) throws IOException {
		WebDriver driver;
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		//Navigate to the demo site
		driver.get("https://demoqa.com/text-box");

		// Capturing screenshot and saved as a File
		File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshots/img1.jpg");

		FileUtils.copyFile(sourceFile, destFile);
		System.out.println("Screenshot saved successfully");

		// Capturing screenshot and saved as a File
//		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
//		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
//		File destFile = new File("./Screenshots/img1.jpg");
//		FileUtils.copyFile(sourceFile, destFile);
//		System.out.println("Screenshot saved successfully");

		driver.quit();
	}

}
