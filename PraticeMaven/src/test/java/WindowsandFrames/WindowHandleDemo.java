package WindowsandFrames;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		driver = new ChromeDriver();

		//Maximizing window
		driver.manage().window().maximize();


		driver.get("https:demoqa.com/browser-windows");

		// Opening all the child window
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(3000);

		//main window handle
		String MainWindow = driver.getWindowHandle();
		System.out.println("Main window handle is " + MainWindow);
		Thread.sleep(3000);

		//To handle all new opened window
		Set<String> s1 = driver.getWindowHandles();
		System.out.println("Child window handle is" + s1);
		Thread.sleep(3000);

		Iterator<String> i1 = s1.iterator();

		//	Here we will check if child window has other child windows and when child window
		//	is the main window it will come out of loop.
		while (i1.hasNext()) {
			String ChildWindow = i1.next();

			if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				
				WebElement gettext = driver.switchTo().window(ChildWindow).findElement(By.xpath("//*[@id=\"sampleHeading\"]"));
				String text = gettext.getText();
				System.out.println(text);

			}

		}
}
}