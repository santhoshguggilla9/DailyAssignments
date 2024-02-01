package classRobotDemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DemoRobotClass {

	public static void main(String[] args) throws AWTException {

		WebDriver driver;
	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		

		//Navigate to the demo site
		driver.get("https://demoqa.com/upload-download");

		//find WebElement for Upload btn
		//driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\Users\\santh\\Downloads\\photos.jpg");
		
		WebElement btnUpload =  driver.findElement(By.xpath("//input[@id='uploadFile']"));

		Actions  click = new Actions(driver);
		click.moveToElement(btnUpload).click().perform();

		Robot kbHit = new Robot(); 
		kbHit.delay(3000);

		// Copying file to clipboard
		StringSelection strToObj = new StringSelection("C:\\Users\\santh\\Downloads\\photos.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strToObj, null);

		// performing control+v 
		kbHit.keyPress(KeyEvent.VK_CONTROL);
		kbHit.keyPress(KeyEvent.VK_V);
		kbHit.delay(3000);
		
		kbHit.keyRelease(KeyEvent.VK_CONTROL);
		kbHit.keyRelease(KeyEvent.VK_V);
		
		
		//Performing Enter Key
		kbHit.keyPress(KeyEvent.VK_ENTER);
		kbHit.keyRelease(KeyEvent.VK_ENTER);

	}

}
