package WindowHandlesDemo;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
		
		String MainWindow = driver.getWindowHandle();
		
		Set<String> allHandles = driver.getWindowHandles();
		
		Iterator<String> itr = allHandles.iterator();
		
		while(itr.hasNext())
		{
			String childwindow = itr.next();
			
			if(!MainWindow.equalsIgnoreCase(childwindow))
			{
				//switch to the childwindow
				driver.switchTo().window(childwindow);
				driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("iamsans9@gmail.com");
				
				driver.findElement(By.name("btnLogin")).click();
				
				//closing the only child
				driver.close();
			}
		}
//		//now, switch to the main window
		driver.switchTo().window(MainWindow);
		System.out.println(driver.getTitle());
	}
}
