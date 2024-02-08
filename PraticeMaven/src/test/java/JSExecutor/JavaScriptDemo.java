package JSExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavaScriptDemo {

	public static void main(String[] args) throws InterruptedException {
				
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
				
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		
		WebElement element = (WebElement)jsExecutor.executeScript("return document.getElementById('email');");
		element.sendKeys("santhosh");
		Thread.sleep(3000);
		
		jsExecutor.executeScript("document.getElementsByName('email')[0].value='name';");
		Thread.sleep(3000);
		
		jsExecutor.executeScript("document.getElementsByClassName('inputtext')[0].value='classname';");
		Thread.sleep(3000);
		
		jsExecutor.executeScript("document.getElementsByTagName('input')[2].value='tagname';");
		Thread.sleep(3000);
		
		jsExecutor.executeScript("document.querySelector('#email').value='css';");
		Thread.sleep(3000);
		
//		jsExecutor.executeScript("document.evaluate(\"//input[@id='email']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.value='xpath';");
		
//		jsExecutor.executeScript("document.getElementsByName('login')[0].click()");
		
//		jsExecutor.executeScript("document.getElementById('email').style.border='5px red solid';");
//		Thread.sleep(3000);
//		jsExecutor.executeScript("document.getElementById('email').style.background='yellow';");
//		jsExecutor.executeScript("document.getElementById('email').setAttribute('style','border:5px red solid;background:yellow');");
		
//		jsExecutor.executeScript("window.scrollTo(0,500)");
//		Thread.sleep(3000);
//		jsExecutor.executeScript("window.scrollBy(0,500)");
//		jsExecutor.executeScript("document.getElementById('ty_footer').scrollIntoView();");
		
		WebElement username = driver.findElement(By.id("email"));
		jsExecutor.executeScript("arguments[0].setAttribute('style','border:5px red solid;background:yellow');", username);

	}

}
