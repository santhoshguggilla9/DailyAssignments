package WindowHandlesDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public static void main(String[] args) {

		WebDriver driver;

		driver = new ChromeDriver();

		driver.get("https://demoqa.com/frames");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		int count = driver.findElements(By.tagName("iframe")).size();
		System.out.println("count of frames : " +count);


		WebElement ele = driver.findElement(By.xpath("//iframe[@id='frame1']"));

		//switch to the frame
		driver.switchTo().frame(ele);


		String fText = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(fText);

		driver.close();


	}

}
