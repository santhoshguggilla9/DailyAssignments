package WindowsandFrames;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleSample {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/browser-windows");
		//driver.navigate().to("https://demoqa.com/browser-windows");
		Thread.sleep(3000);

		// Open new child window within the main window
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(3000);
		
		//Get handles of the windows
		String mainWindowHandle = driver.getWindowHandle();
		//System.out.println("Main Window handle id:" +mainWindowHandle);
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		Iterator<String> iterator = allWindowHandles.iterator();

//		while (iterator.hasNext()) {
//			String ChildWindow = iterator.next();
//			System.out.println("Child Window Handle id:" + ChildWindow);
//		}
//		// Here we will check if child window has other child windows and will fetch the heading of the child window
		while (iterator.hasNext()) {
			String ChildWindow = iterator.next();
			if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				System.out.println("Child Window Handle id:" + ChildWindow);
				WebElement text = driver.findElement(By.id("sampleHeading"));
				System.out.println("Heading of child window is " + text.getText());
				driver.close();
				System.out.println("Child windows closed.");
				
				//driver.switchTo().window(ChildWindow); it leads to "NoSuchwindowException" error
			}
		}
		driver.switchTo().window(mainWindowHandle);
		String btnText = driver.findElement(By.id("windowButton")).getText();
		System.out.println(btnText);
	}
}