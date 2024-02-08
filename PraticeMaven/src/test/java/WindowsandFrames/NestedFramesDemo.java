package WindowsandFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class NestedFramesDemo {

	public static void main(String[] args) {
		
		WebDriver driver;
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		//it deleted the saved cookies
		driver.manage().deleteAllCookies();
		
		driver.get("https://demoqa.com/nestedframes");
		
//		WebElement pageHeadingElement=driver.findElement(By.xpath("//div[@class='main-header']"));
//		String pageHeading=pageHeadingElement.getText();
//		
//		System.out.println("Page Heading is :" + pageHeading);
		
				//Switch to Parent frame
				WebElement frame1=driver.findElement(By.id("frame1"));
				driver.switchTo().frame(frame1);
				
				WebElement frame1Element= driver.findElement(By.tagName("body"));
				String frame1Text=frame1Element.getText();
				System.out.println("Frame1 is :" + frame1Text);

				//Switch to child frame
				driver.switchTo().frame(0);
				WebElement frame2Element= driver.findElement(By.tagName("p"));
				String frame2Text=frame2Element.getText();
				System.out.println("Frame2 is :"+frame2Text);

				//Switch to default content - is used to switch to main page
				driver.switchTo().defaultContent();
				
				//Try to print the heading of the main page without swithcing
				WebElement mainPageText=driver.findElement(By.xpath("//*[@id='framesWrapper']/div[1]"));
				System.out.println(mainPageText.getText());
				
				driver.close();
	}

}
